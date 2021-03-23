/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.ejerciciopractica;

import java.util.Scanner;

/**
 * Clase que calcula el area y perimetro de un circulo
 * @author Sebastian Naranjo
 * @author Ana Sofia Lopera
 * @since 1.0
 * @version 1.0
 */
public class Circulo extends Figura{
    /**
    * Variables declaradas
    */
    static Scanner radio = new Scanner(System.in);
    private float r;
    private double perimetroCirculo;
    private double areaCirculo;
    static final double pi = 3.1415;
    /**
    * Metodo que se encarga de recibir los datos
    */
    public void tomaDatos(){
        System.out.println("Ingrese el radio de el circulo: ");
        r = radio.nextFloat();
        this.r = r;
    }
    /**
    * Metodos get y set
    */
    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    /**
    * Metodos que se encargan de calcular y mostrar las operaciones
    */
    @Override
    public void area() {
        this.areaCirculo = pi*r*r;
         System.out.println("El area del circulo es: " + this.areaCirculo);
    }
    
    @Override
    public void perimetro() {
        this.perimetroCirculo = 2*pi*r;
        System.out.println("El perimetro del circulo es: " + this.perimetroCirculo);
    }
      
  }
 

    

