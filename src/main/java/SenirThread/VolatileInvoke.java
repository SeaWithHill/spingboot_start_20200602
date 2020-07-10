package SenirThread;

/**
 * @author mabf
 * @create 2020-07-10 22:06
 */
public class VolatileInvoke {
    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        volatileExample.write();
        volatileExample.read();
    }
}
