package com.munte.section3.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
//@RequestMapping("/hello")
public class SayHelloController {

//    @GetMapping()
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloHtml() {
        return "hello";
    }

}
