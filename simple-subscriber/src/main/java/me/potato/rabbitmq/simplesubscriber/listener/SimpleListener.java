package me.potato.rabbitmq.simplesubscriber.listener;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@Slf4j
@EnableBinding(MessageChannel.class)
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
