package tp2;

import java.util.Scanner;

public class Ej04DescuentoCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char cat = sc.next().trim().toUpperCase().charAt(0);

        double descPct;
        switch (cat) {
            case 'A': descPct = 0.10; break;
            case 'B': descPct = 0.15; break;
            case 'C': descPct = 0.20; break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }

        double descuento = precio * descPct;
        double finalP = precio - descuento;

        System.out.println("Descuento aplicado: " + (int)(descPct * 100) + "%");
        System.out.println("Precio final: " + finalP);
    }
}