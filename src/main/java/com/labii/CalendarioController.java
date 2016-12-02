package com.labii;

import org.springframework.web.bind.annotation.*;
import sun.util.resources.cldr.nd.CalendarData_nd_ZW;

import java.util.Collection;

/**
 * Created by umantram on 27/11/16.
 */
    @RestController
    public class CalendarioController {

    @RequestMapping(value = "/calendario", method = RequestMethod.GET)
    public Collection<Calendario> getCalendario(){
        return CalendarioSource.getListaCalendarios();
    }

    @RequestMapping(value = "/calendario/{idCalendario}", method = RequestMethod.GET)
    public Calendario getCalendarioPorID(@PathVariable("idalendario") Integer idCalendario){
        return CalendarioSource.getCalendario(idCalendario) ;
    }

    //Alta
    @RequestMapping(value = "/calendario/alta", method = RequestMethod.POST)
    public void altaCalendario(@RequestBody Calendario input){
        CalendarioSource.altaCalendario(input.getNombre(), input.getIdUsuario());
    }

    //Baja
    @RequestMapping(value = "/calendario/{idCalendario}/baja", method = RequestMethod.DELETE)
    public void bajaCalendario(@PathVariable(value = "idCalendario") Integer idCalendario){
        CalendarioSource.bajaCalendario(idCalendario);
    }

    //Modificar
    @RequestMapping(value = "/calendario/{idCalendario}/modificar", method = RequestMethod.PUT)
    public void modificarCalendario(@PathVariable(value = "idCalendario") Integer idCalendario, @RequestBody Calendario Calendario){
        CalendarioSource.modificarCalendario(idCalendario, Calendario.getNombre());
    }


}


