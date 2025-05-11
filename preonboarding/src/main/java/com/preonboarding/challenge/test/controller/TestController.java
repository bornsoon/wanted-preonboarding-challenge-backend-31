package com.preonboarding.challenge.test.controller;

import com.preonboarding.challenge.test.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final TestService testService;

    public TestController (TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/api/test-db")
    public int testDb() {
        return testService.getTestValue();
    }
}
