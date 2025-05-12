package com.example.helloworld.service;

import com.example.helloworld.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public Message getHelloMessage() {
        return new Message("Ciao dal backend Spring!");
    }
}
