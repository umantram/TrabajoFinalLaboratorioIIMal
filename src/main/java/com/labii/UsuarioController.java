package com.labii;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by francomoglia on 11/30/16.
 */

@RestController
public class UsuarioController {

    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    public Collection<Usuario> getUsuarios(){
        return UsuarioSource.getUsuarios();
    }

    @RequestMapping(value = "/usuarios/{idUsuario}", method = RequestMethod.GET)
    public Usuario getUsuarioPorID(@PathVariable("idUsuario") int idUsuario){
        return UsuarioSource.getUsuario(idUsuario);
    }

    //Alta
    @RequestMapping(value = "/usuarios/alta", method = RequestMethod.POST)
    public HttpStatus add(@RequestBody Usuario input){

        UsuarioSource.altaUsuario(input.getNombre(), input.getEmail());
        return HttpStatus.OK;

    }

    @RequestMapping(value = "/usuarios/{idUsuario}/baja", method = RequestMethod.DELETE)
    public void bajaUsuario(@PathVariable(value = "idUsuario") Integer idUsuario){
        UsuarioSource.bajaUsuario(idUsuario);
    }

    @RequestMapping(value = "/usuarios/{idUsuario}/modificar", method = RequestMethod.PUT)
    public void modifUsuario(@PathVariable(value = "idUsuario") Integer idUsuario, @RequestBody Usuario usuario){
        UsuarioSource.modifUsuario(idUsuario, usuario.getEmail());
    }

    /*
    @RequestMapping(value = "/usuarios/filtro", method = RequestMethod.GET)
    public Collection<Usuario> getPorEmail(@RequestParam(value = "email", defaultValue = "all") String email){
        if (email.equals("all")){
            return UsuarioSource.getUsuarios();
        }else {
            Collection result = new ArrayList();
            for (Usuario aux : UsuarioSource.getUsuarios()){
                if (aux.getEmail().equals(email)){
                    result.add(aux);
                }
            }

            return result;
        }
    }
    */

}