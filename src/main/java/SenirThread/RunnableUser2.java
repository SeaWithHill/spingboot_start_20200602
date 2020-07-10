package SenirThread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author mabf
 * @create 2020-07-10 21:48
 */
public class RunnableUser2 implements  Runnable{
    private static Logger logger = LoggerFactory.getLogger(RunnableUser1.class);
    @Override
    public void run() {
        int c = 100;
        int d = 100;
        logger.info("c plus d values {}",c+d);
    }
}
