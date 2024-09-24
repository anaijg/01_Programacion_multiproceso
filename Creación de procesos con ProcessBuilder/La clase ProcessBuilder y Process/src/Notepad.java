import java.util.Map;

public class Notepad {
   public static void main(String[] args) {

      // con ProcessBuilder creamos el objeto que servirá para ejecutar el proceso
      ProcessBuilder pb1 = null;


      try {
         // Creamos dos objetos que, cuando sean lanzados con start(), abrirán el bloc de notas

         pb1 = new ProcessBuilder("notepad.exe", "datos.txt");

         // con el método pb1.command() recuperamos la información que hemos pasado a ProccessBuilder()
         System.out.println(pb1.command());

         // Con el método environment recuperamos las variables de entorno del proceso que se va a crear
         // Nos lo devuelve en un mapa
         // tiene que ser antes de lanzar el proceso con start()
         Map<String, String> contexto = pb1.environment();
         for (Map.Entry<String, String> entradaDelMapa: contexto.entrySet()) {
           // System.out.println(entradaDelMapa.getKey() + "/t" + entradaDelMapa.getValue());
         }

         // al lanzar el objeto processbuilder con el método start() es cuando se crea el proceso
         Process  proceso1 = pb1.start();

         // escribimos en el fichero
         EscribirFichero escribirFichero = new EscribirFichero();
         escribirFichero.escribir();

         // finalizamos el proceso con el método destroy()
         //proceso1.destroy();

         // recuperamos el valor de retorno
         int valorRetornado1 = proceso1.waitFor();

         // en función del valor retornado podemos realizar una u otra acción
         switch (valorRetornado1) {
            case 0 -> System.out.println("El proceso ha finalizado con éxito.");
            case 1 -> System.out.println("Ha habido un error. (Estoy en el switch)");
            default -> System.out.println("Ha sucedido un error más desconocido todavía.");
         }
      } catch (Exception e) {
         System.out.println(e.getMessage());
         System.exit(10);
      }
   }
}