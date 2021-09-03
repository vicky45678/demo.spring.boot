package com.example.demo.spring.boot23.controller;

import com.example.demo.spring.boot23.model.Doctor;
import com.example.demo.spring.boot23.repository.DoctorjpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Doctorcontroller {
    @Autowired
    DoctorjpaRepository doctorjpaRepository;
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Doctor>getllDoctor() {
        return doctorjpaRepository.findAll();
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Doctor adddoctor(@RequestBody Doctor doctor) {
      return   doctorjpaRepository.save(doctor);

    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Doctor findDoctor(@RequestBody Doctor doctor){
        return doctorjpaRepository.save(doctor);
}
@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public void removeDoctor(@RequestParam Long id){
        doctorjpaRepository.deleteById(id);

    }
    @RequestMapping(value = "/findbyid",method = RequestMethod.GET)
    public Optional<Doctor>findDoctor(@RequestParam Long id){
        return doctorjpaRepository.findById(id);
    }

}
