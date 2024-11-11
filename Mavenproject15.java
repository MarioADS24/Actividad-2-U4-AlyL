/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject15;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject15 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


double suma = 0; int cantidad = 0; double numero;

System.out.println("Ingresa números positivos uno por uno."); System.out.println("El programa terminará cuando ingreses un número negativo.");

while (true) {
System.out.print("Ingresa un número positivo: ");
 
numero = scanner.nextDouble();


if (numero < 0) { break;
}
suma += numero; cantidad++;
}


if (cantidad > 0) {
double media = suma / cantidad;
System.out.println("La media de los números positivos ingresados es: " + media);
} else {
System.out.println("No se ingresaron números positivos.");
}
}
}

    }
}
