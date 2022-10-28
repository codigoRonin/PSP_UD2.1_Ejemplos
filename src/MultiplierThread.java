/*
 * This class is used to show the multiplication table of a given number from
 * a thread
 */

public class MultiplierThread extends Thread {
    // Number to get its multiplication table
    int number;

    public MultiplierThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
                // try {
                //     Thread.sleep(3000);
                // } catch (InterruptedException e) {
                //    e.printStackTrace();
                // }
               
        }
    }
}
