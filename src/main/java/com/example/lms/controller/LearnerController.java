package com.example.lms.controller;

import com.example.lms.entity.Learner;
import com.example.lms.repository.LearnerRepository;
import com.example.lms.services.LearnerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LearnerController {

    @Autowired
    private LearnerManagementService _learnerManagementService;

    @PostMapping("/learners")
    public Learner createLearner(@RequestBody Learner learner) {
        return _learnerManagementService.createLearner(learner);
    }
    @GetMapping("/learners")
    public List<Learner> getAllLearners() {
        return _learnerManagementService.fetchAllLearners();
    }

}
