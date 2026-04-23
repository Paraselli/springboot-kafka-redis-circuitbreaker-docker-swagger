package com.example.demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic1")
    public void consume(String message) {
        System.out.println("Received: " + message);
    }
}
