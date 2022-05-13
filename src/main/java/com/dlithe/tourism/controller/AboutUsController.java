package com.dlithe.tourism.controller;

import com.dlithe.tourism.dto.AboutUsRequest;
import com.dlithe.tourism.service.AboutUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AboutUsController {

    @Autowired
    private AboutUsService aboutUsService;

    @GetMapping("about-us/")
    public AboutUsRequest fetchAboutUs() {

        return aboutUsService.getAboutDetails();
    }

}