/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.*;
import java.util.Scanner;

/**
 *
 * @author Kike
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //variables
        int opcPizza;
        int cant;
        String opcDeNuevo = "s";
        PizzaGriega griega;
        PizzaMargarita margarita;
        float igv = 0.18f;
        double total;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola mundo");

        System.out.println("BIENVENIDO A LA PIZZERIA REMY");

        griega = new PizzaGriega();
        griega.setCantidad(0);
        griega.setPrecio(20);
        margarita = new PizzaMargarita();
        margarita.setCantidad(0);
        margarita.setPrecio(22);

        do {
            System.out.println("Ingrese las pizzas a comprar (digitando el número de la pizza)");
            do {
                System.out.println("1. Pizza Griega - S/ " + griega.getPrecio());
                System.out.println("2. Pizza Margarita - S/ " + margarita.getPrecio());
                opcPizza = teclado.nextInt();
            } while (!((opcPizza == 1) || (opcPizza == 2)));

            System.out.println("Ingrese la cantidad deseada");
            cant = teclado.nextInt();

            if (opcPizza == 1) {
                griega.setCantidad(griega.getCantidad() + cant);
            }
            if (opcPizza == 2) {
                margarita.setCantidad(margarita.getCantidad() + cant);
            }
            System.out.println("Desea hacer otro pedido (s/n)");
            opcDeNuevo = teclado.next();

        } while (opcDeNuevo.equals("s"));
        total = Math.round(margarita.calcularTotalAPagar(igv)
                + griega.calcularTotalAPagar(igv));
        System.out.println("El total a pagar por su pedido es: "
                + total);
        System.out.println("Gracias por su compra.\nVuelva pronto.");
    }

}
