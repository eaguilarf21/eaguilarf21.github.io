/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kike
 */
public class PizzaGriegaTest {
    
    public PizzaGriegaTest() {
    }

    /**
     * Test of getPrecio method, of class PizzaGriega.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        PizzaGriega instance = new PizzaGriega();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class PizzaGriega.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        PizzaGriega instance = new PizzaGriega();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIngredientes method, of class PizzaGriega.
     */
    @Test
    public void testGetIngredientes() {
        System.out.println("getIngredientes");
        PizzaGriega instance = new PizzaGriega();
        String expResult = "";
        String result = instance.getIngredientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIngredientes method, of class PizzaGriega.
     */
    @Test
    public void testSetIngredientes() {
        System.out.println("setIngredientes");
        String ingredientes = "";
        PizzaGriega instance = new PizzaGriega();
        instance.setIngredientes(ingredientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTamaño method, of class PizzaGriega.
     */
    @Test
    public void testGetTamaño() {
        System.out.println("getTama\u00f1o");
        PizzaGriega instance = new PizzaGriega();
        String expResult = "";
        String result = instance.getTamaño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTamaño method, of class PizzaGriega.
     */
    @Test
    public void testSetTamaño() {
        System.out.println("setTama\u00f1o");
        String tamaño = "";
        PizzaGriega instance = new PizzaGriega();
        instance.setTamaño(tamaño);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class PizzaGriega.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        PizzaGriega instance = new PizzaGriega();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class PizzaGriega.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        PizzaGriega instance = new PizzaGriega();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotalAPagar method, of class PizzaGriega.
     */
    @Test
    public void testCalcularTotalAPagar() {
        System.out.println("calcularTotalAPagar");
        float impuestos = 0.0F;
        PizzaGriega instance = new PizzaGriega();
        double expResult = 0.0;
        double result = instance.calcularTotalAPagar(impuestos);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
