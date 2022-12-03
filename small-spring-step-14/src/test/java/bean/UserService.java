package bean;

import com.seamew.springframework.beans.factory.annotation.Autowired;
import com.seamew.springframework.beans.factory.annotation.Value;
import com.seamew.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Author: seamew
 * @Title: UserService
 * @CreateTime: 2022年12月03日 17:24:00
 * @Description:
 * @Version: 1.0
 */
@Component("userService")
public class UserService implements IUserService {
    @Value("${token}")
    private String token;

    @Autowired
    private UserDao userDao;

    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userDao.queryUserName("1") + "，" + token;
    }

}

