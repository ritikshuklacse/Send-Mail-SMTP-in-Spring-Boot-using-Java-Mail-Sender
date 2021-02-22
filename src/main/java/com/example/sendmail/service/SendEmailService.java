package com.example.sendmail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

    @Autowired
    private JavaMailSender emailSender;

    public boolean sendEmail(String userId) {
        System.out.println("sending mail");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userId);
        message.setSubject("Demo Email");
        message.setText("Ye humari car hai, ye hum hai, aur yaha pawrii ho rahi hai!!");
        emailSender.send(message);
        return true;
    }
}
