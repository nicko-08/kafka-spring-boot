package com.rodavia.kafka.controller;

import com.rodavia.kafka.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    // http:localhost:8080/api/v1/kafka/publish?message=hello from spring boot
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }

//    @PostMapping("/publish")
//    public ResponseEntity<String> publishMessage(@RequestBody String message) {
//        kafkaProducer.sendMessage(message);
//        return ResponseEntity.ok("Message sent to the topic");
//    }
}
