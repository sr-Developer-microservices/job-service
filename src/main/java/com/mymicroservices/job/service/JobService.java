package com.mymicroservices.job.service;

/*
 * @created 1/4/2021 - 8:19 PM
 * @author Swapnil Kharche
 */

import com.mymicroservices.job.entity.Job;
import com.mymicroservices.job.repository.JobRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public Job saveJob(Job job) {
        log.info("Inside saveJob method of JobService.");
        return jobRepository.save(job);
    }

    public Job findJobById(Long id) {
        log.info("Inside findJobById method of JobService.");
        return jobRepository.findByJobId(id);
    }
}
