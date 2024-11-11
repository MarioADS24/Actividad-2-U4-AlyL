/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject16;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Mavenproject16 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


int opcion;
double num1, num2, resultado;


do {
System.out.println("----- Menú de Calculadora Básica	");
System.out.println("1. Sumar");
 
System.out.println("2. Restar"); System.out.println("3. Multiplicar"); System.out.println("4. Dividir"); System.out.println("5. Salir"); System.out.print("Selecciona una opción (1-5): "); opcion = scanner.nextInt();

if (opcion >= 1 && opcion <= 4) { System.out.print("Ingresa el primer número: "); num1 = scanner.nextDouble(); System.out.print("Ingresa el segundo número: "); num2 = scanner.nextDouble();

switch (opcion) { case 1:
resultado = num1 + num2;
System.out.println("El resultado de la suma es: " + resultado); break;
case 2:
resultado = num1 - num2;
System.out.println("El resultado de la resta es: " + resultado); break;
case 3:
resultado = num1 * num2;
System.out.println("El resultado de la multiplicación es: " + resultado); break;
case 4:
if (num2 != 0) {
resultado = num1 / num2;
System.out.println("El resultado de la división es: " + resultado);
 
} else {
System.out.println("¡Error! No se puede dividir entre cero.");
}
break; default:
System.out.println("Opción no válida."); break;
}
 






