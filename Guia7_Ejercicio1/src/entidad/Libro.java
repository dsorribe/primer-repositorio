/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, 
el título, el autor del libro y el número de páginas.
 */
//package entidad;

import java.util.Scanner;


public class Libro {
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumPagina;

    
    
    public Libro() {   
    }
    
    public Libro(int ISBN, String Titulo, String Autor, int NumPagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPagina = NumPagina;
    }

    public void datos(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("ISBN: ");
        ISBN = read.nextInt();
        System.out.println("Titulo: ");
        Titulo = read.next();
        System.out.println("Autor: ");
        Autor = read.next();
        System.out.println("Numero de paginas: ");
        NumPagina = read.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumPagina=" + NumPagina + '}';
    }
    
    
}

