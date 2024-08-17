/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usointerfases;

/**
 *
 * @author lestu
 */
public class CalcularAreaCuadrado implements Figura {

    @Override
    public String calcularArea(Integer base, Integer altura) {
        double resultado = base * altura;
      return "el area del cuadrado es: "+ resultado;
    }

    public CalcularAreaCuadrado() {
    }
  
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
  
}
