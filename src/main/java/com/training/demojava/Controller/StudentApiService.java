package com.training.demojava.Controller;

import com.training.demojava.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentApiService {
    Student student;
    @GetMapping ("{studentID}")
    public Student getStudentDetails(String studentID){
//        Student st = new Student("C1", "Harika");
        return student;
    }

    @PostMapping
    public String createStudent(@RequestBody Student student){
      this.student= student;
      return "Success";
    }

    @PutMapping
    public String updateStudent(@RequestBody Student student){
        this.student= student;
        return "Successfully Updated";
    }

    @DeleteMapping("{studentId}")
    public String deleteStudent(String studentId){
        this.student= null;
        return "Successfully deleted";
    }


}
