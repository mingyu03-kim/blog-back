package blog.user.rest;

import blog.user.dvo.UserInfo;
import blog.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService service;

    @GetMapping("/get")
    public UserInfo getUserInfo() {
        return service.getUserInfo();
    }

}
