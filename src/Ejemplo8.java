import java.io.File;
import java.io.IOException;

public class Ejemplo8 {
    public static void main(String[] args) {
        ProcessBuilder proceso = new ProcessBuilder("CMD",  "/c", "dirrr");
        File fSalida = new File("resources/salida.txt");
        File fError =  new File("error.txt");

        proceso.redirectOutput(fSalida);
        proceso.redirectError(fError);

        try {
            proceso.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
