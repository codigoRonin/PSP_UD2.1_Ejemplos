public class Ejemplo2Runnable implements Runnable {

    // Atributos, contructores y métodos de mi clase

    private Thread hilo;

    public Ejemplo2Runnable() {
        hilo = new Thread(this, "Me llamo hilo");
        hilo.start();
    }

    @Override
    public void run() {
        // Código a ser ejecutado por el hilo
        System.out.println("Mirame! Soy un hilo!");
        System.out.println("Adios! Yo era un hilo");

    }

}
