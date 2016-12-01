package com.labii;

/**
 * Created by umantram on 27/11/16.
 */
public class Evento {

    private int idEvento;
    private String nombre;
    private Calendario calendario;
    private String descripcion;

    public Evento(int idEvento, String nombre, int idCalendario, String descripcion) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.calendario = CalendarioSource.getCalendario(idCalendario);
        //System.out.println(this.calendario.getNombre());
    }

    public Evento(){

    }

    public int getIdEvento() {
        return idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
