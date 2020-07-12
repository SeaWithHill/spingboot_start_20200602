package SenirThread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author mabf
 * @create 2020-07-10 21:24
 * 显示显示将扩大空间的分离式
 */
public class ThreadUser1  extends Thread{



    private static Logger logger = LoggerFactory.getLogger(ThreadUser1.class);

    @Override
    public void interrupt() {
        super.interrupt();
    }

    public ThreadUser1(String curThreadName){
            super(curThreadName);
    }


    @Override
    public void run() {
        int a = 100;
        int b = 100;
        String threadName = Thread.currentThread().getName();
        logger.info("{} :a plus b values {}","current thread is "+ threadName,a+b);

    }
}
