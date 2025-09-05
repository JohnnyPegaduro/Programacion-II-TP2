package tp2;

import java.util.Scanner;

public class Ej05SumaParesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int n;

        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n % 2 == 0) {
                suma += n;
            }
        }

        System.out.println("La suma de los números pares es: " + suma);
    }
}