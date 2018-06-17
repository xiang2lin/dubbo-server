package com.xiang.dubbo;

/**
 * xiang 2018/6/14
 **/
public class HelloService2Impl implements  IHelloService {
    @Override
    public String sayHello(String msg) {
        return "Hello2Service"+msg;
    }
}
