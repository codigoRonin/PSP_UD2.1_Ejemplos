import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejemplo5 {

  public static void main(String[] args) {
    ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dirrrr");
    Process proceso = null;

    try {
      proceso = pb.start(); //Ejecutamos el proceso
      int c;
      InputStream is = proceso.getInputStream();
      while ((c = is.read()) != -1) { // Imprimimos la salida caracter a caracter
        System.out.print((char) c);
      }
      is.close();
      InputStream errorStream = proceso.getErrorStream(); // Creamos un InpuStream para leer el error
      BufferedReader br = new BufferedReader(
        new InputStreamReader(errorStream)
      );
      String linea;
      while ((linea = br.readLine()) != null) System.out.println(
        "Error-> " + linea
      );
      errorStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      int valorSalida = proceso.waitFor(); // Recojemos la salida de System.exit
      System.out.println("El valor de la salida: " + valorSalida);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
