package com.example.demo.spring.boot23.repository;

import com.example.demo.spring.boot23.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorjpaRepository extends JpaRepository<Doctor,Long> {
}
