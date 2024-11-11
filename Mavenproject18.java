/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject18;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject18 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


System.out.print("Ingresa el primer número de la secuencia: "); int primerNumero = scanner.nextInt();

System.out.print("Ingresa la diferencia entre los números: "); int diferencia = scanner.nextInt();

System.out.print("Ingresa el número máximo de la secuencia: "); int numeroMaximo = scanner.nextInt();

if (numeroMaximo >= primerNumero) {
 
int numeroActual = primerNumero;


System.out.println("Secuencia Aritmética:"); do {
System.out.println(numeroActual); numeroActual += diferencia;
} while (numeroActual <= numeroMaximo);
} else {
System.out.println("El número máximo debe ser mayor o igual al primer número.");
}
}
}

    }
}
