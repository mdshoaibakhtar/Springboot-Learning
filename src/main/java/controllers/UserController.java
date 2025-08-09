package controllers;
// Create User -> POST --- /create-user
// Get User/Users -> GET --- /fetch-user?user_id=
// Update User
// Delete User


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping(path = "/fetch-user")
    public String fetchUser() {
        System.out.println("Fetching user");
        return "User Fetched! Successfully!";
    }
}
