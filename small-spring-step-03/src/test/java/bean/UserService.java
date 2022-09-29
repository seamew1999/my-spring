package bean;

/**
 * @Author: seamew
 * @Title: UserService
 * @CreateTime: 2022年09月29日 10:02:00
 * @Description:
 * @Version: 1.0
 */
public class UserService {
    private String name;

    public UserService() {
    }

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                '}';
    }
}
