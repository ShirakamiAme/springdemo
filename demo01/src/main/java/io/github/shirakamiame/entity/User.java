package io.github.shirakamiame.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private int status;
    private String tpName;
}
