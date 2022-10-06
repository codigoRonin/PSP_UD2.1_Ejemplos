import java.io.File;
import java.io.IOException;

public class Ejemplo9 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("CMD");

        File fEntrada = new File("resources/fichero.bat");
        File fSalida = new File("resources/salida.txt");
        File fError =  new File("resources/error.txt");

        pb.redirectInput(fEntrada);
        pb.redirectOutput(fSalida);
        pb.redirectError(fError);
        Process proceso;

        try {
            proceso = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
