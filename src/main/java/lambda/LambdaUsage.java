package lambda;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author mabf
 * @create 2020-07-10 1:43
 */
public class LambdaUsage {

    public static Logger logger = LoggerFactory.getLogger(LambdaUsage.class);

    public static void main(String[] args) {
        System.out.print("123123");
        LambdaOperate add = (int a,int b)-> a+b;
        LambdaOperate mins = (int a,int b)-> a-b;
        LambdaUsage usage = new LambdaUsage();
        logger.info("add value{}",usage.operate(100,200,add));
    }

    interface  LambdaOperate{
        int lamdaOperate(int a,int b);
    }

    private int operate(int a,int b,LambdaOperate operate){
       return operate.lamdaOperate(a,b);
    }
}
