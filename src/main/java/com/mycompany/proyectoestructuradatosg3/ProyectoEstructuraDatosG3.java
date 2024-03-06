/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoestructuradatosg3;

/**
 *
 * @author anchi
 */
public class ProyectoEstructuraDatosG3 { 

    public static void main(String[] args) {
        Servicios servicios = new Servicios(); //lista de servicios
        servicios.almacenarServicios(new Servicio(3, "Llantas", 120000));
        servicios.almacenarServicios(new Servicio(1, "Aros", 300000));
        servicios.almacenarServicios(new Servicio(2, "Asientos", 400000));
        System.out.println(servicios);
        System.out.println("____________________________________________________");
        Empleados empleados = new Empleados(); //lista de empleados
        empleados.almacenarEmpleado(0, "Juan", "Mecanico");
        empleados.almacenarEmpleado(1, "Jose", "Gerente");
        empleados.almacenarEmpleado(2, "Marco", "Auxiliar");
        empleados.almacenarEmpleado(3, "Daniel", "Supervisor");
        System.out.println(empleados);
        System.out.println("*********************************************");
        /*boolean entrar = false;
        while(entrar == false){
            int s = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
            String x = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
            String y = JOptionPane.showInputDialog(null, "Ingrese el puesto: ");
            empleados.almacenarEmpleado(s, x, y);
            JOptionPane.showMessageDialog(null, empleados);
            
            int e = Integer.parseInt(JOptionPane.showInputDialog("Opciones: \n1.Ingresar nuevo empleado "
                                                                    + "\n2.Salir "));
            if(e == 1){
               entrar = false;
            }
            else if(e == 2){
               entrar = true;
            }
            else{
               break;
            }

        }*/
        
        
        Autos autos = new Autos(); //lista de autos
        autos.almacenarAuto(2020, 12345, "SI", "SI", "n/a");
        autos.almacenarAuto(2024, 16456, "SI", "NO", "ninguna");
        autos.almacenarAuto(2015, 14562, "SI", "SI", "Golpes");
        System.out.println(autos);
    }
}
