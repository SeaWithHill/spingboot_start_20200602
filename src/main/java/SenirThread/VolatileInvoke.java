package SenirThread;

/**
 * @author mabf
 * @create 2020-07-10 22:06
 */
public class VolatileInvoke extends VolatileExample implements VolatileInterface {
    public static volatile String s = "123";
    public static volatile String ss = "123";
    public static volatile String sss = "123";


    @Override
    public void test() {

    }

    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        volatileExample.write();
        volatileExample.read();
        String s = "123";
        String s1 = "123213";

    }


}
