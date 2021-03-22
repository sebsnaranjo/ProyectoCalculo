/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.ejerciciopractica;

/**
 *
 * @author ASUS
 */
public class Principal {
    public static void main(String[] args) {
        
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
               
                
            }
            fig.area();
            fig.perimetro();
        }
        
    }
    
}
