package com.labii;

/**
 * Created by umantram on 27/11/16.
 */
public class Evento {

    private int id;
    private String nombre;
    private Calendario calendario;

    public Evento(int id, String nombre, int idCalendario) {
        this.id = id;
        this.nombre = nombre;
        this.calendario = CalendarioSource.getCalendario(idCalendario);
        //System.out.println(this.calendario.getNombre());
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Calendario getCalendario() {
        return calendario;
    }
}
