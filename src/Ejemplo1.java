public class Ejemplo1 {
  public static void main(String[] args) {

    Thread hilo;

    System.out.println("Hola! Soy un proceso");
    hilo = new Thread(new Ejemplo1Runnable());
    hilo.start();
    System.out.println("Adios! Era un proceso");

  }
}
