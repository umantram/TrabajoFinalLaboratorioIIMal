package com.labii;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by umantram on 27/11/16.
 */
public class EventoSource {

    private static final Map<Integer, Evento> listaEventos = new HashMap<Integer, Evento>();
    private static final AtomicInteger contador = new AtomicInteger(0);

    static {

        Evento evento1 = new Evento(contador.incrementAndGet(), "limpiar" ,1);
        Evento evento2 = new Evento(contador.incrementAndGet(), "Estudiar",1);
        Evento evento3 = new Evento(contador.incrementAndGet(), "trabajar",2);

        listaEventos.put(evento1.getId(), evento1);
        listaEventos.put(evento2.getId(), evento2);
        listaEventos.put(evento3.getId(), evento3);

    }
/*
    public static Collection<Evento> getListaEventos() {

        return listaEventos.values();

    }
*/

    public static Map<Integer, Evento> getListaEventos() {
        return listaEventos;
    }

    public static Collection<Evento> listaEventosPorID(Integer idCalendario){

        HashMap<Integer, Evento> resul = new HashMap<Integer, Evento>();

        //System.out.println(listaEventos.values());

        for (Evento list : listaEventos.values()){

            if (list.getCalendario().getId() == idCalendario){
                resul.put(list.getId(), list);
            }
        }

        return resul.values();
    }



    //Iterator it = listaEventos.keySet().iterator();

        /*
        System.out.println(listaEventos.get(1));

        while(it.hasNext()){

            if (listaEventos.get(it.next()).getCalendario().equals(idCalendario)){

                resul.put(contador.incrementAndGet(), listaEventos.get(it.next()));
            }
        }
        */
}
