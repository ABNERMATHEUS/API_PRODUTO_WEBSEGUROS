package com.grupofaculdade.tde01produtoresource.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/online")
public class HealthCheckController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> findAll() {

        return ResponseEntity.ok().body("Online - "+ new Date().toLocaleString());
    }

}
