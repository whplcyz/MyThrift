package com.whp.demo.thrift.optional;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.*;

import java.io.IOException;

public class CarServiceClient  {
    public static void main(String args[]){
        try(TTransport transport = new TFramedTransport(new TSocket("localhost", 9999))){
            TProtocol tProtocol = new TBinaryProtocol(transport);
            CarService.Client client = new CarService.Client(tProtocol);
            Car car = new Car();
            car.carName = "BMW";
            car.carId = 110;
            car.price = 1000000;
            car.setAgeIsSet(true);
            Consumer consumer = new Consumer();
            consumer.consumerId = 111;
            consumer.name = "whp";

            transport.open();
            Order order = client.createBuyCarOder(car, consumer);
            System.out.println(order);
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}
