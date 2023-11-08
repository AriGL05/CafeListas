package com.example.cafelistas.models;

public class Cafe {
    private String nombre;
    private String temperatura;
    private Integer precio;

    public Cafe(String nombre, String temperatura, Integer precio) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
