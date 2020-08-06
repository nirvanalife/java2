package learning;

import java.util.Date;

class LockA extends Thread{
    public void run(){
        try{
            System.out.println(new Date().toString()+"Lock A 开始执行");
            while(true){
                synchronized (LockTest.obj1){
                    System.out.println(new Date().toString()+"Lock A 锁住 obj1");
                    Thread.sleep(3000);
                    synchronized (LockTest.obj2){
                        System.out.println(new Date().toString()+"Lock A 锁住 obj2");
                        Thread.sleep(60*1000);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
class LockB extends Thread{
    public void run(){
        try{
            System.out.println(new Date().toString()+"Lock B 开始执行");
            while(true){
                synchronized (LockTest.obj2){
                    System.out.println(new Date().toString()+"Lock B 锁住 obj2");
                    Thread.sleep(3000);
                    synchronized (LockTest.obj1){
                        System.out.println(new Date().toString()+"Lock B 锁住 obj1");
                        Thread.sleep(60*1000);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
class LockTest{
    public static String obj1="obj1";
    public static String obj2="obj2";
    public static void main(String []arg){
        LockA lockA=new LockA();
        lockA.start();
        LockB lockB=new LockB();
        lockB.start();

    }
}
