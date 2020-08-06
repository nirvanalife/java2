package learning;

class ThreadState extends Thread{
    boolean waiting=true;
    boolean ready=false;
    ThreadState(){

    }
    public void run(){
        String thrname=Thread.currentThread().getName();
        System.out.println(thrname+"starting");
        while(waiting){
            System.out.println("waiting:"+waiting);
            System.out.println("waiting");
            startWait();
            try{

                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(thrname+"interrupted");
            }
            System.out.println(thrname+"terminating");
        }
    }

    synchronized void startWait(){
        try{
            while (!ready)
            {
                System.out.println("waiting place "+ready);
                wait();
            }

        }catch(InterruptedException e){
            System.out.println("wait() interrupted");
        }
    }
    synchronized void notice() {
        ready=true;
        notify();
    }
}
class Main{
    public static void main(String []arg) throws InterruptedException {
        ThreadState thrd=new ThreadState();
        thrd.setName("MyThread #1");
        showThreadStatus(thrd);
        thrd.start();
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.waiting=false;
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.notice();
        Thread.sleep(50);
        showThreadStatus(thrd);
        while(thrd.isAlive()){
            System.out.println("alive");
        }
        showThreadStatus(thrd);


    }
    static void showThreadStatus(Thread thrd){
        System.out.println(thrd.getName()+" Alive:="+thrd.isAlive()+" state:="+thrd.getState());
    }
}
