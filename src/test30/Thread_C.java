package test30;

public class Thread_C extends Thread{
    private Thread_B thread_b;

    public Thread_C(Thread_B thread_b) {
        super();
        this.thread_b = thread_b;
    }

    @Override
    public void run() {
        super.run();
        thread_b.bService();
    }
}
