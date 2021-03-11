package com.example.laba1KKP.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GreetingController {

    @RequestMapping("/speed")
    public Greeting greeting(@RequestParam(value = "speed1", defaultValue = "1") double speed1,
                             @RequestParam(value = "speed2", defaultValue = "1") double speed2,
                             @RequestParam(value = "mass1", defaultValue = "1") double mass1,
                             @RequestParam(value = "mass2", defaultValue = "1") double mass2)
    {
        return new Greeting(speed1,speed2,mass1,mass2);
    }


}