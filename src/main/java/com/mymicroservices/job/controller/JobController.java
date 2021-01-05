package com.mymicroservices.job.controller;

/*
 * @created 1/4/2021 - 8:20 PM
 * @author Swapnil Kharche
 */

import com.mymicroservices.job.entity.Job;
import com.mymicroservices.job.service.JobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/")
    public Job saveJob(@RequestBody Job job){
        log.info("Inside saveJob method of JobController.");
        return jobService.saveJob(job);
    }

    @GetMapping("/{id}")
    public Job findJobById(@PathVariable Long id){
        log.info("Inside findJobById method of JobController.");
        return jobService.findJobById(id);
    }
}
