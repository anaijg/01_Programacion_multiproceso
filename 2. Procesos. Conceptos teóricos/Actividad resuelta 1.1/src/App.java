import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
   public static void main(String[] args) {
      try {
         // Start the Python process
         Process proceso = new ProcessBuilder("python", "2. Procesos. Conceptos teóricos\\Actividad resuelta 1.1\\src\\proceso_python.py").start();

         // Read the output from the Python process
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
         String line;
         while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
         }

         // Wait for the process to complete and get the exit status
         proceso.waitFor();
         int exitStatus = proceso.exitValue();
         System.out.println("Exit status: " + exitStatus);
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}