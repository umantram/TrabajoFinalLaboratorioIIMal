package com.labii;

import junit.framework.TestCase;

/**
 * Created by umantram on 30/11/16.
 */
public class UsuarioTest extends TestCase {

    public void testUsuario() throws Exception{

        int idUsuario=1;
        String nombre="andres";
        String email="umantram";

        Usuario usuario = new Usuario(1, "andres", "umantram");

        assertEquals(usuario.getIdUsuario(), idUsuario);
        assertEquals(usuario.getNombre(), nombre);
        assertEquals(usuario.getEmail(), email);

    }
}