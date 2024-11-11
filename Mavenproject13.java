/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject13;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject13 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); Random random = new Random();
int numeroSecreto = random.nextInt(100) + 1; int intento = 0;
int intentos = 0;


System.out.println("¡Bienvenido al juego de adivinar el número!"); System.out.println("He generado un número aleatorio entre 1 y 100."); System.out.println("Tu tarea es adivinarlo.");

while (intento != numeroSecreto) { System.out.print("Ingresa tu suposición: "); intento = scanner.nextInt();
intentos++;
 

if (intento < numeroSecreto) {
System.out.println("Demasiado bajo. Intenta nuevamente.");
} else if (intento > numeroSecreto) { System.out.println("Demasiado alto. Intenta nuevamente.");
} else {
System.out.println("¡Correcto! El número era " + numeroSecreto); System.out.println("Te ha llevado " + intentos + " intentos adivinar el número.");
}
}
}
}

    }
}
