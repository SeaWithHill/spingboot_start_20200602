package SenirThread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author mabf
 * @create 2020-07-10 21:45
 */
public class RunnableUser1 implements  Runnable {
    private static Logger logger = LoggerFactory.getLogger(RunnableUser1.class);
    @Override
    public void run() {
        int a = 100;
        int b = 100;
        logger.info("a plus b values {}",a+b);
    }
}
