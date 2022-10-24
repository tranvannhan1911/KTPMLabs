package com.ktpm.spring_boot_activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ktpm.spring_boot_activemq.MessageReceiver;
import com.ktpm.spring_boot_activemq.MessageSender;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private MessageSender sendMessage;

    @Autowired
    private MessageReceiver messageReceiver;

    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable(name = "message") String message) {
        String result = "demo: " + message;
        sendMessage.sendMessage(result);
        return result;
    }

    @GetMapping("/receiver")
    public List<String> receiver() {
        return messageReceiver.getMessages();
    }
}