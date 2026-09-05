package com.noqodi.springbootdemo;

import java.time.Instant;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, Object> hello() {
        return Map.of(
                "message", "Hello from the Spring Boot demo app, running on OKE",
                "time", Instant.now().toString());
    }

    @GetMapping("/healthz")
    public Map<String, String> healthz() {
        return Map.of("status", "ok");
    }
}
