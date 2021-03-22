/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.ejerciciopractica;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Cuadrado extends Figura{

    Scanner ladoT = new Scanner(System.in); 
    private double areaCuadrado;
    public float l;
   
    public Cuadrado(double lado) 
    {
        System.out.println("Ingrese el lado del cuadrado: ");
        l= ladoT.nextFloat();
        this.l= l;
    }

    Cuadrado() {
       
    }
    
    @Override
    public double area() {
        return l* l;
    }

    @Override
    public double perimetro() {
        
        return l+l+l+l;
        
    }
    
    
}
