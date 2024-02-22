/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradatosg3;

/**
 *
 * @author anchi
 */
public class NodoP {
    private int id; // identificador del empleado
    private String nombre, puesto; // nombre y puesto del empleado
    private NodoP siguienteP; // enlace al siguiente nodo en la pila

    
    public NodoP() {
    }
// constructor con parametros para inicializar el nodo
    public NodoP(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }
    
    
    
//getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public NodoP getSiguienteP() {
        return siguienteP;
    }

    public void setSiguienteP(NodoP siguienteP) {
        this.siguienteP = siguienteP;
    }
    // metodo toString para devolver lacadena con la informacion del nodo
    @Override
    public String toString(){
        return id +"---"+nombre+"---"+puesto;
    }
    
}
