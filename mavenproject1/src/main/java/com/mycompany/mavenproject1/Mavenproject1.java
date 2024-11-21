/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @Oscar
 */
import java.util.Scanner;
public class Mavenproject1 {
    public static void main(String[] args) {
        // Objetos
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        // Metodo Scanner para leer datos
        Scanner lector;
        lector = new Scanner(System.in);

        // Inputs de producto1
        System.out.print("Ingrese el nombre del producto 1: ");
        producto1.setNombre(lector.nextLine());

        System.out.print("Ingrese el precio del producto 1: ");
        producto1.setPrecio(lector.nextFloat());

        System.out.print("Ingrese la cantidad del producto 1: ");
        producto1.setCantidad(lector.nextInt());
       
        lector.nextLine();
        
        // Inputs de producto2
        System.out.print("Ingrese el nombre del producto 2: ");
        producto2.setNombre(lector.nextLine());

        System.out.print("Ingrese el precio del producto 2: ");
        producto2.setPrecio(lector.nextFloat());

        System.out.print("Ingrese la cantidad del producto 2: ");
        producto2.setCantidad(lector.nextInt());

        // MontoPagar para cada producto
        producto1.calcularMontoPagar();
        producto2.calcularMontoPagar();

        // print resultados
        System.out.println("Producto: " + producto1.getNombre());
        System.out.println("Monto a pagar: $" + producto1.getMontoPagar());

        System.out.println("Producto: " + producto2.getNombre());
        System.out.println("Monto a pagar: $" + producto2.getMontoPagar());

        lector.close();
    }
}