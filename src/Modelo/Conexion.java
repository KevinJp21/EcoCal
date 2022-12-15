package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pinku
 */
public class Conexion {
    private Connection con;
    private ResultSet res;
    private Statement sql;
    String bd="ecocal";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String pass="admin";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion() {
       
    }

   
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url+bd,user,pass);
            
        } catch (ClassNotFoundException|SQLException ex) {
            System.out.println("No se conecto a la BD "+bd);
            
        }
        return cx;
    }
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void setRs(String devcode) {
        try {
            setSql();
            res = getSql().executeQuery(devcode);
        } catch (Exception e) {
        }
    }
    public Statement getSql() {
        return sql;
    }
    public void setSql() {
        try {
            this.sql = (Statement) con.createStatement(); //si no funca se castea
        } catch (Exception e) {
        }
    }
    
      public ResultSet getRs() {
        return res;
    
      }   
}
