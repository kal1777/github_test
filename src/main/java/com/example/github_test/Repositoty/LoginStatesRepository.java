package com.example.github_test.Repositoty;

import com.example.github_test.Domain.LoginStates;

public interface LoginStatesRepository {
    public void InitializeLoginStates(boolean isLogin, boolean isConnectedToDatabase);
    public LoginStates GetLoginStates();
}
