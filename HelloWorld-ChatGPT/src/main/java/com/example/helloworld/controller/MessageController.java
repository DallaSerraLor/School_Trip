package com.example.helloworld.controller;

import com.example.helloworld.model.Message;
import com.example.helloworld.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping("/api/message")
    public Message getMessage() {
        return messageService.getHelloMessage();
    }
    
    @RequestMapping("/api/m2")
    public String getMessage2() {
        return "hello";
    }

}
