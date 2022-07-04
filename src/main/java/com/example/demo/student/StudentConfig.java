package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ermias = new Student(
                    "Ermias",
                    "ermias@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY, 6));

            Student mimi = new Student(
                    "Mimi",
                    "mimi@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY, 6));
        repository.saveAll(
                List.of(ermias, mimi)
        );
        };
    }
}
