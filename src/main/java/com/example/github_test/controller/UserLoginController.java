package com.example.github_test.controller;

import com.example.github_test.Domain.LoginStates;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

public interface UserLoginController {
    public String MainTitle();
    public ResponseEntity<String> UserLogin(@RequestBody(required = true) Map<String, String> userInfo);
    public ResponseEntity<LoginStates> StatusLogin(@RequestHeader(required = false) Map<String, Object> requestHeader);
}

