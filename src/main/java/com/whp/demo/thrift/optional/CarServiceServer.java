package com.whp.demo.thrift.optional;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.*;

import java.io.IOException;

public class CarServiceServer {
    public static void main(String args[]){
        TProcessor tProcessor = new CarService.Processor<CarService.Iface>(new CarServiceImpl());
        try(TNonblockingServerTransport transport = new TNonblockingServerSocket(9999)){
            TThreadedSelectorServer.Args arg = new TThreadedSelectorServer.Args(transport);
            arg.processor(tProcessor);
            arg.protocolFactory(new TBinaryProtocol.Factory());
            arg.transportFactory(new TFramedTransport.Factory());

            TServer server = new TThreadedSelectorServer(arg);
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}
