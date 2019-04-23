package com.futuristic.school.student.management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author aadiyogis
 *
 */
@SpringBootApplication
public class StudentManagement {
    
    private static final Logger log = LoggerFactory.getLogger(StudentManagement.class);
    
    public static void main(String[] args) {
        log.debug("Starting student management");
        SpringApplication.run(StudentManagement.class, args);
    }
}
