/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreria;

import com.mycompany.libreria.uno.Autores;
import com.mycompany.libreria.uno.Libros;
import java.util.ArrayList;
import com.mycompany.libreria.uno.Autores;

/**
 *
 * @author User
 */
public class Libreria {

    public static void main(String[] args) {
        Autores [] p = new Autores[5];
        
        Autores autor1 = new Autores("Pedro", "Quito");
        Autores autor2 = new Autores("Ana", "Guayaquil");
        Autores autor3 = new Autores("Xavier", "Cuenca");
        Autores autor4 = new Autores("Alexander", "Sucumbios");
        Autores autor5 = new Autores("Pamela", "Orellana");
        
        p [0] = autor1;
        p [1] = autor2;
        p [2] = autor3;
        p [3] = autor4;
        p [4] = autor5;
        ///////////////////////////////////////////////////
        
      /*ArrayList<Libros> lib=new ArrayList<>();
      lib.add(lib); //0
      lib.add(lib); //1
      lib.add(lib); //2
      
      lib.remove(0);*/
        
        for (Autores a : p){
          System.out.println("Autores:"+a);
      }
    }
}
