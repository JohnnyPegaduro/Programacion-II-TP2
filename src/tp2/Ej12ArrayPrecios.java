package tp2;

public class Ej12ArrayPrecios {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrar(precios);

        // Modificar un elemento (índice 2)
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        mostrar(precios);
    }

    static void mostrar(double[] arr) {
        for (double p : arr) {
            System.out.println("Precio: $" + p);
        }
    }
}