package com.example.docker.controllers;

import com.example.docker.dtos.ComputerDTO;
import com.example.docker.services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComputerController {
    @Autowired
    ComputerService computerService;

    @GetMapping("")
    public ResponseEntity<List<ComputerDTO>> getAllComputers() {
        return new ResponseEntity<>(computerService.getAllComputers(), HttpStatus.OK);
    }
}
