package com.emoticon.platform.auth;

import com.emoticon.platform.apiKey.UserRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class SessionService {

    @Autowired
    JwtUtil jwtUtil;

    public String create(UserRequestModel resource) {

        return jwtUtil.createToken(resource.getId(), resource.getName());
    }
}