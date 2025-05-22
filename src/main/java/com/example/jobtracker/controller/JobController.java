package com.example.jobtracker.controller;

import com.example.jobtracker.model;
import com.example.jobtracker.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation;

import java.util.List;

@Restcontroller
@RequestMapping("/jobs")

public class JobController

{


    @Autowired
    private JobRepository jobRepository;

    @PostMapping
    public Job addJob(@RequestBody Job Job)
    {
        return jobRepository.save(job);
    } 

    @GetMapping
    public List<Job> getAllJobs()
    {
        return jobRepository.findAll();
    }

}