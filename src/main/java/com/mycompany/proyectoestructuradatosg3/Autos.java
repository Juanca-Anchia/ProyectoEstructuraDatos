/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradatosg3;

/**
 *
 * @author anchi
 */
public class Autos {
    private NodoA primero; 
    private NodoA ultimo; 

    public Autos() {

    }
   

    public void almacenarAuto(int modelo, int placa, String marchamo, String rtv, String notas) {
        NodoA nuevoAuto = new NodoA(modelo, placa, marchamo, rtv, notas);
        if (nuevoAuto.getMarchamo().equals("SI") && nuevoAuto.getRtv().equals("SI") ){
            if (primero == null) {
                primero = nuevoAuto;
                ultimo = nuevoAuto;
            } else {
                ultimo.setSiguienteA(nuevoAuto); 
                ultimo = nuevoAuto;
            }
        }
        
    }  
   
    
    @Override
    public String toString() {
        String s = "";
        NodoA aux = primero;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getSiguienteA();
        }
        return s;
    }
    
}
