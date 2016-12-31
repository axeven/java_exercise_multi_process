package test;

/**
 *
 * @author muhammad lathif pambudi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("s td 0 0 0");
            int count = 2;
            ProcessLauncher pl = new ProcessLauncher(count);
            pl.start();
        } else {
            ThreadLauncher threads = new ThreadLauncher(2);
            threads.start();
        }
    }

}
