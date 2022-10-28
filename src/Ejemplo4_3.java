public class Ejemplo4_3 {
    public static void main(String[] args) {
        Thread t = new Thread(new Ejemplo4_3_Runnable(), "Hilo que Cuenta");
        t.start();
    }
    
}
