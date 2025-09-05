package tp2;

import java.util.Scanner;

public class Ej08PrecioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        double impPct = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
        double descPct = sc.nextDouble();

        double finalP = calcularPrecioFinal(base, impPct / 100.0, descPct / 100.0);
        System.out.println("El precio final del producto es: " + finalP);
    }

    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
}