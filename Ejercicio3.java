import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos productos vas a ingresar? ");
        int n = sc.nextInt();

        double[] cantidades = new double[n];
        double[] costos = new double[n];
        double precioTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la cantidad del producto " + (i + 1) + ": ");
            cantidades[i] = sc.nextDouble();
            System.out.print("Ingresa el costo del producto " + (i + 1) + ": ");
            costos[i] = sc.nextDouble();

            precioTotal += cantidades[i] * costos[i];
        }

        System.out.println("El precio total es: " + precioTotal);

        System.out.println("Productos con precio superior a $1000:");
        for (int i = 0; i < n; i++) {
            double precioProducto = cantidades[i] * costos[i];
            if (precioProducto > 1000) {
                System.out.println("Producto " + (i + 1) + " con precio: " + precioProducto);
            }
        }
        sc.close();
    }
}
