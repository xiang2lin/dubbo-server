package com.xiang.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * xiang 2018/6/14
 **/
public class TestCluster1 {
    public static void main(String[] args) throws IOException {
        //加载配置文件
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("META-INF/spring/dubbo-cluster1.xml");
        // 启动   发布服务
        context.start();
        //阻塞当前线程
        System.in.read();
    }
}
