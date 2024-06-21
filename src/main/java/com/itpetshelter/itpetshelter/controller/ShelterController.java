package com.itpetshelter.itpetshelter.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itpetshelter")
@Log4j2
@RequiredArgsConstructor

public class ShelterController {

    @GetMapping("/shelter")
    public String shelter() {
        return "page/shelter";
    }


}
