/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject14;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject14 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


char letra;


System.out.println("Ingresa letras y te diré si son vocales o consonantes."); System.out.println("El programa terminará cuando ingreses un espacio.");

while (true) {
System.out.print("Ingresa una letra: "); letra = scanner.next().charAt(0);

if (letra == ' ' || letra == '\u0000') { System.out.println("¡Programa terminado!");
 
break;
}


letra = Character.toLowerCase(letra);


if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') { System.out.println("La letra '" + letra + "' es una vocal.");
} else {
System.out.println("La letra '" + letra + "' es una consonante.");
}
}
scanner.close();
}
}

    }
}
