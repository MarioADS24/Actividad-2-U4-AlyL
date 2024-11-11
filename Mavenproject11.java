/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject11 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


System.out.print("Ingresa una palabra: ");
 
String palabra = scanner.nextLine();


palabra = palabra.toLowerCase();


int contador = 0;


for (int i = 0; i < palabra.length(); i++) { if (palabra.charAt(i) == 'a') {
contador++;
}
}


System.out.println("La letra 'a' aparece: " + contador);
}
}

    }
}
