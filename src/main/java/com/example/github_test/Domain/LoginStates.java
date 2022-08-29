package com.example.github_test.Domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginStates {
    private boolean isLogin;
    private boolean isConnectedToDatabase;

    public void SetLoginStates(boolean isLogin, boolean isConnectedToDatabase) {
        this.isLogin = isLogin;
        this.isConnectedToDatabase = isConnectedToDatabase;
    }
}

