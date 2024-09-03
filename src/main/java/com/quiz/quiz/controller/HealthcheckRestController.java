package com.quiz.quiz.controller;


import com.quiz.quiz.entity.DTO.HealthcheckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthcheckRestController {

    @GetMapping("/healthcheck")
    public String healthcheck() {
        return "It's working!";
    }

    @GetMapping("/healthcheckdto")
    public HealthcheckDto healthcheckDto() {
        HealthcheckDto dto = new HealthcheckDto(true, "It's working!");
        return dto;
    }

}