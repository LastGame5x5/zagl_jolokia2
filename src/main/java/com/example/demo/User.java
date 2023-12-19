package com.example.demo;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class User {

    private String login;
    private String password;
    private LocalDateTime date;
}
