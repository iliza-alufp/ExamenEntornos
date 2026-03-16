public class Empleados {
    private Empleado[] lista;
    private int cantidad;

    public Empleados(int capacidad) {
        this.lista = new Empleado[capacidad];
        this.cantidad = 0;
    }

    public void darDeAlta(Empleado empleado) {
        if (cantidad >= lista.length) {
            throw new IllegalStateException(Constantes.ERR_CAPACIDAD_ALCANZADA);
        }
        lista[cantidad++] = empleado;
    }

    public void aumentarSalario(double porcentaje) {
        for (int i = 0; i < cantidad; i++) {
            Empleado empleado = lista[i];
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void mostrarListado() {
        System.out.println(Constantes.MSG_LISTA_EMPLEADOS);
        for (int i = 0; i < cantidad; i++) {
            System.out.println(lista[i]);
        }
    }

    public Empleado[] getLista() {
        Empleado[] copia = new Empleado[cantidad];
        System.arraycopy(lista, 0, copia, 0, cantidad);
        return copia;
    }
}
