package me.potato.rabbitmq.anothersimplesubscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnotherSubscriberApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnotherSubscriberApplication.class, args);
    }

}
