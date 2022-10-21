public class Ejemplo2 {
    public static void main(String[] args) {
        System.out.println("Hola! Soy un proceso");

        new Ejemplo2Runnable();
        System.out.println("Adios! Soy un proceso");

    }
}
