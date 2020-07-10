package SenirThread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author mabf
 * @create 2020-07-10 21:24
 */
public class ThreadUser1  extends Thread{



    private static Logger logger = LoggerFactory.getLogger(ThreadUser1.class);

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String threadName = thread.getName();
        int a = 100;
        int b = 100;
        logger.info("{} :a plus b values {}",threadName,a+b);
    }
}
