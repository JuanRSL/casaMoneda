package co.edu.konradlorenz.view;

import co.edu.konradlorenz.model.Trm;
import java.util.ArrayList;
import java.util.Scanner;

public class Ventana {

    private final Scanner scanner = new Scanner(System.in);

    public int pedirOpcion() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Mostrar tabla de TRM");
        System.out.println("2. Convertir dólares a pesos o viceversa");
        System.out.println("3. Calcular promedio de TRM");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void mostrarTabla(ArrayList<Trm> semana3a7Feb) {
        System.out.println("\n--- TRM de la semana 3 a 7 de Febrero ---");
        for (Trm trm : semana3a7Feb) {
            System.out.println(trm);
        }
    }

    public int pedirOpcionConversion() {
        System.out.println("Seleccione la opción de conversión:");
        System.out.println("1. Dólares a Pesos");
        System.out.println("2. Pesos a Dólares");
        return scanner.nextInt();
    }

    public double pedirValorConversion() {
        System.out.print("Ingrese el valor a convertir: ");
        return scanner.nextDouble();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarConversion(double resultado) {
        System.out.printf("El resultado de la conversión es: %.2f%n", resultado);
    }

    public void mostrarPromedio(double promedio) {
        System.out.printf("El promedio del TRM es: %.2f%n", promedio);
    }

    public int pedirDiaSeleccionado() {
        System.out.println("Seleccione el día para la conversión (1 a 5):");
        return scanner.nextInt();
    }
}
