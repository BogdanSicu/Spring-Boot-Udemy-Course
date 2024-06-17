package com.munte.section8_rest_api.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldResource {

    @GetMapping()
    public String getHelloWorldMessage() {
        return "Hello World!";
    }

    @GetMapping("/bean")
    public HelloWorldBean getHelloWorldBean() {
        return new HelloWorldBean("Hello World!");
    }

    @GetMapping("/param/{name}")
    public HelloWorldBean getHelloWorldPathParam(@PathVariable String name) {
        return new HelloWorldBean(name);
    }

    @GetMapping("/param/{name}/{message}")
    public HelloWorldBean getHelloWorldMultiplePathParams(@PathVariable String name, @PathVariable String message) {
        return new HelloWorldBean(name + message);
    }


}
