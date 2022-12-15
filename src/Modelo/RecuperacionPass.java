package Modelo;

import java.sql.*;

/**
 *
 * @author KevinJp
 */
public class RecuperacionPass {

    public ResultSet RecuperacionContraseña(String Correo) {
        Conexion cx = new Conexion();
        Connection con;
        PreparedStatement ps;

        try {
            con = cx.conectar();
            String query = "select * from Usuarios where Correo='" +Correo+ "'";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("Error");
            return null;
        }

    }
}
