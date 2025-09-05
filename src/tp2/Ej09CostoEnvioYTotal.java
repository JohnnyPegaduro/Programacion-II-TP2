package tp2;

import java.util.Scanner;

public class Ej09CostoEnvioYTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = sc.nextLine().trim();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        if (costoEnvio < 0) {
            System.out.println("Zona invalida.");
            return;
        }

        double total = calcularTotalCompra(precio, costoEnvio);
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }

    static double calcularCostoEnvio(double peso, String zona) {
        String z = zona.toLowerCase();
        double tarifa;

        if (z.equals("nacional")) {
            tarifa = 5.0;
        } else if (z.equals("internacional")) {
            tarifa = 10.0;
        } else {
            return -1;
        }

        return tarifa * peso;
    }

    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}