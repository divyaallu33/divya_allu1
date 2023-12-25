package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address1;

public interface AddrRepo extends JpaRepository<Address1, String>{

}
