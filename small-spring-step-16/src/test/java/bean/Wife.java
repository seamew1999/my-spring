package bean;

import java.io.Serializable;

/**
 * @Author: seamew
 * @Title: Wife
 * @CreateTime: 2022年12月05日 14:27:00
 * @Description:
 * @Version: 1.0
 */
public class Wife {
    private Husband husband;
    private IMother mother; // 婆婆

    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String queryHusband() {
        // return "Wife.husband、Mother.callMother：" + mother.callMother();
        return "Wife";
    }

    public Wife() {
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public void setMother(IMother mother) {
        this.mother = mother;
    }
}