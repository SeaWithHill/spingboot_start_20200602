package SenirThread;

/**
 * @author mabf
 * @create 2020-07-10 21:30
 */
public class ThreadInvoke {
    public static void main(String[] args) {
        int circleTimes = 10;
        for (int i = 0; i < circleTimes; i++) {
            ThreadUser1 threadUser11 = new ThreadUser1();
            threadUser11.start();
        }
/*
        RunnableUser1 runnableUser1 = new RunnableUser1();
        RunnableUser2 runnableUser2 = new RunnableUser2();
        runnableUser1.run();
        runnableUser2.run();*/
    }
}
