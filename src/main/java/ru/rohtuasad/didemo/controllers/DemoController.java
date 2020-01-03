package ru.rohtuasad.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    public String hello() {
        return "Hello World!";
    }
}
