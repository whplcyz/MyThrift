package com.whp.demo.thrift.optional;

import org.apache.thrift.TException;

public class CarServiceImpl implements CarService.Iface {
    @Override
    public Order createBuyCarOder(Car car, Consumer consumer) throws TException {
        Order order = new Order();
        order.setOrderId(1110);
        order.setCar(car);
        order.setConsumer(consumer);
        return order;
    }
}
