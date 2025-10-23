/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria.uno;

//import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Libros {
    
    public String titulo;
    public String autor;
    public String genero;
    public int precio;

    public Libros(String titulo, String autor, String genero, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Autores{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", precio=" + precio + '}';
    }
    
    /*ArrayList<Libros> p = new ArrayList<>();
    
    carrito.add(producto1); //0
    carrito.add(producto2); //1
    carrito.add(producto3); //2*/
}
