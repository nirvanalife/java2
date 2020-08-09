package learning;

import java.io.IOException;

public class ThreadInterrupt extends Thread{

    public void run(){
        try {
            sleep(50000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String []arg) throws InterruptedException, IOException {
        Thread thread=new ThreadInterrupt();
        thread.start();
//        System.out.println("按键");
//        System.in.read();
        thread.interrupt();
        thread.join();
        System.out.println("线程已退出");
    }


}
