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
        double mayor = 0;
        int posMayor = 0;
        double[] total = new double[5];

        for (int fila = 0; fila < nombres.length; fila++) {
            System.out.printf("Ingrese el nombre del encargado de la estación %d: ", fila + 1);
            nombres[fila] = entrada.nextLine();

            total[fila] = 0;
        }

        for (int fila = 0; fila < produccion.length; fila++) {
            System.out.printf("Producción mensual para %s:\n", nombres[fila]);

            for (int col = 0; col < produccion[fila].length; col++) {
                System.out.printf("Mes %d: $", col + 1);
                produccion[fila][col] = entrada.nextDouble();

                total[fila] = total[fila] + produccion[fila][col];
            }

            entrada.nextLine();
        }
        for (int fila = 0; fila < produccion.length; fila++) {
            if (total[fila] > mayor) {

                mayor = total[fila];
                posMayor = fila;
            }

        }
        for (int fila = 0; fila < produccion.length; fila++) {
            System.out.println(nombres[fila] + " - Total Producción: $ " + total[fila]);
        }

        System.out.printf("\nEstación más productiva: %s"
                + "\nEncargado de la estación: %s"
                + "\nCantidad de la estación más productiva: $ %.2f ", nombres[posMayor],
                nombres[posMayor],
                mayor);

    }
}
