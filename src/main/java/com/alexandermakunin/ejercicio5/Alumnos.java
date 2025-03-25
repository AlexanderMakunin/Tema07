package com.alexandermakunin.ejercicio5;

import java.util.Objects;

public class Alumnos {
    private final String nombre;
    private final int edad;
    private final double altura;

    public Alumnos(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return edad == alumnos.edad && altura == alumnos.altura && Objects.equals(nombre, alumnos.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, altura);
    }

    @Override
    public String toString() {
        return "alumnos{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
