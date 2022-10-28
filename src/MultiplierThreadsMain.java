/*
 * This program creates 10 threads, each one with its own number, and launches
 * them all to get the multiplication tables of all 10 numbers.
 */

public class MultiplierThreadsMain
{
    public static void main(String[] args) throws InterruptedException 
    {
        for (int i = 1; i <= 10; i++)
        {
            Thread t = new MultiplierThread(i);
            t.setName("Hilo " + i + " de la tabla de multilpicar");
            t.start();
            Thread.sleep(2000);
            System.out.println("Hilo " + t.getName() + " se ha lanzado" );
        }
    }
    
}
