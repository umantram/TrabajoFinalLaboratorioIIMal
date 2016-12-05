package com.labii;

/**
 * Created by umantram on 27/11/16.
 */
public class Calendario {

    private Integer idCalendario = 0;
    private String nombre;
    private Usuario usuario;
    private Integer idUsuario;

    //private ArrayList<Evento> eventos = new ArrayList<Evento>();
    //private Map<Integer, Evento> eventos  = new HashMap<Integer, Evento>();

    public Calendario(int idCalendario, String nombre, int idUsuario) {

        this.idCalendario = idCalendario;
        this.nombre = nombre;
        this.usuario = UsuarioManejoDatos.getUsuario(idUsuario);

        //this.eventos.putAll(EventoManejoDatos.getListaEventos());
    }

    public Calendario(){

    }


    public Integer getidCalendario() {
        return idCalendario;
    }

    public String getNombre() {
        return nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    /*
    public Map<Integer, Evento> getEventos() {
        return eventos;
    }
    */

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
