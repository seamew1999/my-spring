package bean;


/**
 * @Author: seamew
 * @Title: Husband
 * @CreateTime: 2022年12月05日 14:27:00
 * @Description:
 * @Version: 1.0
 */
public class Husband {

    public Husband() {
    }

    private Wife wife;
    public String queryWife(){
        return "Husband.wife";
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
