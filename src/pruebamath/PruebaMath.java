package pruebamath;

import Aritmetica.MathOperations;

public class PruebaMath {

    public static void main(String[] args) {
        double suma = MathOperations.sumar(5, 3);
        double resta = MathOperations.restar(10, 4);
        double multiplicacion = MathOperations.multiplicar(7, 2);
        double division = MathOperations.dividir(20, 5);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
    
}
