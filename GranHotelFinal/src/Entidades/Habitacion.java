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
public class Habitacion {
    
    private Connection con = null;
    private int idHabitacion;
    private int numeroHabitacion;
    private boolean estado;
    private int tipo;

    public Habitacion() {
        con= Conexion.getConexion();
    }

    public Habitacion(int idHabitacion, int numeroHabitacion, boolean estado, int tipo) {
        this.idHabitacion = idHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.estado = estado;
        this.tipo = tipo;
    }

    public Habitacion(int numeroHabitacion, boolean estado, int tipo) {
        this.numeroHabitacion = numeroHabitacion;
        this.estado = estado;
        this.tipo = tipo;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    
    
    
}
