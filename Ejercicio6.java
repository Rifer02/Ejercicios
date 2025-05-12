import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int mejorVehiculo = 0;
        double mejorTiempo = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Competidor " + i);
            System.out.print("Ingrese el número del vehículo: ");
            int numeroVehiculo = scanner.nextInt();

            System.out.print("Ingrese el tiempo en segundos: ");
            double tiempo = scanner.nextDouble();

            if (i == 1 || tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                mejorVehiculo = numeroVehiculo;
            }
        }

        System.out.println("El vehículo con el mejor tiempo fue el número " + mejorVehiculo);
        System.out.println("Con un tiempo de " + mejorTiempo + " segundos");
        
        scanner.close();
    }
}
