package com.example.github_test.Data;

import com.example.github_test.Domain.LoginStates;

public class LoginData {
    private static final LoginData instance = new LoginData();
    public LoginStates LoginList = new LoginStates();

    public static LoginData getInstance() {
        return instance;
    }
}
