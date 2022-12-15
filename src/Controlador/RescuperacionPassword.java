package Controlador;
import Modelo.RecuperacionPass;
import java.sql.*;
/**
 *
 * @author KevinJp
 */
public class RescuperacionPassword {
    public String correo;

    public String getContra() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public ResultSet RecuperacionContra(){
        RecuperacionPass recu = new RecuperacionPass();
        return recu.RecuperacionContraseña(correo);
    }
}
