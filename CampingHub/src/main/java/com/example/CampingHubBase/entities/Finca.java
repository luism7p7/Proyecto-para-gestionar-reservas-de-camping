package com.example.CampingHub.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Finca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFinca;
    private String nombre;
    private String ubicacion;
    private int capacidad;

    public Finca() {
    }

    public Finca(Long idFinca, int capacidad, String ubicacion, String nombre) {
        this.idFinca = idFinca;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDisponibilidad(){
        System.out.println("la finca" + nombre + "tiene capacidad de " + capacidad + "personas");

    }

}
