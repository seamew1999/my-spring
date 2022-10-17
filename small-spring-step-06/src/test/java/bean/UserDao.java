package bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: seamew
 * @Title: UserDao
 * @CreateTime: 2022年10月14日 15:13:00
 * @Description:
 * @Version: 1.0
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("1", "lwc");
        hashMap.put("2", "shb");
        hashMap.put("3", "qqq");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}