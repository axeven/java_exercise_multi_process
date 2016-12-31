package test;

/**
 *
 * @author muhammad lathif pambudi
 */
public class ThreadLauncher {

    private final int count;

    public ThreadLauncher(int count) {
        this.count = count;
    }

    public void start() {
        for (int i = 0; i < count; ++i) {
            TestThread t = new TestThread(i);
            t.start();
        }
    }

}
