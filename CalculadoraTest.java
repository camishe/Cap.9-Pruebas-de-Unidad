
package com.mycompany.cap9pruebasunitariasytdd;

/**
 *
 * @author mishe
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    void sumaDosNumeros() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(3, 4);
        assertEquals(7, resultado);
    }

    @Test
    void restaDosNumeros() {
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(10, 4);
        assertEquals(6, resultado);
    }
}
