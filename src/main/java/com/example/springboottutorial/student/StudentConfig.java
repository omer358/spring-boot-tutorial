package com.example.springboottutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository
    ){
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "mariam@example.com",
                    LocalDate.of(1999, APRIL, 23),
                    24
            );
            Student ahmed = new Student(
                    2L,
                    "ahmed",
                    "ahmed@example.com",
                    LocalDate.of(2000, APRIL, 23),
                    23
            );
            studentRepository.saveAll(
                    List.of(mariam,ahmed)
            );
        };
    }
}
