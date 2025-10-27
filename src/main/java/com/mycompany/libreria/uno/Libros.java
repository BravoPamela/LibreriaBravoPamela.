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
    
    private String titulo;
    private Autores autor;
    private String genero;
    private int precio;

    public Libros(String titulo, Autores autor, String genero, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autores getAutor() {
        return autor;
    }

    public void setAutor(Autores autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    

    @Override
    public String toString() {
        return "|" + "titulo=" + titulo +"| "+ autor + "| genero=" + genero + "| precio=" + precio + '|';
    }
    
}
