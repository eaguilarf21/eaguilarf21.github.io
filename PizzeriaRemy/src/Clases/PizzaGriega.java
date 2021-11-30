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
public class PizzaGriega {
//promocion
//bebida
//panAlAjo
//pedir DNI para TC al inicio    

    //atributos
    private double precio;
    private String ingredientes;
    private String size;
    private int cantidad;

    //metodos (funciones, procedimiento)
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTamaño() {
        return size;
    }

    public void setTamaño(String tamaño) {
        this.size = tamaño;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularTotalAPagar(float impuestos) {
        return getCantidad() * precio * impuestos
                + cantidad * precio;
    }
}
