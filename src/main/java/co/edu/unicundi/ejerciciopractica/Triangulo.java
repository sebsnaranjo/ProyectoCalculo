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
public class Triangulo extends Figura {

    static Scanner ladoT = new Scanner(System.in); 
    private double areaTriangulo;
    private double perimetroTriangulo;
    private double semiperimetro;
    private float ladoUno;
    private float ladoDos;
    private float ladoTres;
    
    public void tomaDatos(){
         System.out.println("Ingrese el primer lado del triangulo: ");
         ladoUno = ladoT.nextFloat();
         System.out.println("Ingrese el segundo lado del triangulo: ");
         ladoDos = ladoT.nextFloat();
         System.out.println("Ingrese el tercero lado del triangulo: ");
         ladoTres = ladoT.nextFloat();
         this.ladoUno = ladoUno;
         this.ladoDos = ladoDos;
         this.ladoTres = ladoTres;
    }
  
    public float getLadoUno() {
        return ladoUno;
    }
    
    public float getLadoDos() {
        return ladoDos;
    }
    
    public float getLadoTres() {
        return ladoTres;
    }

    public void setLados(float ladoUno, float ladoDos, float ladoTres) {
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
        this.ladoTres = ladoTres;
    }

    @Override
    public void perimetro() {
        this.perimetroTriangulo=ladoUno+ladoDos+ladoTres;
        System.out.println("El perimetro del triangulo es: " + this.perimetroTriangulo);
    }
    
    @Override
    public void area() {
        this.semiperimetro= (ladoUno+ladoDos+ladoTres)/2;
        double calculoRaiz = Math.sqrt((semiperimetro*(semiperimetro-ladoUno))*(semiperimetro-ladoDos)*(semiperimetro-ladoTres));
        this.areaTriangulo = calculoRaiz;
        System.out.println("El area del triangulo es: " + this.areaTriangulo);
    }


    
}
