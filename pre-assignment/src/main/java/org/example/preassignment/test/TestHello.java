package org.example.preassignment.test;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestHello {

    @GetMapping
    public String test() {
        return "API is working!";
    }
}
