package com.example.demo.controllers;

import com.example.demo.services.Calculate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/HelloWorld")
    public String firstMapping(){
        return "<b>Hello World<b>";
    }

    @GetMapping("/")
    public String index() {
        return "Welcome to my Spring Application";
    }

    @GetMapping("/echo")
    public String parameter(@RequestParam String input) {
        // Fx: localhost:8080/echo?input=HelloWorld
        return input + " " + "end of string";
    }

    @GetMapping("/ErDetFredag")
    public String erDetFredag() {
        Calculate calculate = new Calculate();
        boolean erDetFredag = calculate.isItFriday();

        if (erDetFredag) {
            return "Er det fredag? Ja";
        } else {
            return "Er det fredag? Nej";
        }
    }

    @GetMapping("/HvilkenDagErDet")
    public String hvilkenDagErDet() {
        Calculate calculate = new Calculate();
        return "It is " + calculate.getWeekday();
    }

    @GetMapping("/square")
    public String parameter(@RequestParam int input) {
        // Fx: localhost:8080/square?input=10
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < input; i++) {
            for (int y = 0; y < input; y++) {
                str.append(input).append("\t");
            }
            str.append("\n");
        }
        return str.toString();
    }



}
