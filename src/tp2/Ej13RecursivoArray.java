package tp2;

public class Ej13RecursivoArray {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirRec(precios, 0);

        // Modificar un elemento (índice 2)
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirRec(precios, 0);
    }

    static void imprimirRec(double[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.println("Precio: $" + arr[i]);
        imprimirRec(arr, i + 1);
    }
}