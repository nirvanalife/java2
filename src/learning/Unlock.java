package learning;

import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Unlock {
    public static String obj1="obj1";
    public static String obj2="obj2";
    public static final Semaphore a1=new Semaphore(1);
    public static final Semaphore a2=new Semaphore(1);
    public static void main(String []arg){
        LockAa la=new LockAa();
        la.start();
        LockBb lb=new LockBb();
        lb.start();
    }

}
class LockAa extends Thread{
    public void run(){
        try{
            System.out.println(new Date().toString()+"Lock A开始执行");
            while(true){
                if(Unlock.a1.tryAcquire(1, TimeUnit.SECONDS)){
                    System.out.println(new Date().toString()+"LockA 锁住 obj1");
                    Thread.sleep(60);
                    if(Unlock.a2.tryAcquire(1,TimeUnit.SECONDS)){
                        System.out.println(new Date().toString()+"Lock A 锁住 obj2");
                        Thread.sleep(60*10000);
                    }else{
                        System.out.println(new Date().toString()+"Lock A 锁 obj2失败");
                    }
                }else{
                    System.out.println(new Date().toString()+"Lock A 锁 obj1 失败");
                }
                Unlock.a1.release();
                Unlock.a2.release();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class LockBb extends Thread{
    public void run(){
        try{
            System.out.println(new Date().toString()+"Lock B开始执行");
            while(true){
                if(Unlock.a2.tryAcquire(1, TimeUnit.SECONDS)){
                    System.out.println(new Date().toString()+"LockB 锁住 obj2");
                    Thread.sleep(60);
                    if(Unlock.a1.tryAcquire(1,TimeUnit.SECONDS)){
                        System.out.println(new Date().toString()+"Lock B 锁住 obj1");
                        Thread.sleep(60*10000);
                    }else{
                        System.out.println(new Date().toString()+"Lock B 锁 obj1失败");
                    }
                }else{
                    System.out.println(new Date().toString()+"Lock B 锁 obj2 失败");
                }
                Unlock.a1.release();
                Unlock.a2.release();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
