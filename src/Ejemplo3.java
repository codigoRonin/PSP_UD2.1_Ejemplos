public class Ejemplo3 {
    public static void main(String[] args) {
        System.out.println("Inicio del proceso padre");
        Thread t = new Ejemplo3Thread();
        t.start();
        System.out.println("Fin del proceso padre");
    }
}
