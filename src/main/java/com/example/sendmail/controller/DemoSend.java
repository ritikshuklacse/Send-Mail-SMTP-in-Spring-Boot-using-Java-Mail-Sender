package com.example.sendmail.controller;


import com.example.sendmail.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoSend {
    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping(value = "/sendmail/{userMail}")
    boolean getByUserId(@PathVariable("userMail") String userMail){
        return sendEmailService.sendEmail(userMail);
    }


}
