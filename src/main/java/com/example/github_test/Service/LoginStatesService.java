package com.example.github_test.Service;

import com.example.github_test.Domain.LoginStates;

public interface LoginStatesService {
    public void InitializeStates(boolean isLogin, boolean isConnectedToDatabase);
    public LoginStates GetStates();
}
