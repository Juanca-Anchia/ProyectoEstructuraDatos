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
    private int modelo;
    private int placa;
    private String marchamo;
    private String rtv;
    private String notas;
    private NodoA siguienteA;

    public NodoA() {
    }
    
    

    public NodoA(int modelo, int placa, String marchamo, String rtv, String notas) {
        this.modelo = modelo;
        this.placa = placa;
        this.marchamo = marchamo;
        this.rtv = rtv;
        this.notas = notas;
        
    }

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

    
    @Override 
    public String toString(){
        return modelo + " --- " + placa + " --- " + marchamo  + " --- " + rtv + " --- " + notas;
         
    }
}
