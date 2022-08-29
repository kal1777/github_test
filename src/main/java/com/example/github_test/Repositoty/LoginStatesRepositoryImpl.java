package com.example.github_test.Repositoty;

import com.example.github_test.Data.LoginData;
import com.example.github_test.Domain.LoginStates;
import org.springframework.stereotype.Repository;

@Repository
public class LoginStatesRepositoryImpl implements LoginStatesRepository {
    public LoginStatesRepositoryImpl() {
    }

    @Override
    public void InitializeLoginStates(boolean isLogin, boolean isConnectedToDatabase) {
        LoginData.getInstance().LoginList.SetLoginStates(isLogin, isConnectedToDatabase);
    }

    public LoginStates GetLoginStates() {
        return LoginData.getInstance().LoginList;
    }
}
