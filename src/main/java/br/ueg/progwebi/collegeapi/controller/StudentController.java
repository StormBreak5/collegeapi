package br.ueg.progwebi.collegeapi.controller;

import br.ueg.progwebi.collegeapi.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @GetMapping
    public List<Student> listAll() {
        Student student = new Student();
        student.setId(1L);
        student.setName("John Doe");
        student.setResgisterNumber("132456");
        student.setCourse("SI");
        student.setRegistrationDate(LocalDate.now());

        Student student2 = Student.builder().id(2L).name("Estudante 2").resgisterNumber("123456").course("SI").registrationDate(LocalDate.now()).build();

        List<Student> students = Arrays.asList(student, student2);

        return students;
    }
}
