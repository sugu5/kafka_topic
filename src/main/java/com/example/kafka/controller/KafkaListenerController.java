package com.example.kafka.controller;


import com.example.kafka.service.KafkaListenerAutomation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaListenerController {

    @Autowired
    KafkaListenerAutomation kafkaListenerAutomation;

    @GetMapping("/start/{id}")
    public void start(@RequestAttribute String listenerId)
    {
        kafkaListenerAutomation.startListen(listenerId);
    }

    @GetMapping("/stop/{id}")
    public void stop(@RequestAttribute String listenerId)
    {
        kafkaListenerAutomation.startListen(listenerId);
    }
}
