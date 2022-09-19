package com.example.springdatajpa.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springdatajpa.datajpa.repository.ChuyenBayRepository;

@SpringBootApplication
public class DatajpaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DatajpaApplication.class, args);
	}

}
