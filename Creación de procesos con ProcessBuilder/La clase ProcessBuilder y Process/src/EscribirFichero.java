import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

    public void escribir() {
        String ruta = "C:\\Users\\anaij\\IdeaProjects\\01 Programación multiproceso\\datos.txt";
        File fichero = new File(ruta);


        {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(fichero, true);
                for (int i = 0; i < 5; i++) {
                    fileWriter.append("currupipi\n");
                }
            } catch (IOException e) {
                System.out.println("Error " + e.getMessage());
            } finally {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("No se puede cerrar el fichero (por lo que sea)");
                }
            }
        }
    }
}
