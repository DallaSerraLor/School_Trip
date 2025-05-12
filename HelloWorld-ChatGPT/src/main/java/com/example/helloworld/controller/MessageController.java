package com.example.helloworld.controller;

import com.example.helloworld.model.Message;
import com.example.helloworld.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public Message getMessage() {
        return messageService.getHelloMessage();
    }
}
