import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Empleados empleados = new Empleados(Constantes.CAPACIDAD_POR_DEFECTO);
        empleados.darDeAlta(new Empleado("Juan Pérez", Cargo.DESARROLLADOR, 50000));
        empleados.darDeAlta(new Empleado("María González", Cargo.DISEÑADOR, 45000));
        empleados.darDeAlta(new Empleado("Pedro López", Cargo.GERENTE, 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Constantes.MSG_PEDIR_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarListado();

        scanner.close();
    }
}
