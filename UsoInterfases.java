/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usointerfases;

import java.util.Scanner;
/**
 *
 * @author lestu
 */
public class UsoInterfases {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
       CalcularAreaCuadrado areaCuadrado = new CalcularAreaCuadrado ();
       CalcularAreaTriangulo areaTriangulo = new CalcularAreaTriangulo ();
       
       
        System.out.println("ingrese la base del cuadrado");
        int altura = sp.nextInt();
        System.out.println("ingrese la altura del cuadrado");
        int base = sp.nextInt();
        System.out.println( areaCuadrado.calcularArea(base, altura));
        System.out.println("*************************************************************************");
        System.out.println("ingrese la base del triangulo ");
        base = sp.nextInt();
        System.out.println("ingrese la altura del triangulo");
        altura = sp.nextInt();
        System.out.println(areaTriangulo.calcularArea(base, altura));
       
    }
}
