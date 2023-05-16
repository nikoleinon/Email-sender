package com.example.Emailsender.controller;

import com.example.Emailsender.Service.SenderService;
import com.example.Emailsender.resource.EmailMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailController {

    private final SenderService senderService;

    public emailController(SenderService senderService) {
        this.senderService = senderService;
    }

    @PostMapping("/send")
    public ResponseEntity sendEmail(@RequestBody EmailMessage emailMessage){
        this.senderService.sendEmail(emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getMessage());
        return ResponseEntity.ok("Success");
    }
}
