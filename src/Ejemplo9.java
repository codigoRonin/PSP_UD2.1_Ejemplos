import java.io.File;
import java.io.IOException;

public class Ejemplo9 {
    public static void main(String[] args) {
        ProcessBuilder proceso = new ProcessBuilder("CMD");

        File fEntrada = new File("resources/fichero.bat");
        File fSalida = new File("resources/salida.txt");
        File fError =  new File("resources/error.txt");

        proceso.redirectInput(fEntrada);
        proceso.redirectOutput(fSalida);
        proceso.redirectError(fError);

        try {
            proceso.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
