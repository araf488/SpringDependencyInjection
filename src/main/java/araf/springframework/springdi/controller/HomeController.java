package araf.springframework.springdi.controller;

import araf.springframework.springdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @Autowired
    private GreetingService greetingService;

    public String hello(){
        String message = "Hello SpringFramework DI";
        System.out.println(message);
        return greetingService.sayGreeting();
    }
}
