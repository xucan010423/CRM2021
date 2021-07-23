package com.YueYang.controller;

import com.YueYang.domain.Student;
import com.YueYang.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MyController {

    @Resource
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "ShowStudent")
    @ResponseBody
    public List<Student> selectStudent(){
        List<Student> studentList = studentService.SelectStudent();
        return studentList;
    }
}
