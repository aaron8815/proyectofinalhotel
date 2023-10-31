/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granhotelfinal;


import ACCESODATOS.ABMhabitacion;
import ACCESODATOS.ABMhuesped;
import ACCESODATOS.ABMreserva;
import ACCESODATOS.Conexion;
import Entidades.Habitacion;
import Entidades.Reserva;

import Entidades.TipoDeHabitacion;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author pc
 */
public class GranHotelFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();
        ABMreserva hab= new ABMreserva();
        int idhuesped=0;
        ABMhuesped k = new ABMhuesped();
        ABMhabitacion s = new ABMhabitacion();
        int cantidad=0;
        for (Habitacion ha :s.cantidadHabitacion(7) ){
            System.out.println(cantidad++);
        }
        System.out.println(cantidad);
          
      
       
    }
    
}
