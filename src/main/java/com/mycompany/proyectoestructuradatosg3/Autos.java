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
    private NodoA primero;  // referencia al primer auto en la lista
    private NodoA ultimo;  // referencia al ultimo auto en la lista

    public Autos() {

    }
   
// metodo para almacenar un auto si cumple con marchamo y RTV al dia
    public void almacenarAuto(int modelo, int placa, String marchamo, String rtv, String notas) {
        NodoA nuevoAuto = new NodoA(modelo, placa, marchamo, rtv, notas); // crea un nuevo nodo auto
        if (nuevoAuto.getMarchamo().equals("SI") && nuevoAuto.getRtv().equals("SI") ){ // verifica que el auto tenga marchamo y RTV al dia
            if (primero == null) { // ssi la lista esta vacia, establece el nuevo auto como primero y ultimo
                primero = nuevoAuto;
                ultimo = nuevoAuto;
            } else { // si no esta vacia, lo agrega al final de la lista
                ultimo.setSiguienteA(nuevoAuto); 
                ultimo = nuevoAuto;
            }
        }
        
    }  
   
    // convierte la lista de autos a una cadena de texto
    @Override
    public String toString() {
        String s = "";
        NodoA aux = primero; // comienza con el primer auto
        while (aux != null) {  // recorre la lista agregando la informacion de cada auto a la cadena
            s += aux + "\n";
            aux = aux.getSiguienteA();
        }
        return s; //devuelve s
        
    }
    
}
