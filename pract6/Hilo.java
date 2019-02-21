import java.lang.Thread;

public class Hilo extends Thread {
    int num;
    public Hilo(int num) {
        this.num = num;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo " + num + " i = " + i);
        }
    }
}