# Parcial2 - Sistema de Gestión de Empleados

## 📌 Descripción general
Este repositorio contiene una pequeña aplicación en Java para gestionar empleados. El código incluye:

- Las clases del dominio (`Empleado`, `Cargo`, `Empleados`).
- Validaciones para nombre, cargo y salario.
- Un ejemplo de uso en `SistemaGestionEmpleados` que muestra cómo crear empleados y aplicar aumentos.
- Pruebas unitarias en JUnit 5 para validar comportamiento y restricciones.

## 🧩 Estructura del proyecto
- `Cargo.java` → Enum con los cargos disponibles.
- `Empleado.java` → Clase que modela a un empleado y valida los datos de entrada.
- `Empleados.java` → Colección simple de empleados con operaciones básicas.
- `SistemaGestionEmpleados.java` → Programa principal con interacción por consola.
- `EmpleadoTest.java` → Conjunto de pruebas unitarias (JUnit 5).
- `TESTING.md` → Análisis de caja negra y casos de prueba.

## 🧪 Cómo ejecutar los tests
Este proyecto incluye dependencias de JUnit localmente en `lib/`, por lo que no requiere Gradle/Maven instalados:

```bash
java -jar lib/junit-platform-console-standalone-1.10.0.jar --class-path . --scan-class-path
```

## 🧑‍💻 Autoría y versión
- **Autor:** Ismael Liza
- **Versión:** 1.0.0
- **Fecha:** 2026-03-16

> Nota: Cambia la sección de autoría si deseas incluir tu nombre real o datos adicionales.
