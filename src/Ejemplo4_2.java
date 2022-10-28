public class Ejemplo4_2 {

    public static void main(String[] args) {
        Ejemplo4Thread t = new Ejemplo4Thread();
        t.setName("Mi hilo A");
        t.start();
        System.out.println("Hilo " + t.getName() + " ha sido lanzado");

    }
}
