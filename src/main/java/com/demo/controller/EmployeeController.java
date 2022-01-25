package com.demo.controller;

import com.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    ArrayList<Employee> employeeArrayList=new ArrayList<>();
    @RequestMapping("/add_emp")
    public String employee_add(@RequestBody Employee employee){
        employeeArrayList.add(employee);
        return "Added Succesfully";
    }
    @RequestMapping("/get_emp")
    public ArrayList<Employee> getEmployeeArrayList(){
        return employeeArrayList;
    }
    @RequestMapping("/put_emp")
    public String update_Emp(@RequestBody String name){
        employeeArrayList.get(1).setEmp_name(name);
        return "Update Succcessfully";
    }
}
