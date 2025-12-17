/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author USER_ASUS
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nombres = new String[5];
        double[][] produccion = new double[5][12];
        double[] totalProduccion = new double[5];

        for (int fila = 0; fila < nombres.length; fila++) {
            System.out.printf("Ingrese el nombre del encargado de la estación %d: ", fila + 1);
            nombres[fila] = entrada.nextLine();
        }

        for (int fila = 0; fila < produccion.length; fila++) {
            System.out.printf("Producción mensual para %s:\n", nombres[fila]);
            

            for (int j = 0; j < produccion[fila].length; j++) {
                System.out.printf("Mes %d: $", j + 1);
                produccion[fila][j] = entrada.nextDouble();
            }
        }

       
    }
}
