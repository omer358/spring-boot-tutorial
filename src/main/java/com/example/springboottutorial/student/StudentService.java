package com.example.springboottutorial.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
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
