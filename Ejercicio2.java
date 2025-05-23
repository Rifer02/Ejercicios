import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Ingrese la cantidad de notas: ");
        int n = sc.nextInt();

        int[] notas = new int[n];
        int aprobados = 0, desaprobados = 0;

   
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (notas[i] >= 6) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);

        sc.close();
    }
}
