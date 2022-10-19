/**
 * @Author: seamew
 * @Title: Demo
 * @CreateTime: 2022年10月19日 16:10:00
 * @Description:
 * @Version: 1.0
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("close!");
        }));
        System.out.println(123);
        Thread.sleep(3000);
        System.out.println(456);
    }
}
