public class ExitValue {
    public static void main(String[] args) {
        try {
            // 1) Lanzamos el comando ls -l para guardar el listado de la carpeta /bin en un fichero
            String comando1 = "ls -l /bin > /home/administrador/output/ejecutables.txt";
            String comando2 = "pwd";
            String comando3 = "uname -a";
            String comando4 = "date";


            ProcessBuilder pb1 = new ProcessBuilder(comando1.split("\\s"));
            ProcessBuilder pb2 = new ProcessBuilder(comando2.split("\\s"));
            ProcessBuilder pb3 = new ProcessBuilder(comando3.split("\\s"));
            ProcessBuilder pb4 = new ProcessBuilder(comando4.split("\\s"));

            Process proceso1 = pb1.start();
            Process proceso2 = pb2.start();
            Process proceso3 = pb3.start();
            Process proceso4 = pb4.start();

            // 2) Esperamos a que el proceso termine y obtenemos el código de finalización.
            int exitCode1 = proceso1.waitFor();
            int exitCode2 = proceso2.waitFor();
            int exitCode3 = proceso3.waitFor();
            int exitCode4 = proceso4.waitFor();

            System.out.println(exitCode1);
            System.out.println(exitCode2);
            System.out.println(exitCode3);
            System.out.println(exitCode4);

        } catch (Exception e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
