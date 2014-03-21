package com.edib.tarjetavisita.Model;

/**
 * Created by studio on 13/03/14.
 */
public abstract class TarjetaVisita {

    private String nombre;
    private String titulacion;
    private String web;
    // ...


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
