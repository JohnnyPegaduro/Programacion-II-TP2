package tp2;

import java.util.Scanner;

public class Ej06ContadorPNC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int cer = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int x = sc.nextInt();
            if (x > 0) {
                pos++;
            } else if (x < 0) {
                neg++;
            } else {
                cer++;
            }
        }

        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cer);
    }
}