package com.whp.demo.thrift.helloThrift;

import org.apache.thrift.TException;

public class HelloServiceImpl implements Hello.Iface {
    public String hello(String para) throws TException {
        return "Hello " + para;
    }
}
