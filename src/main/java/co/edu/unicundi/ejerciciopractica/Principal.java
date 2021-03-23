/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.ejerciciopractica;
/**
 * Clase que se encarga de ejecutar los metodos e implementa polimorfismo
 * @author Sebastian Naranjo
 * @author Ana Sofia Lopera
 * @since 1.0
 * @version 1.0
 */
public class Principal {
    public static void main(String[] args) {
        /**
        * Llamamos los metodos para luego mostrar cada uno de sus operaciones
        */
        IObtenerDatos circulo = new Circulo();
        IObtenerDatos cuadrado = new Cuadrado();
        IObtenerDatos triangulo= new Triangulo();
        
        IObtenerDatos[] vectorFigura = new IObtenerDatos[3];     
        vectorFigura[0] = circulo;
        vectorFigura[1] = cuadrado;
        vectorFigura[2] = triangulo;
       
         for (IObtenerDatos fig : vectorFigura) {     
            Figura fff;
            fff = ((Figura) fig);
            if(fig instanceof Cuadrado) {
                ((Cuadrado) fig).tomaDatos(); 
            }else if (fig instanceof Triangulo) {
                ((Triangulo) fig).tomaDatos();
            }else if (fig instanceof Circulo) {
                ((Circulo) fig).tomaDatos();
            }
            fig.area();
            fig.perimetro();
        }
    } 
}
