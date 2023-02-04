package blog.user.service;

import blog.user.dvo.UserInfo;
import blog.user.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class UserService {
    private UserMapper userMapper;
    public UserInfo getUserInfo() {
        return userMapper.getUserInfo();
    }

}
