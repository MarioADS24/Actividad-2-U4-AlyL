/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject12;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject12 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


System.out.print("Ingresa un número entero: "); int numero = scanner.nextInt();

numero = Math.abs(numero);


int contador = 0; if (numero == 0) {
 
contador = 1;
} else {
while (numero > 0) { numero /= 10; contador++;
}
}


System.out.println("El número tiene " + contador + " dígitos.");
}
}

    }
}
