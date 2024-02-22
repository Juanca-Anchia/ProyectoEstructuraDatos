/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradatosg3;

/**
 *
 * @author anchi
 */
public class Servicios { 
    private Nodo primero; // referencia al primer nodo de la lista
    private Nodo ultimo; // referencia al ultimo nodo de la lista
//getters y setters
    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
// aca se verifica si la lista esta vacia
    public boolean esVacia() {
        if (ultimo == null) {
            return true;
        } else {
            return false;
        }
    }
// por aca agrega un nuevo servicio a la lista
    public void almacenarServicios(int codigo, String nombre, int precio) {
        Nodo nuevoServicio = new Nodo(codigo, nombre, precio); // crea un nuevo nodo
        if (esVacia()) { // si la lista esta vacia
            primero = nuevoServicio;
            ultimo = nuevoServicio;
            nuevoServicio.setSiguiente(primero); // enlaza el nuevo nodo consigo mismo
        } else { // si la lista no esta vacia
            ultimo.setSiguiente(nuevoServicio); // el ultimo nodo apunta al nuevo
            nuevoServicio.setSiguiente(primero); // el nuevo nodo apunta al primero
            ultimo = nuevoServicio; // actualiza el ultimo nodo
        }
    }
// aca imprime los servicios empezando por un nodo dado
    public String imprimirServicios(Nodo nodo, String result) {
        if (nodo != ultimo) { // si el nodo actual no es el ultimo
            result += nodo.toString() + "\n"; // agrega la info del nodo a result
            if ( nodo.getSiguiente() != nodo) { // si el siguiente nodo no es el mismo
               
                result = imprimirServicios(nodo.getSiguiente(), result); // se llama de manera recussiva al siguiente nodo
            }
            
        }
        else{ // si es el ultimo nodo
            result += nodo.toString() + "\n"; // agrega la info del nodo a result
        }
        return result; 
    }
// convierte la lista en una cadena de texto
    @Override
    public String toString() {
        String s = "";
        Nodo aux = primero;
        while (aux != null) { // recorre la lista
            s += aux + "\n"; // agrega la info de cada nodo a s
            aux = aux.getSiguiente(); // pasa al siguiente nodo
        }
        return s; // devuelve la cadena resultante
    }
}
