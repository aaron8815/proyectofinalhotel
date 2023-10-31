
package ACCESODATOS;

import Entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ABMreserva {
    private Connection con = null;

    public ABMreserva() {
        
        con= Conexion.getConexion();
    }
    
    
    public List<Reserva>  buscarReservaXhuesped(int idHuesped){
        ArrayList <Reserva> reserva = new ArrayList<>();
        String sql= " select * from reserva where idHuesped = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Reserva r = new Reserva();
                
                r.setIdhuesped(rs.getInt("idHuesped"));
                r.setIdhabitacion(rs.getInt("idHabitacion"));
                r.setCantidadDePersona(rs.getInt("CantidadPersonas"));
                r.setFechaingres(rs.getDate("FechaDeEntrada").toLocalDate());
                r.setFechasalida(rs.getDate("FechaDeSalida").toLocalDate());
                r.setTotalEstadia(rs.getDouble("TotalDeEstadia"));
                reserva.add(r);
                
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo ingresar a la tabla de reservas");
        }
        return reserva;
    }
    
    
    public void cancelarReserva(boolean estado, int idhabi){
        String sql="update habitacion set estado = ? where idHabitacion= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ps.setInt(2, idhabi);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "estado de habitacion modificado con exito");
            
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "no se pudo ingresar a tabla de habitacion");
         
        }
        
    }
    
    public void crearReserva(Reserva reserva){
        String sql= "insert into reserva (idHuesped,idHabitacion,CantidadPersonas,FechaDeEntrada,FechaDeSalida,TotalDeEstadia)values(?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reserva.getIdhuesped());
            ps.setInt(2, reserva.getIdhabitacion());
            ps.setInt(3, reserva.getCantidadDePersona());
            ps.setDate(4, Date.valueOf(reserva.getFechaingres()));
            ps.setDate(5,Date.valueOf(reserva.getFechasalida()));
            ps.setDouble(6, reserva.getTotalEstadia());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "reserva creada con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"no se pudo crear la reserva");
        }
    }
}
