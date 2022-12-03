package bean;

import com.seamew.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: seamew
 * @Title: UserDao
 * @CreateTime: 2022年12月03日 17:23:00
 * @Description:
 * @Version: 1.0
 */
@Component
public class UserDao {

    private static final Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("1", "北京");
        hashMap.put("2", "苏州");
        hashMap.put("3", "西安");
    }

    public String queryUserName(String id) {
        return hashMap.get(id);
    }

}
