package SenirThread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author mabf
 * @create 2020-07-10 22:04
 * 用来显测试测试
 */
public class VolatileExample {
    private static Logger logger = LoggerFactory.getLogger(VolatileExample.class);
    int x = 42;
    volatile  boolean v = false;
    public void write(){
        v = true;
        x = 52;
    }
    public void read(){
        if(v == true){
            logger.info("x value is {}",x);
        }
    }



}
