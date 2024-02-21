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
    private Nodo primero;
    private Nodo ultimo;

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

    public boolean esVacia() {
        if (ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void almacenarServicios(int codigo, String nombre, int precio) {
        Nodo nuevoServicio = new Nodo(codigo, nombre, precio);
        if (esVacia()) {
            primero = nuevoServicio;
            ultimo = nuevoServicio;
            nuevoServicio.setSiguiente(primero);
        } else {
            ultimo.setSiguiente(nuevoServicio);
            nuevoServicio.setSiguiente(primero);
            ultimo = nuevoServicio;
        }
    }

    public String imprimirServicios(Nodo nodo, String result) {
        if (nodo != ultimo) {
            result += nodo.toString() + "\n";
            if ( nodo.getSiguiente() != nodo) {
               
                result = imprimirServicios(nodo.getSiguiente(), result); 
            }
            
        }
        else{
            result += nodo.toString() + "\n";
        }
        return result;
    }

    @Override
    public String toString() {
        String s = "";
        Nodo aux = primero;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getSiguiente();
        }
        return s;
    }
}
