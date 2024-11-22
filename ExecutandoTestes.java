package com.simulandotestes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExecutandoTestes {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        // Inicializa recursos antes de cada teste
        calculadora = new Calculadora();
        System.out.println("Inicializando a calculadora para o teste.");
    }

    @AfterEach
    void tearDown() {
        // Finaliza ou limpa recursos após cada teste
        System.out.println("Teste concluído, liberando recursos.\n");
    }

    @Test
    void testSomar() {
        System.out.println("Executando teste de soma.");
        int resultado = calculadora.somar(10, 5);
        assertEquals(15, resultado, "A soma deve ser 15");
    }

    @Test
    void testSubtrair() {
        System.out.println("Executando teste de subtração.");
        int resultado = calculadora.subtrair(10, 5);
        assertEquals(5, resultado, "A subtração deve ser 5");
    }

    @Test
    void testDividir() {
        System.out.println("Executando teste de divisão.");
        int resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado, "A divisão deve ser 5");
    }

    @Test
    void testDividirPorZero() {
        System.out.println("Executando teste de divisão por zero.");
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0), "Deveria lançar exceção ao dividir por zero");
    }
}
