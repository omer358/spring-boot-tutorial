package com.example.springboottutorial;

import com.example.springboottutorial.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }

    @GetMapping("/")
    public List<Student> hello() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam@exampl.com",
                        LocalDate.of(1999, Month.APRIL, 5),
                        24
                ),
                new Student(
                        1L,
                        "Huda",
                        "huda@exampl.com",
                        LocalDate.of(2000, Month.APRIL, 5),
                        23
                ),
                new Student(
                        1L,
                        "Adel",
                        "adel@exampl.com",
                        LocalDate.of(1998, Month.APRIL, 5),
                        25
                )
        );
    }

}
