package com.itheima.boot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class QueueController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/sendMap")
    public void send(){
        Map map = new HashMap();

        map.put("mobile", "122222");
        map.put("age","19" );
        map.put("price","恭喜中奖(1000万)" );

        jmsMessagingTemplate.convertAndSend("itheimaSend",map);
    }
}
