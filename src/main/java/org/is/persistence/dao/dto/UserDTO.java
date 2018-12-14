package org.is.persistence.dao.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserDTO {

    private String username;
    private String firstName;
    private String lastName;
    private Date registered;
    private String pass;
    private int age;

    public UserDTO(String username, String firstName, String lastName
    , Date registered, String pass, int age){
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.registered = registered;
        this.pass = pass;
        this.age = age;
    }

    public UserDTO(String username){
        this.username = username;
    }

}
