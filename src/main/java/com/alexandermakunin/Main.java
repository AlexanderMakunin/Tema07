package com.alexandermakunin;

import com.alexandermakunin.exceptions.*;
import static com.alexandermakunin.MainExcepciones.*;

public class Main {
    public static void main(String[] args) {
        try {
            errorMatricula(leerString("Indique la matricula",6,8));
        } catch (MatriculaInvalidaException | InvalidPlateLengthException | InvalidPlateLettersException |
                 InvalidPlateNumberException e) {
            throw new RuntimeException(e);
        }
    }
}