package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            new Student(
                    1L,
                    "Ermias",
                    "ermias@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY,6),
                    234
            );
        };
    }
}
