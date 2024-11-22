package com.simulandotestes;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não pode dividir por zero");
        }
        return a / b;
    }
}
