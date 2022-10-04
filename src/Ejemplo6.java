import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Ejemplo6 {

  public static void main(String[] args) {
    try {
      ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "date");
      Process proceso = null;
      proceso = pb.start(); //Ejecutamos el proceso
      // Introducimos la información que el proceso espera recibir
      OutputStream ops = proceso.getOutputStream();
      ops.write("01/09/2022".getBytes());
      ops.flush();

      // Leemos la salida
      InputStream is = proceso.getInputStream();
      int c;
      while ((c = is.read()) != -1) { // Imprimimos la salida caracter a caracter
        System.out.print((char) c);
      }
      is.close();

      int valorSalida = proceso.waitFor(); // Recojemos la salida de System.exit
      System.out.println("El valor de la salida: " + valorSalida);
      // Si se ha producido un error mostramos el mensaje de error
      if (valorSalida != 0) {
        InputStream errorStream = proceso.getErrorStream(); // Creamos un InpuStream para leer el error
        BufferedReader br = new BufferedReader(
          new InputStreamReader(errorStream)
        );
        String linea;
        while ((linea = br.readLine()) != null) System.out.println(
          "Error-> " + linea
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
