public class ProcesoPrincipal {
   public static void main(String[] args) {
      try {
         // creamos un proceso con Runtime y exec()
         // en exec le pasamos un array de String con dos cosas: el programa que ejecutará el proceso y el parámetro que le pasamos al programa, en este caso el nombre de la clase en que está ese proceso
         Process proceso = Runtime.getRuntime().exec(new String[]{"java", "2. Procesos. Conceptos teóricos\\Ejemplo de sincronización\\src\\ProcesoSecundario.java"});

         // Queremos saber si el proceso finaliza correctamente. Para ello tenemos que esperar a ver el código de retorno que genera ProcesoSecundario
         int valorRetorno = proceso.waitFor();

         // Comprobamos el valor de retorno, que por defecto es 0 en caso de finalizar bien.
         if (valorRetorno == 0) {
            System.out.println("El proceso ha finalizado correctamente.");
         } else {
            System.out.println("El proceso ha fallado. Código de error: " + valorRetorno);
            System.out.println("(Pero en realidad ha terminado bien. El código de error por defecto es 1");
         }
      } catch (Exception e) {
         System.out.println("Ha saltado una excepción.");
         System.out.println(e.getMessage());
      }
   }
}