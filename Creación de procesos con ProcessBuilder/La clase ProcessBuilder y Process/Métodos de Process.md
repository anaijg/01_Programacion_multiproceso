# **Métodos de la clase java.lang.Process**

| Método | Descripción |
| :---- | :---- |
| **destroy()** | Destruye el proceso sobre el que se ejecuta |
| **exitValue()** | Devuelve el valor de retorno del proceso cuando este finaliza. Sirve para controlar el estado de ejecución. |
| **getErrorStream()** | Proporciona un InputStream conectado a la salida del error del proceso. |
| **getInputStream()** | Proporciona un InputStream conectado a la salida normal del proceso. |
| **getOutputStream()** | Proporciona un OutputStream conectado a la entrada normal del proceso. |
| **isAlive()** | Determina si el proceso está o no en ejecución. |
| **waitFor()** | Bloquea la ejecución del programa que lanza el proceso a la espera de que este último termine. |

Ejemplo: 
````java
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;

public class ProcessExample {  
    public static void main(String[] args) {  
        try {  
            // Crear el proceso*  
            Process process = new ProcessBuilder("ping", "google.com").start();

            // Leer la salida estándar del proceso 
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));

            // Leer la salida de error del proceso 
            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            // Leer la salida estándar
            System.out.println("Salida del comando:");  
            String linea = stdInput.readLine();  
           
            while ((linea) != null) {  
                System.out.println(s);
                linea = stdInput.readLine();
            }

            // Leer la salida de error, si existe
            System.out.println("\nErrores (si los hay): ");
            linea = stdError.readLine();
            while (linea != null) {  
                System.out.println(s);
                linea = stdInput.readLine();
            }

            // Esperar a que el proceso termine y obtener su código de salida
            int exitCode = process.waitFor();  
            System.out.println("\\nEl proceso terminó con código de salida: " + exitCode);

        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
    }  
}
````
