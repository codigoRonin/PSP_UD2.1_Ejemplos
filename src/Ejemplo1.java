import java.io.IOException;

public class Ejemplo1 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("Notepad");
        Process proceso = null;

        try {
            proceso = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
