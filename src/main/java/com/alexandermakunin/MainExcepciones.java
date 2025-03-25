package com.alexandermakunin;

import com.alexandermakunin.exceptions.*;

import java.util.Scanner;

/**
 * IO
 * License: 🅮 Public Domain
 *
 * @author Germán Gascón <ggascon@gmail.com>
 * @version 0.1, 2025-03-24
 * @since 0.1, 2025-03-24
 **/

public class MainExcepciones {
    private static final Scanner scanner = new Scanner(System.in);

    public static String leerString(String mensaje, int minLength, int maxLength) throws InvalidPlateLengthException {
        boolean valido;
        String valor;
        do {
            System.out.println(mensaje);
            valor = scanner.nextLine();
            int length = valor.length();
            valido = length >= minLength && length <= maxLength;
            if (!valido) {
                throw new InvalidPlateLengthException("Longitud no valida");
            }
        } while (!valido);
        return valor;
    }

    public static boolean validarMatricula(String matricula) throws InvalidPlateLettersException, MatriculaInvalidaException, InvalidPlateNumberException {
        int i;
        if (matricula.length() != 8) {
            return false;
        }
        for (i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                throw new InvalidPlateNumberException("La matricula debe de contener " + 4 + " numeros");
            }
        }
        if (!Character.isWhitespace(matricula.charAt(i++))) {
            throw new MatriculaInvalidaException("La matricula debe contener un espacio");
        }
        for (int j = i; j < matricula.length(); j++) {
            if (!Character.isLetter(matricula.charAt(j))) {
                throw new InvalidPlateLettersException("La matricula debe de contener " + 3 + " letras");
            }
        }
        return true;
    }

    public static void errorMatricula(String matricula) throws MatriculaInvalidaException, InvalidPlateLettersException, InvalidPlateNumberException {
        if (!validarMatricula(matricula)) {
            throw new MatriculaInvalidaException("Matricula no valida");
        }
    }
}
