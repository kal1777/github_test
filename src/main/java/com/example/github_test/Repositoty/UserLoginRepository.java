package com.example.github_test.Repositoty;

public interface UserLoginRepository {
    public Boolean FindByUserInfo(String id, String password);
}
