package com.example.demo.student;
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
                        "Shabih",
                        LocalDate.of(1965, Month.APRIL,5),
                        35,
                        "shabih.sharfani@gmail.com"
                ));
    }
}
