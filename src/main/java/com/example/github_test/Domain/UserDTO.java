package com.example.github_test.Domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDTO {
    private String id;
    private String password;
}
