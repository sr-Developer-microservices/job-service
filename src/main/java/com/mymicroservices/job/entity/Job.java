package com.mymicroservices.job.entity;

/*
 * @created 1/4/2021 - 8:14 PM
 * @author Swapnil Kharche
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long jobId;
    private String jobTitle;
    private Double minSalary;
    private Double maxSalary;
}
