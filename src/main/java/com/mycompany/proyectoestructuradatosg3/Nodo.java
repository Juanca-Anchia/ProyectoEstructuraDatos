/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradatosg3;

/**
 *
 * @author anchi
 */
public class Nodo {
    private int codigo, precio; //codigo y precio del servicio
    private String nombre; //nombre dle servicio
    private Nodo siguiente; //enlaccxe dcel siguiente nodo de la lista

    public Nodo() {
    }
//construictor con los aprametros para inicializar el nodo
    public Nodo(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
//getters setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
     // metodo toString para devolver la cadena con la informacion del nodo  
    @Override 
    public String toString(){
        return codigo +"---"+nombre+"---"+precio;
    }
}
