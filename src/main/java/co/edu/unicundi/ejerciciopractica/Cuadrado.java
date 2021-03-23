/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.ejerciciopractica;

import java.util.Scanner;

/**
 * Clase que calcula el area y perimetro de un cuadrado
 * @author Sebastian Naranjo
 * @author Ana Sofia Lopera
 * @since 1.0
 * @version 1.0
 */
public class Cuadrado extends Figura{
    /**
    * Variables declaradas
    */
    static Scanner ladoT = new Scanner(System.in); 
    private double areaCuadrado;
    private double perimetroCuadrado;
    private float l;
    /**
    * Metodo que se encarga de recibir los datos
    */
    public void tomaDatos(){
         System.out.println("Ingrese el lado del cuadrado: ");
         l= ladoT.nextFloat();
         this.l = l;
    }
    /**
    * Metodos get y set
    */
    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }
    
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }  
    /**
    * Metodos que se encargan de calcular y mostrar las operaciones
    */
    @Override
    public void area() {
        
        this.areaCuadrado = l*l;
        System.out.println("El area es: " + this.areaCuadrado);
    }
    
    @Override
    public void perimetro() {
        this.perimetroCuadrado =l*4;
         System.out.println("El perimetro: " + this.perimetroCuadrado);
    }
       public double getPerimetroCuadrado() 
    {
        return perimetroCuadrado;
    }  
      
}
