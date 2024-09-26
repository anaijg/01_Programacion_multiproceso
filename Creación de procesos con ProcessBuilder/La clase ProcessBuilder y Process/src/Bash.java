import java.io.IOException;

public class Bash {
    public static void main(String[] args) {
        // creas una variable que guarda la forma en que se tiene que lanzar el proceso
        ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", "-c", "echo hola mundo");
        // NO FUNCIONA

        {
            try {
                // el método start() de ProcessBuilder es el crea el Process
                Process process = processBuilder.start();
            } catch (IOException e) {
                System.out.println("Cuéntame. " + e.getMessage());
            }
        }
    }


}
