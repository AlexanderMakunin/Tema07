package com.alexandermakunin.ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        Alumnos[] alumnos = new Alumnos[2];
        int cantAlumnos = 2;
        int num;
        String nombre;
        int edad;
        double altura;
        int maxEdad = -1;
        for (int i = 0; i < cantAlumnos; i++) {
            edad = -1;
            altura = -1;
            System.out.println("Indique el nombre");
            nombre = leer.nextLine();
            System.out.println("Indique la edad");
            do {
                try {
                    edad = Integer.parseInt(leer.nextLine());
                } catch (NumberFormatException nfe) {
                    System.err.println("Indique numeros");
                }
            } while (edad < 0);
            System.out.println("Indique la altura");
            do {
                try {
                    altura = Double.parseDouble(leer.nextLine());
                } catch (NumberFormatException nfe) {
                    System.err.println("Indique numeros");
                }
            } while (altura < 0);
            alumnos[i] = new Alumnos(nombre,edad,altura);
            if (maxEdad < edad) {
                maxEdad = edad;
            }
        }
        System.out.println(Arrays.toString(alumnos));
        for (int i = 0; i < alumnos.length; i++) {
            if (maxEdad == alumnos[i].getEdad()) {
                System.out.println("El alumno mas mayor es: " + alumnos[i]);
                break;
            }
        }
    }
}
