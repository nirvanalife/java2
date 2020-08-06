package learning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String []arg){
        ExecutorService exec = Executors.newCachedThreadPool();
        final Semaphore semp=new Semaphore(5);
        for (int index=0;index<20;index++){
            final int No=index+1;
            Runnable run=new Runnable() {
                @Override
                public void run() {
                    try{
                        semp.acquire();
                        System.out.println("Accessing: "+No);
                        Thread.sleep(1000);
                        semp.release();
                    }catch (InterruptedException e){

                    }
                }
            };
            exec.execute(run);
        }
        try{
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(semp.getQueueLength());
        //退出线程池
        exec.shutdown();
    }
}
