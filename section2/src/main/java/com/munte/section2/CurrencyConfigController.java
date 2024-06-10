package com.munte.section2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/currency")
public class CurrencyConfigController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @GetMapping()
    public CurrencyServiceConfiguration retrieveAllCourses() {
        return configuration;
    }

}
