package com.example.finedesk.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LoginRequestModel {
    private String username;
    private String password;
}
