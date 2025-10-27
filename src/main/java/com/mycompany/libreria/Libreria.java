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
        Libros libro1 =new Libros("Harry P", (biblioteca.getAutor(0)) , "Misterio", 50);
        Libros libro2 =new Libros("Orgullo y Prejuicio", (biblioteca.getAutor(1)), "Romantica", 40);
        Libros libro3 =new Libros("Cien años de S", (biblioteca.getAutor(2)), "Realismo", 150);
        Libros libro4 =new Libros("1984", (biblioteca.getAutor(3)), "Ciencia Ficcion", 200);
        Libros libro5 =new Libros("El codigo Da vinci", (biblioteca.getAutor(4)), "Misterio", 99);
         
        /////////////////////////////////////////////
        biblioteca.agregarLibros(libro1);
        biblioteca.agregarLibros(libro2);
        biblioteca.agregarLibros(libro3);
        biblioteca.agregarLibros(libro4);
        biblioteca.agregarLibros(libro5);
        
        ////////////////////////////////////////////
        biblioteca.mostrarLibros();
        System.out.println("Actualizacion");
       
        /////////////////////////
        biblioteca.actualizarLibros(0, libro1);
        biblioteca.mostrarLibros();
        

    }
}
