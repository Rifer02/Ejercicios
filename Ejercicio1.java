import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas notas vas a ingresar? ");
        int n = sc.nextInt();

        double[] notas = new double[n];
        double suma = 0;
        double max = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresá la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
            if (notas[i] > max) {
                max = notas[i];
            }
        }

        double promedio = suma / n;

        System.out.println("La nota más alta es: " + max);
        System.out.println("El promedio es: " + promedio);
        
        sc.close();
    }
    
}
