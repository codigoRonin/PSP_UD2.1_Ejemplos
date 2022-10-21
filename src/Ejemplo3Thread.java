public class Ejemplo3Thread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Inicio de la ejecución del hilo");
        System.out.println("Fin de la ejecución del hilo");
    }
}