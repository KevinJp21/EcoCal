package Modelo;

import com.toedter.calendar.JDateChooser;
import java.util.Date;

/**
 *
 * @author KevinJp
 */
public class Usuarios {
    private int id_usuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String Contraseña;
    private JDateChooser FechaNac;

    
     public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public JDateChooser getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(JDateChooser FechaNac) {
        this.FechaNac = FechaNac;
    }
}
