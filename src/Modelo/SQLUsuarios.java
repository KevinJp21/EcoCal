package Modelo;

import Vista.MenuPrincipal;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KevinJp
 */
public class SQLUsuarios extends Conexion {

    public String registrar(Usuarios usr) {
        PreparedStatement ps = null;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String date = formato.format(usr.getFechaNac().getDate());
        Connection con = conectar();
        String query = "select Correo from Usuarios where Correo=?";
        String sql = "INSERT INTO Usuarios (Nombre,Apellido,Correo,Contraseña,FechaNac) values(?,?,?,?,?)";

        try {
            Conexion cx = new Conexion();
            ps = con.prepareStatement(query);
            ps.setString(1, usr.getCorreo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return "existe";
            } else {
                ps = con.prepareStatement(sql);
                ps.setString(1, usr.getNombre());
                ps.setString(2, usr.getApellido());
                ps.setString(3, usr.getCorreo());
                ps.setString(4, usr.getContraseña());
                ps.setString(5, date);
                ps.execute();
                return "registrado";
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return "Error";
        }
    }
}
