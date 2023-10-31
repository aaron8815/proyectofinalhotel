/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACCESODATOS;

import Entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class ABMhabitacion {
    private Connection con = null;

    public ABMhabitacion() {
        con= Conexion.getConexion();
    }
    
    
    public List<Habitacion> gesttionHabitacion(int tipo){
        ArrayList<Habitacion> habitacion= new ArrayList<>();
        String sql= " select  idHabitacion, numeroHabitacion, estado,idTipoDeHabitacion from habitacion where estado = 0 and idTipoDeHabitacion= ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, tipo);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Habitacion h = new Habitacion();
                h.setIdHabitacion(rs.getInt("idHabitacion"));
                h.setNumeroHabitacion(rs.getInt("numeroHabitacion"));
                h.setEstado(rs.getBoolean("estado"));
                h.setTipo(rs.getInt("idTipoDeHabitacion"));
                habitacion.add(h);
                
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo ingresar a la tabla de habitacion");
            
        }
        
        return habitacion;
        
    }
    public void altaBajaDeHabitacion(int idhabitacion){
        
        String sql= "update habitacion set estado = 1 where idhabitacion = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idhabitacion);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"habitacion "+ idhabitacion + " ocupada");
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null," no se pudo modificar el estado");
        }
        
    }
    
    public List<Habitacion> cantidadHabitacion(int tipo){
        ArrayList<Habitacion> habitacion= new ArrayList<>();
        String sql= " select   numeroHabitacion, estado,idTipoDeHabitacion from habitacion where estado = 1 and idTipoDeHabitacion= ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, tipo);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Habitacion h = new Habitacion();
                h.setNumeroHabitacion(rs.getInt("numeroHabitacion"));
                h.setEstado(rs.getBoolean("estado"));
                h.setTipo(rs.getInt("idTipoDeHabitacion"));
                habitacion.add(h);
                
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo ingresar a la tabla de habitacion");
            
        }
        
        return habitacion;
    
    }
    
    public void habitaacionesDesocupadas(int idtipodehabitacion){
        
        String sql= "select count(*) habitacion where idTipoDeHabitacion = ? and estado= 0 ";
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idtipodehabitacion);
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"no se pudo contar las habitaciones");
        }
        
        
        
    }
    
}
