class Empleado {
    private String nombre;
    private Cargo cargo;
    private double salario;

    public Empleado(String nombre, Cargo cargo, double salario) {
        validarNombre(nombre);
        validarCargo(cargo);
        validarSalario(salario);

        this.nombre = nombre.trim();
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre.trim();
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        validarCargo(cargo);
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        validarSalario(salario);
        this.salario = salario;
    }

    private static void validarNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo.");
        }
        String trimmed = nombre.trim();
        if (trimmed.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        String[] palabras = trimmed.split("\\s+");
        if (palabras.length < 2) {
            throw new IllegalArgumentException("El nombre debe contener al menos dos palabras.");
        }
    }

    private static void validarCargo(Cargo cargo) {
        if (cargo == null) {
            throw new IllegalArgumentException("El cargo no puede ser nulo.");
        }
    }

    private static void validarSalario(double salario) {
        if (Double.isNaN(salario) || Double.isInfinite(salario)) {
            throw new IllegalArgumentException("El salario debe ser un número válido.");
        }
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        if (salario < Constantes.SALARIO_MINIMO_CONVENIO) {
            throw new IllegalArgumentException("El salario no puede ser inferior al convenio salarial.");
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
