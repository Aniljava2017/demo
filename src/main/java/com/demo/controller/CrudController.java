package com.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class CrudController {
    ArrayList<String> courseList=new ArrayList<>();
    @RequestMapping("/create")
    public String Read(@RequestParam String element){
        courseList.add(element);
        return "Added Successfully:- "+element;
    }

    @RequestMapping("/read")
    public ArrayList<String> getCourseList(){
        return courseList;
    }

    @RequestMapping("/update")
    public String update(@RequestParam String element,@RequestParam int index){
        courseList.set(index,element);
        return "Update Successfully:- "+element;
    }
    @RequestMapping("/remove")
    public String delete(@RequestParam int index){
        courseList.remove(index);
        return "Remove Successfully";
    }
}
