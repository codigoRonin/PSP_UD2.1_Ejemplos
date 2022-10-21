public class Ejemplo4Thread extends Thread{
    @Override
    public void run ()
    {
        for (int i = 1; i <= 10; i++)
            System.out.println("Counting " + i);
    }
}
