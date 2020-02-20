package me.potato.rabbitmq.anothersimplesubscriber.listener;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Slf4j
@EnableBinding(MessageChannel.class)
@Component
public class SimpleListener {
    @StreamListener(MessageChannel.MESSAGES)
    public void on(Message message){
        log.info("Received : {}", message.toString());
    }

    @Getter
    @Setter
    @ToString
    public static class Message {
        private String message;
    }
}
