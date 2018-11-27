package com.whp.demo.thrift.helloThrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

public class HelloServiceServer {
    public static void main(String[] args){
        System.out.println("服务端开启...");
        TProcessor tProcessor = new Hello.Processor<Hello.Iface>(new HelloServiceImpl());
        TServerSocket serverTransPort = null;
        try {
            serverTransPort = new TServerSocket(9898);
            TServer.Args tArgs = new TServer.Args(serverTransPort);
            tArgs.processor(tProcessor);
            tArgs.protocolFactory(new TBinaryProtocol.Factory());
            TServer server = new TSimpleServer(tArgs);
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}
