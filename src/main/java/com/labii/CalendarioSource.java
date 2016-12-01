package com.labii;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by umantram on 27/11/16.
 */
public class CalendarioSource {

    private static final Map<Integer, Calendario> listaCalendarios  = new HashMap<Integer, Calendario>();
    private static final  AtomicInteger contador = new AtomicInteger(0);

    static {

        Calendario calen1 = new Calendario(contador.incrementAndGet(), "oficina", 1);
        Calendario calen2 = new Calendario(contador.incrementAndGet(), "Casa", 2);

        listaCalendarios.put(calen1.getId(), calen1);
        listaCalendarios.put(calen2.getId(), calen2);

    };


    public static Collection<Calendario> getListaCalendarios() {
        return listaCalendarios.values();
    }

    public static Calendario getCalendario(int idCalendario){

        return listaCalendarios.get(idCalendario);

    }

}
