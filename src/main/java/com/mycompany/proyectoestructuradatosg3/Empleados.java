/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradatosg3;

/**
 *
 * @author anchi
 */
public class Empleados {
    private NodoP cima; // referencia al nodo superior de la pila
    
// constructor inicializa la cima de la pila a null
    public Empleados() {
        this.cima = null;
    }
// ggetter para obtener la cima de la pila
    public NodoP getCima() {
        return cima;
    }
// stter para establecer la cima de la pila
    public void setCima(NodoP cima) {
        this.cima = cima;
    }

    
     // verifica si la pila esta vacia
    public boolean esVacia()
    {
        if(cima == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // almacena un nuevo empleado en la pila
    public void almacenarEmpleado(int id, String nombre, String puesto)
    {
        NodoP nuevoEmpleado = new NodoP(id, nombre, puesto); // crea un nuevo nodo empleado
        if(esVacia()) // si la pila esta vacia, el nuevo nodo se convierte en la cima
        {
            cima = nuevoEmpleado;
        
        } else { // si no, el nuevo nodo se pone encima de la pila actual
        
            nuevoEmpleado.setSiguienteP(cima); 
            cima = nuevoEmpleado;
        }
    }
    // imprime todos los empleados usanmdo la recursividad
    public String imprimirEmpleados(NodoP nodo, String result) {
        result = nodo.toString() + "\n"; // agrega la informacion del nodo actual al resultado
        if (nodo.getSiguienteP() != null) { //si hay mas nodos en la pila
            
            result = nodo.toString() + "\n"; // llama al metodo recursivamente con el siguiente nodo
            result += imprimirEmpleados(nodo.getSiguienteP(), result);
        }
         return result; //return para devolver el resultado
    }
    
    
    
    //convierte la lista de empleados a una cadena de texto
    @Override
    public String toString(){
        String s = "";
        NodoP aux = cima; // empieza por la cima de la pila
        while (aux != null) { // recorre todos los nodos de la pila
            s += aux + "\n"; // agrega la informacion de cada nodo a la cadena
            aux = aux.getSiguienteP(); // pasa al siguiente nodo
        }
        return s; //devuelve s
    
    }
    
}
