package com.girmiti.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.girmiti.demo.entity.StudentEntity;

public interface StudentRepositary extends JpaRepository<StudentEntity, Integer> 
{

}
