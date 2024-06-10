package com.munte.section2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @GetMapping()
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "1st course", "author1"),
                new Course(2, "2nd course", "author2"),
                new Course(3, "3rd course", "author3")
        );
    }

}
