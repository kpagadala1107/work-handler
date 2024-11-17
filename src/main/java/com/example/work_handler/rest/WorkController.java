package com.example.work_handler.rest;

import com.example.work_handler.model.WorkData;
import com.example.work_handler.repo.WorkDataRepository;
import com.example.work_handler.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class WorkController {

    @Autowired
    private WorkDataRepository workDataRepository;

    @Autowired
    private EmailService emailService;

    @PostMapping
    public WorkData saveUserData(@RequestBody WorkData workData) {
        WorkData savedData = workDataRepository.save(workData);
        emailService.sendEmail(savedData);
        return savedData;
    }
}
