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
    private int id;
    private String nombre, puesto;
    private NodoP siguienteP;

    public NodoP() {
    }

    public NodoP(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }
    
    
    

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
    
    @Override
    public String toString(){
        return id +"---"+nombre+"---"+puesto;
    }
    
}
