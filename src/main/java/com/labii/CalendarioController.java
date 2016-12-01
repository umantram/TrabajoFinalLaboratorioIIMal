package com.labii;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by umantram on 27/11/16.
 */
    @RestController
    @RequestMapping(value = "/calendario")
    public class CalendarioController {

        @RequestMapping(value = "/")
        public Collection getAllCalendarios() {
            return CalendarioSource.getListaCalendarios();

        }

        @RequestMapping(method = RequestMethod.GET ,value = "/{calendarioId}")
        public Collection getCalendarioPorID(@PathVariable Integer calendarioId) {
            return EventoSource.listaEventosPorID(calendarioId);
        }


}


