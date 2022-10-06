import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Ejemplo7B {

  public static void main(String[] args) {
    try {
      File directorio = new File(".\\bin");
      ProcessBuilder pb = new ProcessBuilder("java", "Ejemplo7A");
      pb.directory(directorio);
      Process proceso = null;

      proceso = pb.start();
      
      // Introducimos la información que el proceso espera recibir
      OutputStream ops = proceso.getOutputStream();
      ops.write("Michel".getBytes());
      ops.flush();
      ops.close();

      // Creamos un InpuStream para leer la salida
      InputStream salida = proceso.getInputStream(); // Creamos un InpuStream para leer el error
      BufferedReader br = new BufferedReader(new InputStreamReader(salida));
      String linea;
      while ((linea = br.readLine()) != null) System.out.println(linea);
      salida.close();

      int valorSalida = proceso.waitFor(); // Recojemos la salida de System.exit
      System.out.println("El valor de la salida: " + valorSalida);
      
      // Si se ha producido un error mostramos el mensaje de error
      if (valorSalida != 0) {
        InputStream errorStream = proceso.getErrorStream(); // Creamos un InpuStream para leer el error
        BufferedReader bre = new BufferedReader(
          new InputStreamReader(errorStream)
        );
        String lineaError;
        while ((lineaError = bre.readLine()) != null) System.out.println(
          "Error-> " + lineaError
        );
        errorStream.close();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
