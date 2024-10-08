import java.util.List;

public class Task {
    public static void main(String[] args) {
        try {
            // 1) Lanzamos el comando ls -l para guardar el listado de la carpeta /bin en un fichero
            String comando = "ls -l /bin > /home/administrador/output/ejecutables.txt";



        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}