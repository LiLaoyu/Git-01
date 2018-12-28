package com.itheima.boot.controller;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Consumer {


    @JmsListener(destination = "itheimaSend")
    public void sendText(Map text){
        System.out.println("收到:"+text);
    }

}
