package com.emoticon.platform.apiKey;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PutMapping("/")
    public String registerUser(@RequestBody UserRequestModel requestModel) {

        return userService.registerUser(requestModel);
    }

}
