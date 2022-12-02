package bean;

/**
 * @Author: seamew
 * @Title: IUserService
 * @CreateTime: 2022年12月02日 15:36:00
 * @Description:
 * @Version: 1.0
 */
public interface IUserService {

    String queryUserInfo();

    String register(String userName);
}