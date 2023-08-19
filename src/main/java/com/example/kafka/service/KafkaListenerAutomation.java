package com.example.kafka.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.kafka.listener.MessageListenerContainer;
import org.springframework.stereotype.Component;


@Component

public class KafkaListenerAutomation {

  Logger logger = LoggerFactory.getLogger(KafkaListenerAutomation.class);

  @Autowired
  KafkaListenerEndpointRegistry kafkaListenerEndpointRegistry;

  public boolean startListen(String listenerId)
  {
      MessageListenerContainer listenerContainer = kafkaListenerEndpointRegistry.getListenerContainer(listenerId);
      assert listenerContainer != null :false;
      listenerContainer.start();
      logger.info("kafka listener started");
      return true;
  }

  public boolean stopListen(String listenerId)
  {
      MessageListenerContainer listenerContainer = kafkaListenerEndpointRegistry.getListenerContainer(listenerId);
      assert listenerContainer !=null :false;
      listenerContainer.stop();
      logger.info("kafka listener stopped");
      return true;
  }


}
