package learning;

class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;


    RunnableDemo(String name){
        threadName=name;
        System.out.println("Creating"+threadName);
    }

    @Override
    public void run() {
        System.out.println("Running"+threadName);
        try{
            for (int i=4;i>0;i--){
                System.out.println("Thread"+threadName+i);
                //sleep
                Thread.sleep(50);
            }
        }catch (Exception e){
            System.out.println("Thread"+threadName+"interrupted");
        }
        System.out.println("Thread"+threadName+"exciting");
    }

    public void start(){
        System.out.println("Starting"+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }


}

class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;

    ThreadDemo(String name){
        threadName=name;
        System.out.println("create"+threadName);
    }
    public void run(){
        System.out.println("Running"+threadName);
        try{
            for (int i=4;i>0;i--){
                System.out.println("Thread"+threadName+i);
                //sleep
                Thread.sleep(50);
            }
        }catch (Exception e){
            System.out.println("Thread"+threadName+"interrupted");
        }
        System.out.println("Thread"+threadName+"exciting");
    }

    public void start(){
        System.out.println("starting"+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }

}

class DisplayMessage implements Runnable{
    private String message;

    DisplayMessage(String m){
        this.message=m;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(message);
        }
    }
}

class GuessNumber extends Thread{
    private int number;

    GuessNumber(int number){
        this.number=number;
    }

    public void run(){
        int count=0;
        int guess=0;
        do{
            guess=(int)(Math.random()*100+1);
            System.out.println(this.getName()+"guess"+guess);
            count++;
        }while(guess!=number);
        System.out.println("**correct!"+this.getName()+"in"+count+"guesses.**");
    }
}

public class javaThread{
    public static void main(String []a){
//        RunnableDemo R1=new RunnableDemo("Thread-1");
//        R1.start();
//
//        RunnableDemo R2=new RunnableDemo("Thread-2");
//        R2.start();
//
//        ThreadDemo T1=new ThreadDemo("Thread-3");
//        T1.start();
//
//        ThreadDemo T2=new ThreadDemo("Thread-4");
//        T2.start();

        Runnable hello =new DisplayMessage("hello");
        Thread thread1=new Thread(hello);
        thread1.setDaemon(true);
        thread1.setName("hello");
        System.out.println("Starting hello thread...");
        thread1.start();

        Runnable bye=new DisplayMessage("bye");
        Thread thread2=new Thread(bye);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setDaemon(true);
        System.out.println("Starting Goodbye");
        thread2.start();

        System.out.println("start thread3");
        Thread thread3=new GuessNumber(27);
        thread3.setName("thread3");
        thread3.start();
        try{
            //等待该线程终止的时间最长为 millis 毫秒。
            thread3.join(500);
        }catch (Exception e){
            System.out.println("interrupted");
        }
//        System.out.println("starting thread4");

//        Thread thread4=new GuessNumber(117);
//        thread4.start();
        System.out.println("main() is ending...");

    }
}
