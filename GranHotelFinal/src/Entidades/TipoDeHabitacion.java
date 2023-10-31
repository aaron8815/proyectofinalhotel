/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import ACCESODATOS.Conexion;
import java.sql.Connection;


/**
 *
 * @author pc
 */
public class TipoDeHabitacion {
    private Connection con = null;
    private int idtipoDeHabitacion;
    private int codigo;
    private int cantidadDePersona;
    private int cantidadDeCamas;
    private String tipo;
    private double precioPorPersona;
    
     public TipoDeHabitacion() {
        con= Conexion.getConexion();
    }

    public TipoDeHabitacion(int codigo, int cantidadDePersona, int cantidadDeCamas, String tipo, double precioPorPersona) {
        this.codigo = codigo;
        this.cantidadDePersona = cantidadDePersona;
        this.cantidadDeCamas = cantidadDeCamas;
        this.tipo = tipo;
        this.precioPorPersona = precioPorPersona;
    }

    public TipoDeHabitacion(int idtipoDeHabitacion, int codigo, int cantidadDePersona, int cantidadDeCamas, String tipo, double precioPorPersona) {
        this.idtipoDeHabitacion = idtipoDeHabitacion;
        this.codigo = codigo;
        this.cantidadDePersona = cantidadDePersona;
        this.cantidadDeCamas = cantidadDeCamas;
        this.tipo = tipo;
        this.precioPorPersona = precioPorPersona;
    }

    public int getIdtipoDeHabitacion() {
        return idtipoDeHabitacion;
    }

    public void setIdtipoDeHabitacion(int idtipoDeHabitacion) {
        this.idtipoDeHabitacion = idtipoDeHabitacion;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadDePersona() {
        return cantidadDePersona;
    }

    public void setCantidadDePersona(int cantidadDePersona) {
        this.cantidadDePersona = cantidadDePersona;
    }

    public int getCantidadDeCamas() {
        return cantidadDeCamas;
    }

    public void setCantidadDeCamas(int cantidadDeCamas) {
        this.cantidadDeCamas = cantidadDeCamas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioPorPersona() {
        return precioPorPersona;
    }

    public void setPrecioPorPersona(double precioPorPersona) {
        this.precioPorPersona = precioPorPersona;
    }

    @Override
    public String toString() {
        return tipo;
    } 
    
    //listar tipo de habitacion 
    
    
}
