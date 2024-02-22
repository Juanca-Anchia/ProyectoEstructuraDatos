/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradatosg3;

/**
 *
 * @author anchi
 */
public class NodoA {
    private int modelo; //anno del modelo del auto
    private int placa; // numero de placa del auto
    private String marchamo; // estado del marchamo
    private String rtv; // estado de la revision tecnica vehicular
    private String notas; // notas adicionales sobre el auto
    private NodoA siguienteA; // enlace al siguiente nodo en la lista

    
    public NodoA() {
    }
    
    
// onsnstructor con parametros para inicializar el nodo
    public NodoA(int modelo, int placa, String marchamo, String rtv, String notas) {
        this.modelo = modelo;
        this.placa = placa;
        this.marchamo = marchamo;
        this.rtv = rtv;
        this.notas = notas;
        
    }
//getetrs y setters
    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getMarchamo() {
        return marchamo;
    }

    public void setMarchamo(String marchamo) {
        this.marchamo = marchamo;
    }

    public String getRtv() {
        return rtv;
    }

    public void setRtv(String rtv) {
        this.rtv = rtv;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public NodoA getSiguienteA() {
        return siguienteA;
    }

    public void setSiguienteA(NodoA siguienteA) {
        this.siguienteA = siguienteA;
    }

  // mmetodo toString para devolver la cadena con la informacion del nodo  
    @Override 
    public String toString(){
        return modelo + " --- " + placa + " --- " + marchamo  + " --- " + rtv + " --- " + notas;
         
    }
}
