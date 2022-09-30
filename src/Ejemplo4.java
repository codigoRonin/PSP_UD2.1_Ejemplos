import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejemplo4 {

  public static void main(String[] args) {
    File directorio = new File(".\\bin");
    ProcessBuilder pb = new ProcessBuilder("java", "Ejemplo3");

    pb.directory(directorio);
    System.out.println("El directorio de trabajo " + pb.directory());
    Process proceso = null;

    try {
      proceso = pb.start();
      int c;
      InputStream is = proceso.getInputStream();
      while ((c = is.read()) != -1) {
        // Imprimimos la salida caracter a caracter
        System.out.print((char) c);
      }
      is.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
