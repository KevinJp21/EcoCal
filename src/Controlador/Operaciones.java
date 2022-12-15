package Controlador;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operaciones {

    public boolean Estexto(String cad) {
        boolean sw = true;
        int lc = cad.length(), i;
        i = 0;
        char simbolo;
        while ((i < lc) && (sw)) {
            simbolo = cad.charAt(i);
            if (!(Character.isLetter(simbolo) || Character.isWhitespace(simbolo))) {
                sw = false;
            }
            i++;
        }
        return (sw);
    }

    public boolean EsContrasena(String cadena) {
        if (cadena.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$")) {
            return (true);
        } else {
            return (false);
        }

    }

    public boolean EsCorreo(String cadena) {
        if (cadena.matches("^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$")) {
            return (true);
        } else {
            return (false);
        }

    }

  

}
