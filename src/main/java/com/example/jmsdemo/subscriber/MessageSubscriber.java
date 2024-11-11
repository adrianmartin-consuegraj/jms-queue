package com.example.jmsdemo.subscriber;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component //? marks this class as a spring component
public class MessageSubscriber {

    @JmsListener(destination = "simple.queue") //? listens to the specified queue
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message); //? prints the received message
        System.out.println("Listener active and processed a message");
    }

}
