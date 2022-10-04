import java.util.Scanner;

public class Ejemplo7A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);
        sc.close();
    }
}