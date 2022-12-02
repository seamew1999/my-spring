package bean;

import java.util.Random;

/**
 * @Author: seamew
 * @Title: UserService
 * @CreateTime: 2022年11月30日 17:15:00
 * @Description:
 * @Version: 1.0
 */
public class UserService implements IUserService {

    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "seamew";
    }

    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + userName + " success！";
    }

}