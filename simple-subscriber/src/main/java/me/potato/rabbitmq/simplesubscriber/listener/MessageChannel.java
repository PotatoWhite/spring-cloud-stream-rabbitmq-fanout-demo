package me.potato.rabbitmq.simplesubscriber.listener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageChannel {
    String MESSAGES="messages";

    @Input
    SubscribableChannel messages();
}
