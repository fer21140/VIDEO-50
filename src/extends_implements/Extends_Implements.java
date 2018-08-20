
//PROGRAMADOR: FERNANDO JOSÉ MARTÍNEZ FLORES
//FECHA: 02/08/2018
//CARNET DE ESTUDIANTE: 1190-17-4904
//VIDEO NUMERO 50 INTERFACES Y CLASES INTERNAS

package extends_implements;

import java.util.*;

public class Extends_Implements {

    public static void main(String[] args) {
       
        Empleado nuevoEmpleado = new Empleado();//Instanciamos clase nuevo empleado
        Scanner memoria = new Scanner(System.in);    
        
        System.out.println("Ingresa datos del empleado");
        System.out.println();
        
        nuevoEmpleado.ingresarDatos();//Obtenemos datos
       
        System.out.println();
        System.out.println();
        System.out.println("Datos de la clase empleado");
        System.out.println();
        System.out.println("Id: " + nuevoEmpleado.obtenerId() + " Nombre: " +
                nuevoEmpleado.obtenerNombre() + " Sueldo: " + nuevoEmpleado.obtenerSueldo()
        + " Fecha de contratacion: " +  nuevoEmpleado.obtenerFechaDeAlta());
        
        Jefe nuevoJefe = new Jefe();//Creamos jefe
        
        System.out.println();
        
        System.out.println("Ahora ingresa datos del jefe...");
        System.out.println();
        nuevoJefe.ingresarDatos();
         
        System.out.println("Datos de la clase Jefe");
        System.out.println();
        System.out.println("Id: " + nuevoJefe.obtenerId() + " Nombre: " +
                nuevoJefe.obtenerNombre() + " Sueldo: " + nuevoJefe.obtenerSueldo()
        + " Fecha de contratacion: " +  nuevoJefe.obtenerFechaDeAlta());
        
        System.out.println();
        
        System.out.println("Ahora haz que el jefe tome una decisión");
        System.out.println("Escribe la decisión a tomar");
        String decidido= memoria.nextLine();
        
        System.out.println(nuevoJefe.tomarDecision(decidido));
        
        
//Código
        
    }

  
    
}
