package com.emoticon.platform.apiKey.controller;

import com.emoticon.platform.apiKey.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public String test() {
        userService.mongoInsert();
        return "test";
    }
}
