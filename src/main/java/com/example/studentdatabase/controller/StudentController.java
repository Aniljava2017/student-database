package com.example.studentdatabase.controller;

import com.example.studentdatabase.model.Student;
import com.example.studentdatabase.repository.StudentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController<optional> {
    @Autowired
  // List<Student> studentList=new ArrayList<>();
    StudentJpaRepository studentJpaRepository;

   /* @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Student> getStudentList() {
        return studentJpaRepository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Student getStudent(@RequestBody Student student) {
        return studentJpaRepository.save(student);
    }*/

    @RequestMapping(value = "/add_std", method = RequestMethod.POST)
    public Student addStudent(@RequestBody Student student) {
        return studentJpaRepository.save(student);
    }


    @RequestMapping(value = "/get_std", method = RequestMethod.GET)
    public List<Student> getAllEmployee() {
        return studentJpaRepository.findAll();
    }

    @RequestMapping(value = "del_std/{id}",method = RequestMethod.DELETE)
    public void removeStudent(@PathVariable Long id){
        studentJpaRepository.deleteById(id);
    }
    @RequestMapping(value = "/search_name/{name}",method = RequestMethod.GET)
    public Student findStudentName(@PathVariable String name){
        System.out.println("Name is ----" + name);
        return studentJpaRepository.findByName(name);
    }
    @RequestMapping(value = "/search_id/{id}",method = RequestMethod.GET)
    public Optional<Student> findStudentId(@PathVariable Long id){
        return studentJpaRepository.findById(id);
    }

}
