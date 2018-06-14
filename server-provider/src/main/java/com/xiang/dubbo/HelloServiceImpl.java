package com.xiang.dubbo;

/**
 * xiang 2018/6/14
 **/
public class HelloServiceImpl implements  IHelloService {
    @Override
    public String sayHello(String msg) {
        return "Hello"+msg;
    }
}
