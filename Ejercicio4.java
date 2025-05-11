import java.util.Scanner;

public class Camiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] patentes = new String[30];
        String[] choferes = new String[30];
        String[] carga = new String[30];
        String[] hora = new String[30];
        int cantidadTe = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Patente del camión " + (i + 1) + ": ");
            patentes[i] = sc.nextLine();

            System.out.print("Nombre y apellido del chofer: ");
            choferes[i] = sc.nextLine();

            System.out.print("Tipo de carga (madera, yerba o té): ");
            carga[i] = sc.nextLine();

            System.out.print("Hora de egreso: ");
            hora[i] = sc.nextLine();

            String tipo = carga[i].toLowerCase().replace("é", "e").trim();
            if (tipo.equals("te")) {
                cantidadTe++;
            }

            System.out.println();
        }

        System.out.println("Cantidad de camiones que cargaron té: " + cantidadTe);
        System.out.println();

        for (int i = 0; i < 30; i++) {
            System.out.println("Camión " + (i + 1) + ":");
            System.out.println("Patente: " + patentes[i]);
            System.out.println("Chofer: " + choferes[i]);
            System.out.println("Carga: " + carga[i]);
            System.out.println("Hora de egreso: " + hora[i]);
            System.out.println();
        }

        sc.close();
    }
}
