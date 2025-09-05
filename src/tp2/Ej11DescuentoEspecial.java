package tp2;

import java.util.Scanner;

public class Ej11DescuentoEspecial {
    static final double DESCUENTO_ESPECIAL = 0.10; // 10%

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        double precioFinal = calcularDescuentoEspecial(precio);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL; // variable local
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        return precio - descuentoAplicado;
    }
}