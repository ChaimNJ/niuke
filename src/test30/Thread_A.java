package test30;

public class Thread_A extends Thread {
    private Thread_B thread_b;

    public Thread_A(Thread_B thread_b) {
        super();
        this.thread_b = thread_b;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (thread_b) {
                thread_b.start();
                thread_b.join();
//                Thread.sleep(6000);
                System.out.println("123");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
