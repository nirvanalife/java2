package learning;

public class priority extends Thread{
    private int countDown=5;
    private volatile double d=0;

    public priority(int p){
        setPriority(p);
        start();
    }

    public String toString(){
        return super.toString()+": "+countDown;
    }
    public void run(){
        while(true){
            for(int i=1;i<100000;i++){
                d=d+(Math.PI+Math.E)/(double)i;
                System.out.println(this);
                if(--countDown==0) return;
            }
        }
    }

    public static void main(String []arg){
        new priority(Thread.MAX_PRIORITY);
        for(int i=0;i<5;i++){
            new priority(Thread.MIN_PRIORITY);
        }
    }
}
