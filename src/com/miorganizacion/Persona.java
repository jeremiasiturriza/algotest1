package com.miorganizacion;

public class Persona {
    // Atributos
    String nombre;
    int edad;
    
    // Método constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    // Instancia
        public static void main(String[] args) {
     
            Persona Juana = new Persona("Mongo", 32);
            Juana.saludar();
        }
}

