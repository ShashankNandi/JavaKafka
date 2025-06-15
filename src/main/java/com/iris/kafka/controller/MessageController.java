package com.iris.kafka.controller;

import com.iris.kafka.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class MessageController {


    private KafkaProducer producer;

    @Autowired
    public MessageController(KafkaProducer producer) {
        this.producer = producer;
    }
    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam String message) {
        producer.send("javaguides", message);
        return ResponseEntity.ok("Message sent");
    }


//    @GetMapping("test")



}
