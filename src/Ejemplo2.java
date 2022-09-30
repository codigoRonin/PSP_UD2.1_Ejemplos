import java.io.File;

public class Ejemplo2 {
    public static void main(String[] args) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("mkdir", "CarpetaPrueba");
    //   pb.directory(new File("."));
        pb.directory(new File("C:\\Users\\miche\\Desktop"));
        Process proceso;
        try {
            proceso = pb.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

