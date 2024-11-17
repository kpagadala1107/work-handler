package com.example.work_handler.services;

import com.example.work_handler.model.WorkData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(WorkData workData) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(workData.getEmail());
        message.setSubject("New User Data Submission");
        message.setText("Name: " + workData.getTitle() + "\nMessage: " + workData.getJobDescription());

        mailSender.send(message);
    }
}
