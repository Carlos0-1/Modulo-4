import java.util.ArrayList;

public class GestorEmpleados {
    private final ArrayList<Empleado> empleados;

    public GestorEmpleados() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(String nombre, int edad, double salario) {
        Empleado nuevoEmpleado = new Empleado(nombre, edad, salario);
        empleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado exitosamente.");
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado e : empleados) {
                e.mostrarInformacion();
            }
        }
    }
}
