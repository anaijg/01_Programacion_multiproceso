import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CMD {
    public static void main(String[] args) {
        ProcessBuilder processBuilder1 = new ProcessBuilder("cmd", "/c", "dir > listado.txt");

        try {
            Process proceso1 = processBuilder1.start();
            //System.out.println("¿Está vivo? " + proceso1.isAlive());
            //proceso1.info();
            //proceso1.destroy();
            //System.out.println(proceso1.exitValue());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
