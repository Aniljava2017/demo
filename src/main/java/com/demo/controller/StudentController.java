package com.demo.controller;

import com.demo.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {
    ArrayList<Student> studentArrayList=new ArrayList<>();

    // Add Student Endpoint
    @RequestMapping("/add_std")
    public String addStudent(){
        Student student1=new Student("anil",23,"I.T");
        studentArrayList.add(student1);
        return "Added Successfully";
    }

    // Get Student Endpoint
    @RequestMapping("/get_std")
    public ArrayList<Student> getStudentArrayList(){
        return studentArrayList;
    }

    // Update Student Name
    @RequestMapping("/put_std")
    public String put(@RequestParam String name){
        studentArrayList.get(0).setName(name);
        return "Update Successfully";
    }

    // Remove Student Index
    @RequestMapping("/remove_std")
    public String remove(@RequestParam int index){
        studentArrayList.remove(index);
        return "Remove Successfully";
    }
}
