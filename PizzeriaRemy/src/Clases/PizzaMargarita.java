/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Kike
 */
public class PizzaMargarita {

    //atributos
    private double precio;
    private String size;
    private int cantidad;
    private boolean pinia;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isPinia() {
        return pinia;
    }

    public void setPinia(boolean pinia) {
        this.pinia = pinia;
    }

    public double calcularTotalAPagar(float impuestos) {
        return getCantidad() * precio * impuestos
                + cantidad * precio;
    }
}
