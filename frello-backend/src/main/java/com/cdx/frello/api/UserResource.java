package com.cdx.frello.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @GetMapping("/name")
    public String getName() {
        String name = "Clement";

        return setToUpperCase(name);
    }

    private String setToUpperCase(String name) {
        return name.toUpperCase();
    }
}
