package com.example.lms.services;

import com.example.lms.entity.Learner;
import com.example.lms.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearnerManagementService {

    @Autowired
    private LearnerRepository _learnerRepository;

    public Learner createLearner(Learner learner) {
        return _learnerRepository.save(learner);
    }

    public List<Learner> fetchAllLearners() {
        return _learnerRepository.findAll();
    }
}
