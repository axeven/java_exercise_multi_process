package test;

/**
 *
 * @author muhammad lathif pambudi
 */
public class TestThread extends Thread {

    private final int id;

    public TestThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(id + " started ...");
        boolean running = true;
        while (running) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(id + " interupted");
                running = false;
            }
        }
    }

}
