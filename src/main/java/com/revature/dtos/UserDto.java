package com.revature.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Integer id;
    private String userName;
    private String email;
    private String firstName;
    private String lastName;
    // private int numOfFollowers;
    // private int numOfFollowing;
    // private boolean followedByCurrentUser;
    // private int mutualFollowers;

}
