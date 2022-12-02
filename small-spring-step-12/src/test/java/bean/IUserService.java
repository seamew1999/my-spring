package bean;

/**
 * @Author: seamew
 * @Title: IUserService
 * @CreateTime: 2022年11月30日 17:15:00
 * @Description:
 * @Version: 1.0
 */
public interface IUserService {

    String queryUserInfo();

    String register(String userName);
}