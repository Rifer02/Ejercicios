import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPersonas = 0;
        int totalVarones = 0;
        int totalMujeres = 0;
        int varonesEntre16y65 = 0;

        int mayorEdad = -1;
        int dniMayorEdad = 0;
        char sexoMayorEdad = ' ';

        while (true) {
            System.out.print("Ingrese número de documento (0 para terminar): ");
            int dni = scanner.nextInt();

            if (dni == 0) {
                break;
            }

            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();

            System.out.print("Ingrese sexo (F o M): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            totalPersonas++;

            if (sexo == 'M') {
                totalVarones++;
                if (edad >= 16 && edad <= 65) {
                    varonesEntre16y65++;
                }
            } else if (sexo == 'F') {
                totalMujeres++;
            }

            if (edad > mayorEdad) {
                mayorEdad = edad;
                dniMayorEdad = dni;
                sexoMayorEdad = sexo;
            }
        }

        System.out.println("Cantidad total de personas censadas: " + totalPersonas);
        System.out.println("Cantidad de varones: " + totalVarones);
        System.out.println("Cantidad de mujeres: " + totalMujeres);

        if (totalVarones > 0) {
            double porcentaje = (varonesEntre16y65 * 100.0) / totalVarones;
            System.out.println("Porcentaje de varones entre 16 y 65 años: " + porcentaje + "%");
        } else {
            System.out.println("No se ingresaron varones.");
        }

        if (mayorEdad != -1) {
            System.out.println("La persona de mayor edad tiene:");
            System.out.println("DNI: " + dniMayorEdad);
            System.out.println("Edad: " + mayorEdad);
            System.out.println("Sexo: " + sexoMayorEdad);
        }

        scanner.close();
    }
}
