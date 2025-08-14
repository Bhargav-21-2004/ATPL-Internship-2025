package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Student;
import com.example.service.StudentService;
@Controller
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;
    public StudentController(StudentService service) { this.service = service; }

    
    @GetMapping
    public String list(Model model) {
        model.addAttribute("students", service.getAll());
        return "list";
    }

 
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new Student());
        return "form";
    }

   
    @PostMapping("/save")
    public String save(@Valid  @ModelAttribute("student") Student student,
                       BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        service.create(student);
        return "redirect:/students";
    }
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Student s = service.getById(id);
        model.addAttribute("student", s);
        return "form";
    }

    
    @PostMapping("/update/{id}")
    public String update(@PathVariable long id,
                         @Valid @ModelAttribute("student") Student student,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        service.update(id, student);
        return "redirect:/students";
    }

  
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/students";
    }
}
