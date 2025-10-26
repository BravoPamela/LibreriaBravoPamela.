/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria.uno;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Biblioteca {

    private ArrayList<Libros> libros;
    private static Autores[] autores;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.autores = new Autores[5];

        /*Autores autor1 = new Autores("Pedro", "Quito");
        Autores autor2 = new Autores("Ana", "Guayaquil");
        Autores autor3 = new Autores("Xavier", "Cuenca");
        Autores autor4 = new Autores("Alexander", "Sucumbios");
        Autores autor5 = new Autores("Pamela", "Orellana");*/
        autores[0] = new Autores("Pame", "Ecuatoriana");
        autores[1] = new Autores("Xavi", "Ecuatoriana");
        autores[2] = new Autores("Alexander", "Ecuatoriana");
        autores[3] = new Autores("Pedro", "Ecuatoriana");
        autores[4] = new Autores("Pablo", "Ecuatoriana");

    }

    public void agregarLibros(Libros libro) {

        libros.add(libro);

    }

    public void actualizarLibros(int index, Libros libro) {

        libros.set(index, libro);
    }

    public void mostrarLibros() {

        if (libros.isEmpty()) {
            System.out.println("No hay libros disponibles");
        } else {
            for (Libros a : libros) {
                System.out.println("Muestra de libros:" + a);
            }
        }
    }

    public static Autores getAutor(int index) {

        if (index >= 0 && index < autores.length) {

            return autores[index];
        }

        return null;
    }

}
