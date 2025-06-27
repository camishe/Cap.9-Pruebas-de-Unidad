
package com.mycompany.cap9pruebasunitariasytdd;

/**
 *
 * @author mishe
 */
public class Cap9pruebasUnitariasyTDD {

    public static void main(String[] args) {
           Calculadora calc = new Calculadora();

        int suma = calc.sumar(5, 3);
        int resta = calc.restar(10, 4);

        System.out.println("Resultado de la suma: " + suma);
        System.out.println("Resultado de la resta: " + resta);
    }
}
