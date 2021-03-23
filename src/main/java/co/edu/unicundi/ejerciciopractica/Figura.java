/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.ejerciciopractica;

/**
 * Clase padre con metodo abstracto
 * @author Sebastian Naranjo
 * @author Ana Sofia Lopera
 * @since 1.0
 * @version 1.0
 */
public abstract class Figura implements IObtenerDatos{
        private double area;
        private double perimetro;
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
