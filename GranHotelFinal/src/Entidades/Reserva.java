
package Entidades;

import ACCESODATOS.ABMhuesped;
import java.time.LocalDate;
import java.util.Date;


public class Reserva {
    private int idReserva;
    private int idhuesped;
    private int idhabitacion;
    private int cantidadDePersona;
    private LocalDate fechaingres;
    private LocalDate fechasalida;
    private double totalEstadia;

    public Reserva() {
    }

    public Reserva(int idReserva, int idhuesped, int idhabitacion, int cantidadDePersona, LocalDate fechaingres, LocalDate fechasalida, double totalEstadia) {
        this.idReserva = idReserva;
        this.idhuesped = idhuesped;
        this.idhabitacion = idhabitacion;
        this.cantidadDePersona = cantidadDePersona;
        this.fechaingres = fechaingres;
        this.fechasalida = fechasalida;
        this.totalEstadia = totalEstadia;
    }

    public Reserva(int idhuesped, int idhabitacion, int cantidadDePersona, LocalDate fechaingres, LocalDate fechasalida, double totalEstadia) {
        this.idhuesped = idhuesped;
        this.idhabitacion = idhabitacion;
        this.cantidadDePersona = cantidadDePersona;
        this.fechaingres = fechaingres;
        this.fechasalida = fechasalida;
        this.totalEstadia = totalEstadia;
    }

    public Reserva(int idhuesped, int idhabitacion, int cantidadPersona, Date ingreso, Date salida, double montoTotal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdhuesped() {
        return idhuesped;
    }

    public void setIdhuesped(int idhuesped) {
        this.idhuesped = idhuesped;
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public int getCantidadDePersona() {
        return cantidadDePersona;
    }

    public void setCantidadDePersona(int cantidadDePersona) {
        this.cantidadDePersona = cantidadDePersona;
    }

    public LocalDate getFechaingres() {
        return fechaingres;
    }

    public void setFechaingres(LocalDate fechaingres) {
        this.fechaingres = fechaingres;
    }

    public LocalDate getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(LocalDate fechasalida) {
        this.fechasalida = fechasalida;
    }

    public double getTotalEstadia() {
        return totalEstadia;
    }

    public void setTotalEstadia(double totalEstadia) {
        this.totalEstadia = totalEstadia;
    }

   
   
}
