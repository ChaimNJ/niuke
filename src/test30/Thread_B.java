package test30;

public class Thread_B  extends Thread{
    public Thread_B() {
        super();
    }

    @Override
    public void run() {
        super.run();
        System.out.println("thread_b run"+System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread_b end"+System.currentTimeMillis());
    }
    synchronized public void bService(){
        System.out.println("bservice"+System.currentTimeMillis());
    }

}
