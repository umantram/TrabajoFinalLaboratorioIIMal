package com.labii;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by umantram on 28/11/16.
 */
@RestController
@RequestMapping(value = "/evento")

public class EventoController {

        @RequestMapping(value = "/")
        public Collection getEmployeeNames() {
            return (Collection) EventoSource.getListaEventos();

        }

        @RequestMapping(value = "/{userId}")
        Collection readBookmarks(@PathVariable Integer userId) {
            return EventoSource.listaEventosPorID(userId);
        }



    }
