package com.alexandermakunin;

public class Ejercicio9 {
    private static class arimetica extends ArithmeticException {
        private arimetica(String msg) {
            super(msg);
        }
    }
    private static class fueraDeLugar extends ArithmeticException {
        private fueraDeLugar(String msg) {
            super(msg);
        }
    }
    private static class punteroVacio extends ArithmeticException {
        private punteroVacio(String msg) {
            super(msg);
        }
    }
    public static void main(String[] args) {
        int[] arrNum = new int[5];
        int[] arrNull = null;
        arrNum[0] = 1;
        arrNum[1] = 0;
        int num = 2;
        int value;
        int count = 0;
        boolean check = false;
        while (!check) {
            try {
                value = num / arrNum[count++];
                System.out.println(num + " / " + arrNum[count] + "=" + (num / value));
            } catch (ArithmeticException ae) {
                throw new arimetica("Error de division");
            } catch (IndexOutOfBoundsException e) {
                throw new fueraDeLugar("array salido");
            }
        }
        try {
            arrNull.equals(arrNum);
            System.out.println("son iguales");
        } catch (NullPointerException e) {
            throw new punteroVacio("no son iguales");
        }
    }
}
