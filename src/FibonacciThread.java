/* The thread class that will show Fibonacci numbers */

class FibonacciThread extends Thread {
    // Upper limit for the count
    int top;

    public FibonacciThread(int top) {
        this.top = top;
    }

    @Override
    public void run() {
        int n1 = 0, n2 = 1;

        for (int i = 1; i <= top; i++) {
            System.out.print("" + n2 + " ");
            int aux = n2;
            n2 = n2 + n1;
            n1 = aux;
        }

        System.out.println();
    }

}
