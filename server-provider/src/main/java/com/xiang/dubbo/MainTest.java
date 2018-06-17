package com.xiang.dubbo;

import com.alibaba.dubbo.container.Main;

/**
 * xiang 2018/6/16
 **/
public class MainTest {
    public static void main(String[] args) {
        //通过main启动  ,默认会使用spring容器来启动(读取 META-INF/spring 下的配置文件)
        //Main.main(null);
        Main.main(new String []{"spring","log4j"});

    }
}
