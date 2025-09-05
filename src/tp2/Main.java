package tp2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("=== TP2 Programacion Estructurada ===");
            System.out.println("1) Año bisiesto");
            System.out.println("2) Mayor de tres");
            System.out.println("3) Clasificacion de edad");
            System.out.println("4) Descuento por categoria");
            System.out.println("5) Suma de pares (while)");
            System.out.println("6) Contador Pos/Neg/Ceros (for)");
            System.out.println("7) Validacion de nota (do-while)");
            System.out.println("8) Precio final (impuesto y descuento)");
            System.out.println("9) Costo de envio + total");
            System.out.println("10) Actualizar stock");
            System.out.println("11) Descuento especial (global)");
            System.out.println("12) Array de precios (modificar y mostrar)");
            System.out.println("13) Impresión recursiva de array");
            System.out.println("0) Salir");
            System.out.print("Opcion: ");
            while (!sc.hasNextInt()) { System.out.print("Ingrese numero: "); sc.next(); }
            op = sc.nextInt();
            switch (op) {
                case 1 -> Ej01Bisiesto.main(null);
                case 2 -> Ej02MayorDeTres.main(null);
                case 3 -> Ej03ClasificacionEdad.main(null);
                case 4 -> Ej04DescuentoCategoria.main(null);
                case 5 -> Ej05SumaParesWhile.main(null);
                case 6 -> Ej06ContadorPNC.main(null);
                case 7 -> Ej07ValidacionNota.main(null);
                case 8 -> Ej08PrecioFinal.main(null);
                case 9 -> Ej09CostoEnvioYTotal.main(null);
                case 10 -> Ej10ActualizarStock.main(null);
                case 11 -> Ej11DescuentoEspecial.main(null);
                case 12 -> Ej12ArrayPrecios.main(null);
                case 13 -> Ej13RecursivoArray.main(null);
                case 0 -> System.out.println("Fin.");
                default -> System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (op != 0);
    }
}
