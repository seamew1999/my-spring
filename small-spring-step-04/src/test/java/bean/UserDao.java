package bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: seamew
 * @Title: UserDao
 * @CreateTime: 2022年09月30日 10:51:00
 * @Description:
 * @Version: 1.0
 */
public class UserDao {
    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("10001", "10001");
        map.put("10002", "10002");
        map.put("10003", "10003");
    }

    public String queryUserName(String uId) {
        return map.get(uId);
    }
}
