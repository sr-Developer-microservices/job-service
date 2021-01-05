package com.mymicroservices.job.repository;

/*
 * @created 1/4/2021 - 8:18 PM
 * @author Swapnil Kharche
 */

import com.mymicroservices.job.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {


    Job findByJobId(Long id);
}
