package com.labii;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by francomoglia on 12/3/16.
 */
public class CalendarioTest extends TestCase{

    @Test
    public void testCalendario(){

        Usuario usuario1 = new Usuario(11, "juan", "juan@gmail.com");
        Usuario usuario2 = new Usuario(12, "carlos", "carlos@gmail.com");
        Usuario usuario3 = new Usuario(13, "roberto", "roberto@gmail.com");

        UsuarioManejoDatos.altaUsuario("juan", "juan@gmail.com");
        UsuarioManejoDatos.altaUsuario("carlos", "carlos@gmail.com");
        UsuarioManejoDatos.altaUsuario("roberto", "roberto@gmail.com");


        Calendario calendar1 = new Calendario(0, "MyCalendar", 0);
        Calendario calendar2 = new Calendario(1, "calendario", 1);
        Calendario calendar3 = new Calendario(22, "algo", 1);


        /*
        *   TEST DEL METODO getIdCalendario()
        * */
        assertEquals(calendar1.getidCalendario(), new Integer(0));


    }

}