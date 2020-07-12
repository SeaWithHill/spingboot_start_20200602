package SenirThread;

import com.mabf.entity.User;

import java.util.concurrent.*;

/**
 * @author mabf
 * @create 2020-07-10 21:30
 */
public class ThreadInvoke {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        String s = new String("name");
        Runnable target;
        int circleTimes = 10;
        s = s + "123";
        for (int i = 0; i < circleTimes; i++) {
            String  curThreadName = "ThreadInvoke "+i;
            ThreadUser1 threadUser11 = new ThreadUser1(curThreadName);
            threadUser11.start();
        }
        Thread thread = new Thread("intertupt test"){
            @Override
            public void run() {
                for (;;) {
                    try {
                        int i = 100;
                        int j = 100;
                    }  catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<Object> task =  new Callable<Object>(){
            @Override
            public Object call() throws Exception {
                    User user = new User();
                    user.setCenter_name("13123");
                    Object result = user;
                    return result;
            };
        };
        Future<Object> future = executorService.submit(task);
        future.get(3, TimeUnit.SECONDS);

        RunnableUser1 runnableUser1 = new RunnableUser1();
        RunnableUser2 runnableUser2 = new RunnableUser2();
        runnableUser1.run();
        runnableUser2.run();
        s = "123123";
    }
}
