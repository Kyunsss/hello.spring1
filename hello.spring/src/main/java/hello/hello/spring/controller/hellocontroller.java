package hello.hello.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hellocontroller {

    @GetMapping
    public String hello(Model model){

        model.addAttribution("data", "hello!");
        return "hello";

    }
}
