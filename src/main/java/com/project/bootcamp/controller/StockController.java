package com.project.bootcamp.controller;

import com.project.bootcamp.model.dto.StockDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class StockController {
    
    public ResponseEntity<StockDTO> save()
}