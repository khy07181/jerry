package com.jerry.account;

import lombok.Data;

@Data
public class SignUpForm {

    private String id;
    private String nickname;
    private String email;
    private String password;
}
