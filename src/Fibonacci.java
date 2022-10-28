

public class Fibonacci {

    public static void main(String[] args)
    {
        Thread t = new FibonacciThread(8);
        t.start();
    }

}
