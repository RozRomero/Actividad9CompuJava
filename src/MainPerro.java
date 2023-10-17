import java.util.Scanner;

public class MainPerro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del primer perro:");
        System.out.print("Nombre del perro: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Raza del perro: ");
        String raza1 = scanner.nextLine();

        int edad1 = 0;
        boolean edadValida = false;
        while (!edadValida) {
            try {
                System.out.print("Edad del perro: ");
                edad1 = Integer.parseInt(scanner.nextLine());
                edadValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese una edad válida.");
            }
        }

        double peso1 = 0.0;
        boolean pesoValido = false;
        while (!pesoValido) {
            try {
                System.out.print("Peso del perro (en kg): ");
                peso1 = Double.parseDouble(scanner.nextLine());
                pesoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un peso válido.");
            }
        }

        Perro perro1 = new Perro(nombre1, edad1, raza1, peso1);

        System.out.println("\nIngrese los datos del segundo perro:");
        System.out.print("Nombre del perro: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Raza del perro: ");
        String raza2 = scanner.nextLine();

        int edad2 = 0;
        edadValida = false;
        while (!edadValida) {
            try {
                System.out.print("Edad del perro: ");
                edad2 = Integer.parseInt(scanner.nextLine());
                edadValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese una edad válida.");
            }
        }

        double peso2 = 0.0;
        pesoValido = false;
        while (!pesoValido) {
            try {
                System.out.print("Peso del perro (en kg): ");
                peso2 = Double.parseDouble(scanner.nextLine());
                pesoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un peso válido.");
            }
        }

        Perro perro2 = new Perro(nombre2, edad2, raza2, peso2);

        System.out.println("\nAcciones del primer perro:");
        perro1.comer("croquetas", 200);
        System.out.println("Sonido que hace: " + perro1.ladrar());

        System.out.println("\nAcciones del segundo perro:");
        perro2.comer("huesos", 150);
        System.out.println("Sonido que hace: " + perro2.ladrar());

        scanner.close();
    }
}
