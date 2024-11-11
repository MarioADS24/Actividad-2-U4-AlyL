/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject10;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject10 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


System.out.print("¿Cuántos números deseas ingresar? "); int cantidad = scanner.nextInt();
 

int mayoresQueCero = 0; int menoresQueCero = 0; int igualesACero = 0;

for (int i = 1; i <= cantidad; i++) { System.out.print("Ingresa el número #" + i + ": "); int numero = scanner.nextInt();

if (numero > 0) { mayoresQueCero++;
} else if (numero < 0) { menoresQueCero++;
} else {
igualesACero++;
}
}


System.out.println("Cantidad de números mayores que 0: " + mayoresQueCero); System.out.println("Cantidad de números menores que 0: " + menoresQueCero); System.out.println("Cantidad de números iguales a 0: " + igualesACero);
}
}
    
    }
}
