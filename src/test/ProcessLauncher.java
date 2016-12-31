package test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author muhammad lathif pambudi
 */
public class ProcessLauncher {

    private final int count;

    public ProcessLauncher(int count) {
        this.count = count;
    }

    public void start() {
        try {
            File jar = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
            for (int i = 0; i < count; ++i) {
                System.out.println("c preparing");
                ProcessBuilder pb = new ProcessBuilder("java", "-jar", jar.getAbsolutePath());
                pb.inheritIO();
                System.out.println("c launching");
                Process process = pb.start();
            }
        } catch (URISyntaxException ex) {
        } catch (IOException ex) {
            System.out.println("c failed to start process");
            System.out.println(ex.getMessage());
        }
    }

}
