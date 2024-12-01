package com.example.work_handler.rest;

import com.example.work_handler.model.WorkData;
import com.example.work_handler.repo.WorkDataRepository;
import com.example.work_handler.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class WorkController {

    @Autowired
    private WorkDataRepository workDataRepository;

    @Autowired
    private EmailService emailService;

    @GetMapping("/get-work")
    public WorkData getData() {
        WorkData savedWorkData = new WorkData();
        System.out.println("work"+ savedWorkData);
        return savedWorkData;
    }

    @PostMapping("/save-work")
    public WorkData saveUserData(@RequestBody WorkData workData) {
        System.out.println("work"+ workData.toString());
        WorkData savedWorkData = workDataRepository.save(workData);
//        emailService.sendEmail(savedWorkData);
        return savedWorkData;
    }
}
