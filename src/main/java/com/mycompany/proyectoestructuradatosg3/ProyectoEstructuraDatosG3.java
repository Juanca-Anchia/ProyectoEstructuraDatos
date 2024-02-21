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
        Servicios servicios = new Servicios();
        servicios.almacenarServicios(0, "Llantas", 120000);
        servicios.almacenarServicios(1, "Aros", 300000);
        servicios.almacenarServicios(2, "Asientos", 400000);
        System.out.println(servicios.imprimirServicios(servicios.getPrimero(), ""));
        Empleados empleados = new Empleados();
        empleados.almacenarEmpleado(0, "Juan", "Mecanico");
        empleados.almacenarEmpleado(1, "Jose", "Gerente");
        empleados.almacenarEmpleado(2, "Marco", "Auxiliar");
        empleados.almacenarEmpleado(3, "Daniel", "Supervisor");
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

        }
        System.out.println(empleados.imprimirEmpleados(empleados.getCima(), ""));*/
        Autos autos = new Autos();
        autos.almacenarAuto(2020, 12345, "SI", "SI", "n/a");
        autos.almacenarAuto(2024, 16456, "SI", "NO", "ninguna");
        autos.almacenarAuto(2015, 14562, "SI", "SI", "Golpes");
        System.out.println(autos);
    }
}
