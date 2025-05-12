import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PRECIO_30 = 750;
        final double PRECIO_50 = 1100;
        final double PRECIO_100 = 1500;
        final double DESCUENTO_100 = 0.05;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cliente " + i + ":");

            System.out.print("Ingrese el DNI: ");
            String dni = sc.next();

            System.out.println("Tipo de servicio:");
            System.out.println("1. Internet 30 megas ($750)");
            System.out.println("2. Internet 50 megas ($1100)");
            System.out.println("3. Internet 100 megas ($1500 con 5% de descuento)");
            System.out.print("Seleccione el número de servicio (1-3): ");
            int tipo = sc.nextInt();

            double monto = 0;

            switch (tipo) {
                case 1:
                    monto = PRECIO_30;
                    break;
                case 2:
                    monto = PRECIO_50;
                    break;
                case 3:
                    monto = PRECIO_100 - (PRECIO_100 * DESCUENTO_100);
                    break;
                default:
                    System.out.println("Tipo de servicio inválido.");
                    continue; // salta al siguiente cliente
            }

            System.out.println("DNI: " + dni);
            System.out.println("Servicio seleccionado: " + tipo);
            System.out.println("Monto a pagar: $" + monto);
            System.out.println("-------------------------------");
        }

        sc.close();
    }
}