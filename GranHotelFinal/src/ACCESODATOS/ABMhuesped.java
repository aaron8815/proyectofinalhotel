
package ACCESODATOS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class ABMhuesped {
    private Connection con = null;
    private int idHuesped;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private String correo;
    private String celular;

    public ABMhuesped() {
        con = Conexion.getConexion();
        
    }

    public ABMhuesped(int idHuesped, String nombre, String apellido, int dni, String domicilio, String correo, String celular) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }

    public ABMhuesped(String nombre, String apellido, int dni, String domicilio, String correo, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public List<ABMhuesped> buscarHuespedPorDNI (int dni){
        ArrayList<ABMhuesped> huesped = new ArrayList<>();
        String sql = "select idHuesped, Nombre,Apellido, Domicilio, Correo , Celular from abm_huesped where dni = ?";
        
        
        try {
            PreparedStatement ps=  con.prepareStatement(sql);
            ps.setInt(1, dni);
            
            ResultSet rs = ps.executeQuery();
            while( rs.next()){
               ABMhuesped h = new ABMhuesped();
               h.setIdHuesped(rs.getInt("idHuesped"));
               h.setNombre(rs.getString("Nombre"));
               h.setApellido(rs.getString("Apellido"));
               h.setDomicilio(rs.getString("Domicilio"));
               h.setCorreo(rs.getString("Correo"));
               h.setCelular(rs.getString("Celular"));
               huesped.add(h);
               
               
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo ingresar a la tabla de husped");
            
        
        }
        return huesped;
    }
    public void crearHuesped(ABMhuesped huesped){
        String sql= "insert into abm_huesped (nombre,apellido,dni,domicilio,correo,celular)values (?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getCelular());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "huesped creado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo crear el huesped");
            
        }
    }
}
