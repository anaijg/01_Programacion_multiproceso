import java.io.IOException;

public class Bash {
    ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", "-c", "echo hola mundo");
    Process process;

    {
        try {
            process = processBuilder.start();
        } catch (IOException e) {
            System.out.println("Cuéntame. " + e.getMessage());
        }
    }
}
