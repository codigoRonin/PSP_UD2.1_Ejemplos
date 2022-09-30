import java.io.IOException;
import java.io.InputStream;

public class Ejemplo3 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dirl");
        Process proceso = null;

        try {
            // Ejecutamos el proceso llamado a la terminal
            // indicando que ejecute el comando"DIR" y se cierre al terminar
            proceso = pb.start();

           
            InputStream is = proceso.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                // Imprimimos la salida caracter a caracter
                System.out.print((char) c);
            }
            is.close();
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
