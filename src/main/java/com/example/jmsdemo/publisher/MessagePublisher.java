package com.example.jmsdemo.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service //? marks this class as a service component, making it available for dependency injection
public class MessagePublisher {

    private static final String DESTINATION_QUEUE = "simple.queue"; //? name of the queue

    @Autowired //? injects the JmsTemplate
    private JmsTemplate jmsTemplate;

    //? sends a message to the queue
    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(DESTINATION_QUEUE, message); //? sends the message to the que
    }

}
