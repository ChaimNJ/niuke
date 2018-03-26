package test29;

public class TheadA implements Runnable {
    private PrintService service;
    public TheadA(PrintService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.service_a();
    }
}
