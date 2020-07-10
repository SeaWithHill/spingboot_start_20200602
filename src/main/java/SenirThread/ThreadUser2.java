package SenirThread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author mabf
 * @create 2020-07-10 21:25
 */
public class ThreadUser2 extends Thread {


    private static Logger logger = LoggerFactory.getLogger(ThreadUser2.class);

    @Override
    public void run() {
        int c = 500;
        int d = 300;
        logger.info("c plus d values {}", c + d);
    }
}
