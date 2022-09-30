package bean;

/**
 * @Author: seamew
 * @Title: UserService
 * @CreateTime: 2022年09月29日 10:02:00
 * @Description:
 * @Version: 1.0
 */
public class UserService {
    private String id;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(id));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
