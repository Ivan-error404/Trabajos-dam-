package com.mycompany.maquina_expendedora;

import java.util.Scanner;

public class Maquina_expendedora {
    
public enum Producto {
    PatatasIvan(3.00, 5),
    Chocolate(4.00, 0),
    Refresco(5.20, 4),
    Agua(5.00, 6),
    Galletas(0.80, 10),
   Pan(0.50, 2);

    private double precio;
    private int unidades;

    Producto(double precio, int unidades) {
        this.precio = precio;
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void restarUnidad() {
        if (unidades > 0) {
            unidades--;
        }
    }
}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce dinero:");
    double dinero = sc.nextDouble();

   
    System.out.println("Elige un producto (0 - " + (Producto.values().length - 1) + "):");
    Producto[] productos = Producto.values();

    for (int i = 0; i < productos.length; i++) {
        Producto p = productos[i];
        System.out.println(i + " - " + p.name() + " | Precio: " + p.getPrecio() + " euros | Unidades: " + p.getUnidades());
    }

    int indice = sc.nextInt();

   
    if (indice < 0 || indice >= productos.length) {
        System.out.println("Número no válido. Dinero devuelto: " + dinero + " euros");
        return;
    }

    Producto productoSeleccionado = productos[indice];

 
    if (productoSeleccionado.getUnidades() == 0) {
        System.out.println("Producto agotado. Dinero devuelto: " + dinero + " euros");
        return;
    }

 
    if (dinero < productoSeleccionado.getPrecio()) {
        System.out.println("Dinero insuficiente. Dinero devuelto: " + dinero + " euros");
        return;
    }

  
    productoSeleccionado.restarUnidad();
    double cambio = dinero - productoSeleccionado.getPrecio();

    System.out.println("Has comprado: " + productoSeleccionado.name());
    System.out.println("Unidades restantes: " + productoSeleccionado.getUnidades());
    System.out.println("Cambio devuelto: " + cambio + " euros");
}
    
}
//Fin