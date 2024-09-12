package com.vincle.ejercicio1;

/**
 *
 * Escribe, en el lenguaje de programación que desees, un programa que muestre
 * en pantalla los números del 1 al 100, sustituyendo los múltiplos de 3 por el
 * palabro “VIN” y, a su vez, los múltiplos de 5 por “CLE”. Para los casos que,
 * al tiempo, son múltiplos de 3 y 5, utiliza el combinado “VINCLE”.
 *
 * @author Vicente Cuadrado
 */
public class Ejercicio1 {

    /**
     *
     * Inicio de la aplicación.
     *
     * @param args Parámentros desde la líne de comandos.
     */
    public static void main(String[] args) {
        // Tramo de 1 hasta 100
        for (int idx = 1; idx <= 100; idx++) {
            // Caso si es múltiplo de 3 y de 5 se muestra VINCLE.
            if (idx % 3 == 0 && idx % 5 == 0) {
                System.out.println("VINCLE");
                
            // Caso si es múltiplo de 5 se muestra CLE.
            } else if (idx % 5 == 0) {
                System.out.println("CLE");
                
            // Caso si es múltiplo de 3 se muestra VIN.    
            } else if (idx % 3 == 0) {
                System.out.println("VIN");
                
            // Cualquier otro caso se muestra el contador.     
            } else {
                System.out.println(idx);
            }
        }
    }
}
