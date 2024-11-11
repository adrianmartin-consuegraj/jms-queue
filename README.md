# JMS Queue Demo
This project is a simple demonstration of how to use Java Message Service (JMS) with queues. It showcases a basic implementation for sending and receiving messages using the point-to-point messaging model.

## Usage
Ideal for scenarios where each message must be processed by a single consumer, such as background processing tasks or work queue systems.

## Features
- Demonstrates the basic configuration of a JMS provider for queues.
- Shows how to create a queue publisher and a single consumer.
- Provides example code for sending and receiving messages using queues.

## Getting Started

1. **Clone the repository:**
   ```script
   git clone https://github.com/adrianmartin-consuegraj/jms-queue.git
   ./bin/activemq start
2. **Run Spring Boot:**
   ```script
   mvn spring-boot:run
3. **Run ActiveMQ:**
   ```script
   ./bin/activemq start
4. **Run Postman:**
   ```script
   http://localhost:8080/api/send
and send a message in the body like "Hello, this is a JMS queue message!" -> you'll received the message in the Terminal of your IDE.
