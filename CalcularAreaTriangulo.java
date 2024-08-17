/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usointerfases;

/**
 *
 * @author lestu
 */
public class CalcularAreaTriangulo implements Figura {

    @Override
    public String calcularArea(Integer base, Integer altura) {
        double resultado = (base*altura)/2;
        return "el area del triangulo es: "+ resultado;
            }

    public CalcularAreaTriangulo() {
    }
    
        private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
