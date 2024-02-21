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
    private NodoP cima;

    public Empleados() {
        this.cima = null;
    }

    public NodoP getCima() {
        return cima;
    }

    public void setCima(NodoP cima) {
        this.cima = cima;
    }

    
    
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
    
    public void almacenarEmpleado(int id, String nombre, String puesto)
    {
        NodoP nuevoEmpleado = new NodoP(id, nombre, puesto);
        if(esVacia())
        {
            cima = nuevoEmpleado;
        }
        else
        {
            nuevoEmpleado.setSiguienteP(cima); 
            cima = nuevoEmpleado;
        }
    }
    
    public String imprimirEmpleados(NodoP nodo, String result) {
        result = nodo.toString() + "\n";
        if (nodo.getSiguienteP() != null) {
            
            result = nodo.toString() + "\n";
            result += imprimirEmpleados(nodo.getSiguienteP(), result);
        }
         return result;
    }
    
    
    
    
    @Override
    public String toString(){
        String s = "";
        NodoP aux = cima;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getSiguienteP();
        }
        return s;
    
    }
    
}
