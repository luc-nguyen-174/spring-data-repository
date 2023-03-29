package com.example.demospringdatarepository.controller;

import com.example.demospringdatarepository.model.Student;
import com.example.demospringdatarepository.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("")
    public ModelAndView list() {
        Iterable<Student> studentList = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("studentList", studentList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createStudent() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("student", new Student());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create (@ModelAttribute Student student) {
        studentService.save(student);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("song", new Student());
        modelAndView.addObject("message", "New song created successfully. \nBack to list after 3s.");
        return modelAndView;
    }
}
