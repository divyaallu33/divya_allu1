package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Emp;

public interface EmpRepo  extends JpaRepository<Emp, Integer>{

}
