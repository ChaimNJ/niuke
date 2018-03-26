package test29;

public class ThreadB implements Runnable {
    private PrintService service;
    public ThreadB(PrintService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.service_b();
    }
}
