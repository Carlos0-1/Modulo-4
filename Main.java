import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GestorEmpleados gestor = new GestorEmpleados();
            int opcion;
            
            do {
                System.out.println("\nMenu de Gestion de Empleados:");
                System.out.println("1. Agregar empleado");
                System.out.println("2. Mostrar empleados");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el nombre del empleado: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la edad del empleado: ");
                        int edad = scanner.nextInt();
                        System.out.print("Ingrese el salario del empleado: ");
                        double salario = scanner.nextDouble();
                        gestor.agregarEmpleado(nombre, edad, salario);
                    }
                    case 2 -> gestor.mostrarEmpleados();
                    case 3 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opcion no valida. Intente nuevamente.");
                }
            } while (opcion != 3);
        }
    }
}
