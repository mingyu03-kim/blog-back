package blog.user.mapper;

import blog.user.dvo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    UserInfo getUserInfo();
}
