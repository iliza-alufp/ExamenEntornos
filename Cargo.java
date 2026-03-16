public enum Cargo {
    DESARROLLADOR("Desarrollador"),
    DISEÑADOR("Diseñadora"),
    GERENTE("Gerente");

    private final String nombre;

    Cargo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public static Cargo fromString(String valor) {
        if (valor == null) {
            throw new IllegalArgumentException("Cargo no puede ser null");
        }
        for (Cargo cargo : values()) {
            if (cargo.nombre.equalsIgnoreCase(valor.trim())) {
                return cargo;
            }
        }
        throw new IllegalArgumentException("Cargo desconocido: " + valor);
    }
}
