package com.abhi.kafka.broker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "myTopic",groupId = "mygroup")
    public void consumeMessage(String message){
        log.info(String.format(" Message received %s ",message));
    }
}
