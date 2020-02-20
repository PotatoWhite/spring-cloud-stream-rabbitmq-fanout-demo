package me.potato.rabbitmq.simplepublisher.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(Source.class)
public class PublishController {
    private final Source source;

    public PublishController(Source source) {
        this.source = source;
    }

    @GetMapping("/api/pub")
    public void publish(){
        source.output().send(MessageBuilder.withPayload(new Message("Hello RabbitMQ")).build());
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public class Message{
        private String message;
    }
}

