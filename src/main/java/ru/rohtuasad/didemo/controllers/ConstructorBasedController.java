package ru.rohtuasad.didemo.controllers;

import org.springframework.stereotype.Controller;
import ru.rohtuasad.didemo.services.GreetingService;

@Controller
public class ConstructorBasedController {
    private GreetingService greetingService;

    public ConstructorBasedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
