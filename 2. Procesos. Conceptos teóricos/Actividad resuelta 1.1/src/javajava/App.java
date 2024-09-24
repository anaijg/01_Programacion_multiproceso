package javajava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
   public static void main(String[] args) {
      try {
         // Start the Python process
         System.out.println("Creamos el proceso desde Java ");
         Process proceso = new ProcessBuilder("java", "C:\\Users\\anaij\\IdeaProjects\\01 Programación multiproceso\\2. Procesos. Conceptos teóricos\\Actividad resuelta 1.1\\src\\javajava.Prueba").start();


         // Wait for the process to complete and get the exit status
         proceso.waitFor();
         int exitStatus = proceso.exitValue();
         System.out.println("Exit status: " + exitStatus);
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}