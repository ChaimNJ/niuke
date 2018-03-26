package test29;

import javafx.beans.binding.ObjectExpression;

public class PrintService {
    volatile private boolean preisA = false;
    public synchronized void service_a() {
        try {
            while (preisA == true) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("11111");
            }
            preisA=true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void service_b() {
        try {
            while (preisA == false) {
                wait();
            }
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 5; i++) {
                System.out.println("00000");
            }
            preisA=false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
