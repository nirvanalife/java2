package learning;

public class ThreadId extends ThreadLocal{
    private int nextId;
    public ThreadId(){
        nextId=10001;
    }
    private synchronized Integer getNewID(){
        Integer id=new Integer(nextId);
        nextId++;
        return id;
    }
//    线程第一次调用get或set时执行且只执行一次
    protected Object initialValue(){
        print("in initialValue()");
        return getNewID();
    }

    public int getThreadID(){
//        返回当前线程所对应的线程局部变量
        Integer id= (Integer) get();
        return id.intValue();
    }
    private static void print(String msg){
        String name=Thread.currentThread().getName();
        System.out.println(name+": "+msg);
    }


}
class Main1 extends Object implements Runnable{
    private ThreadId var;
    public Main1(ThreadId v){
        this.var=v;
    }
    @Override
    public void run() {
        try{
            print("var getThreadID=" + var.getThreadID());
            Thread.sleep(2000);
            print("var getThreadID ="+var.getThreadID());
        }catch (Exception e){

        }
    }

    public static void print(String msg){
        String name=Thread.currentThread().getName();
        System.out.println(name+": "+msg);
    }
    public static void main(String []arg){
        ThreadId tid=new ThreadId();
        Main1 shared=new Main1(tid);

        try{
            Thread threadA=new Thread(shared,"threadA");
            threadA.start();
            Thread.sleep(500);
            Thread threadB=new Thread(shared,"threadB");
            threadB.start();
            Thread.sleep(500);
            Thread threadC=new Thread(shared,"threadC");
            threadC.start();
            Thread.sleep(500);


        }catch(Exception e){

        }
    }

}
