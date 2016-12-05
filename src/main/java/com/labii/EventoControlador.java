package com.labii;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by umantram on 28/11/16.
 */
@RestController
public class EventoControlador {

    @RequestMapping(value = "/evento", method = RequestMethod.GET)
    public Collection<Evento> getEvento(){
        return EventoManejoDatos.getListaEventos();
    }

    @RequestMapping(value = "/evento/{idEvento}", method = RequestMethod.GET)
    public Evento getEventoPorID(@PathVariable("idEvento") Integer idEvento){
        return EventoManejoDatos.getEventos(idEvento) ;
    }

    //Alta
    @RequestMapping(value = "/evento/alta", method = RequestMethod.POST)
    public void altaEvento(@RequestBody Evento evento){

        //System.out.println("probando " + evento.getFechaInicio().getDia());

        EventoManejoDatos.altaEvento(evento.getNombre(), evento.getDescripcion(), evento.getColor(),
                                evento.getFechaInicio().getDia(), evento.getFechaInicio().getMes(),
                                evento.getFechaInicio().getAnio(), evento.getFechaInicio().getHora(),
                                evento.getFechaInicio().getMinutos(),
                                evento.getFechaFin() .getDia(), evento.getFechaFin().getMes(),
                                evento.getFechaFin().getAnio(), evento.getFechaFin().getHora(),
                                evento.getFechaFin().getMinutos(),
                                evento.getIdCalendario());

    }

    //Baja
    @RequestMapping(value = "/evento/{idEvento}/baja", method = RequestMethod.DELETE)
    public void bajaEvento(@PathVariable(value = "idEvento") Integer idEvento){

        EventoManejoDatos.bajaEvento(idEvento);
    }

    //Modificar
    @RequestMapping(value = "/evento/{idEvento}/modificar", method = RequestMethod.PUT)
    public void modificarEvento(@PathVariable(value = "idEvento") Integer idEvento, @RequestBody Evento evento){
        EventoManejoDatos.modificarEvento(idEvento, evento.getNombre(), evento.getDescripcion());
    }

}
