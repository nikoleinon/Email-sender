package com.example.Emailsender.Service;

public interface SenderService {
    void sendEmail(String to, String subject, String text);
}
