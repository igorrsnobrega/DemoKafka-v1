package com.example.demo.controllers;

import com.example.demo.services.ProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api")
public class RestControllerForKafkaMsg {


    private final ProducerService producerService;

    public RestControllerForKafkaMsg(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/message")
    public void getMessageFromClient(@RequestParam("message") String message) {
        producerService.sendMsgToTopic(message);
    }

}
