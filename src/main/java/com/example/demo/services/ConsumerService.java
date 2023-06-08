package com.example.demo.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "example_2", groupId = "example_2")
    public void listenToTopic(String message) {
        System.out.println("the message received is " + message);
    }

}
