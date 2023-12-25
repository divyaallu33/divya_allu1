package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BOOK2_TBL;

public interface Book1Repo extends JpaRepository<BOOK2_TBL, Integer> {
}
