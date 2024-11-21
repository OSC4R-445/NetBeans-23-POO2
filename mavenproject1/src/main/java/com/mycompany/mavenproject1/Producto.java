/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @Oscar
 */
public class Producto {
    private String nombre;
    private float precio;
    private int cantidad;
    private float montoPagar;

    // Metoros getters
    public String getNombre() {
        return nombre;
    }
    
    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    // Metodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Metodo para calcular MontoPagar
 
    public float getMontoPagar() {
        return montoPagar;
    }

    public void calcularMontoPagar() {
        montoPagar = precio * cantidad;
    }
}