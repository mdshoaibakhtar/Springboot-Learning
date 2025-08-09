package com.learning.springboot.Learning.Spring.Boot.controllers;
// Create User -> POST --- /create-user
// Get User/Users -> GET --- /fetch-user?user_id=
// Update User
// Delete User


import com.learning.springboot.Learning.Spring.Boot.dto.UsersDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
//    @GetMapping(path = "/fetch-user")
//    public UsersDTO fetchUser() {
//        System.out.println("Fetching user");
//        /*
//        OUTPUT : isActive would be shown as active due to serializer process which manages by Jackson package
//        {
//          "username": "mdshoaibakhtar",
//          "password": "786",
//          "email": "mdshoaibakhtar@gmail.com",
//          "active": true
//        }
//         */
//        return new UsersDTO("mdshoaibakhtar", "786","mdshoaibakhtar@gmail.com", true
//        );
//    }

    @GetMapping(path = "/fetch-user/{userName}")
    public UsersDTO fetchUser(@PathVariable("userName") String userName) {
        System.out.println("Fetching user");
        /*
        OUTPUT : isActive would be shown as active due to serializer process which manages by Jackson package
        {
          "username": {userName},
          "password": "786",
          "email": "mdshoaibakhtar@gmail.com",
          "active": true
        }
         */
        return new UsersDTO(userName, "786","mdshoaibakhtar@gmail.com", true
        );
    }

    @GetMapping(path = "/fetch-user")
    public UsersDTO fetchUser(@PathParam("isActive") Boolean isActive) {
        System.out.println("Fetching user");
        /*
        OUTPUT : isActive would be shown as active due to serializer process which manages by Jackson package
        {
          "username": "mdshoaibakhtar",
          "password": "786",
          "email": "mdshoaibakhtar@gmail.com",
          "active": {isActive}
        }
         */
        if (isActive == null){
            isActive = false;
        }
        return new UsersDTO("mdshoaibakhtar", "786","mdshoaibakhtar@gmail.com", isActive?true:false);
    }
}
