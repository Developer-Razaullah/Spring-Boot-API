package com.rest.api.controller;

import com.rest.api.model.TechnologyData;
import com.rest.api.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TechnologyController {

    @Autowired
    private TechnologyService service;

    @GetMapping("technologies")
    public ResponseEntity<TechnologyData>  getTechnology() {
        return new ResponseEntity<>(service.getTechnology(), HttpStatus.OK);
    }
}
