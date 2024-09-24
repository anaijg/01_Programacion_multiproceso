import java.io.IOException;

public class Shutdown {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("c:/windows/system32/shutdown -s -t 0".split(" "));
        try {
            Process apagar = processBuilder.start();
        } catch (IOException e) {
            System.out.println("Cuéntame tu problema.");
            System.out.println(e.getMessage());
        }
    }
}
