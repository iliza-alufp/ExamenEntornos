import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test
    void constructorValido_deberiaCrearEmpleado() {
        Empleado empleado = new Empleado("Juan Pérez", Cargo.DESARROLLADOR, Constantes.SALARIO_MINIMO_CONVENIO);

        assertEquals("Juan Pérez", empleado.getNombre());
        assertEquals(Cargo.DESARROLLADOR, empleado.getCargo());
        assertEquals(Constantes.SALARIO_MINIMO_CONVENIO, empleado.getSalario());
    }

    @Test
    void setNombreValido_deberiaActualizarNombre() {
        Empleado empleado = new Empleado("Juan Pérez", Cargo.DESARROLLADOR, Constantes.SALARIO_MINIMO_CONVENIO);
        empleado.setNombre("María Gómez");

        assertEquals("María Gómez", empleado.getNombre());
    }

    @Test
    void setCargoValido_deberiaActualizarCargo() {
        Empleado empleado = new Empleado("Juan Pérez", Cargo.DESARROLLADOR, Constantes.SALARIO_MINIMO_CONVENIO);
        empleado.setCargo(Cargo.GERENTE);

        assertEquals(Cargo.GERENTE, empleado.getCargo());
    }

    @Test
    void setSalarioValido_deberiaActualizarSalario() {
        Empleado empleado = new Empleado("Juan Pérez", Cargo.DESARROLLADOR, Constantes.SALARIO_MINIMO_CONVENIO);
        double salarioNuevo = Constantes.SALARIO_MINIMO_CONVENIO + 1234.56;
        empleado.setSalario(salarioNuevo);

        assertEquals(salarioNuevo, empleado.getSalario());
    }

    @Test
    void constructorNombreNulo_lanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado(null, Cargo.DESARROLLADOR, Constantes.SALARIO_MINIMO_CONVENIO));
    }

    @Test
    void constructorNombreVacio_lanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("", Cargo.DESARROLLADOR, Constantes.SALARIO_MINIMO_CONVENIO));
    }

    @Test
    void constructorNombreUnaPalabra_lanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("Juan", Cargo.DESARROLLADOR, Constantes.SALARIO_MINIMO_CONVENIO));
    }

    @Test
    void constructorCargoNulo_lanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("Juan Pérez", null, Constantes.SALARIO_MINIMO_CONVENIO));
    }

    @Test
    void constructorSalarioNegativo_lanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("Juan Pérez", Cargo.DESARROLLADOR, -1));
    }

    @Test
    void constructorSalarioPorDebajoConvenio_lanzaIllegalArgumentException() {
        double salarioInferior = Constantes.SALARIO_MINIMO_CONVENIO - 1;
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("Juan Pérez", Cargo.DESARROLLADOR, salarioInferior));
    }

    @Test
    void constructorSalarioNaN_lanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("Juan Pérez", Cargo.DESARROLLADOR, Double.NaN));
    }

    @Test
    void setNombreNulo_lanzaIllegalArgumentException() {
        Empleado empleado = new Empleado("Juan Pérez", Cargo.DESARROLLADOR, Constantes.SALARIO_MINIMO_CONVENIO);
        assertThrows(IllegalArgumentException.class, () -> empleado.setNombre(null));
    }

    @Test
    void setCargoNulo_lanzaIllegalArgumentException() {
        Empleado empleado = new Empleado("Juan Pérez", Cargo.DESARROLLADOR, Constantes.SALARIO_MINIMO_CONVENIO);
        assertThrows(IllegalArgumentException.class, () -> empleado.setCargo(null));
    }

    @Test
    void setSalarioPorDebajoConvenio_lanzaIllegalArgumentException() {
        Empleado empleado = new Empleado("Juan Pérez", Cargo.DESARROLLADOR, Constantes.SALARIO_MINIMO_CONVENIO);
        double salarioInferior = Constantes.SALARIO_MINIMO_CONVENIO - 1;
        assertThrows(IllegalArgumentException.class, () -> empleado.setSalario(salarioInferior));
    }
}
