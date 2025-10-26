/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreria;

import com.mycompany.libreria.uno.Libros;
import com.mycompany.libreria.uno.Autores;
import com.mycompany.libreria.uno.Biblioteca;

/**
 *
 * @author User
 */
public class Libreria {

    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        Libros libro1 =new Libros("Harry P", new Autores("Xavier", "Ecuatoriano"), "Misterio", 50);
        Libros libro2 =new Libros("Orgullo y Prejuicio", new Autores("Alexander", "Ecuatoriano"), "Romantica", 40);
        Libros libro3 =new Libros("Cien años de S", new Autores("Pamela", "Ecuatoriano"), "Realismo", 150);
        Libros libro4 =new Libros("1984", new Autores("Liset", "Ecuatoriano"), "Ciencia Ficcion", 200);
        Libros libro5 =new Libros("El codigo Da vinci", new Autores("Xael", "Ecuatoriano"), "Misterio", 99);
        
        /////////////////////////////////////////////
        biblioteca.agregarLibros(libro1);
        biblioteca.agregarLibros(libro2);
        biblioteca.agregarLibros(libro3);
        biblioteca.agregarLibros(libro4);
        biblioteca.agregarLibros(libro5);
        
        ////////////////////////////////////////////
        biblioteca.mostrarLibros();
        

    }
}
