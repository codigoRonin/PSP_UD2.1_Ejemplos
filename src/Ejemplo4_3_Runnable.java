public class Ejemplo4_3_Runnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " ejecutandose");
        for (int i = 1; i <= 10; i++) {
  
            System.out.println("Contando " + i);
        }

    }

}
