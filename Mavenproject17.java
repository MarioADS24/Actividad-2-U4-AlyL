/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject17;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject17 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


System.out.print("Ingresa un número entero positivo: "); int numero = scanner.nextInt();

if (numero > 0) {
 
int i = 1;


System.out.println("Cuadrados de los números desde 1 hasta " + numero + ":"); do {
int cuadrado = i * i;
System.out.println("El cuadrado de " + i + " es: " + cuadrado); i++;
} while (i <= numero);
} else {
System.out.println("Por favor, ingresa un número entero positivo.");
}
}
}

    }
}
