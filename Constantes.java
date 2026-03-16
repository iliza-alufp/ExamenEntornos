/**
 * Constantes de uso global en la aplicación.
 *
 * Aquí se agrupan los textos fijos (mensajes mostrados por pantalla) y valores estáticos
 * usados en la lógica para facilitar cambios y traducciones.
 */
public final class Constantes {

    private Constantes() {
        // No instanciable
    }

    // Mensajes de interacción con el usuario.
    public static final String MSG_PEDIR_PORCENTAJE = "Introduzca el porcentaje de aumento de salario: ";
    public static final String MSG_LISTA_EMPLEADOS = "Lista de Empleados:";

    // Mensajes de error / validación.
    public static final String ERR_CAPACIDAD_ALCANZADA = "No se pueden añadir más empleados: capacidad alcanzada.";

    // Convenio salarial
    public static final double SALARIO_MINIMO_CONVENIO = 15000.0;

    // Valores por defecto.
    public static final int CAPACIDAD_POR_DEFECTO = 3;
}
