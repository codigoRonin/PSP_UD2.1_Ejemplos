public class Ejemplo4 {

    public static void main(String[] args) {
        Ejemplo4Thread t = new Ejemplo4Thread();
        Ejemplo4Thread t2 = new Ejemplo4Thread();
        t.start();
        //System.exit(0);
       // System.out.println("Hello!!");
         t2.start();
    }
}
