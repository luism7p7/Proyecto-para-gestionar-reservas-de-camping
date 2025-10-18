package com.example.CampingHub.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Administrador extends Usuario {

    public void gestionarFinca(){
        System.out.println("el administrador esta gestionando una finca");
    }
    public void gestionarReserva(){
        System.out.println("el administrador esta gestionando una reserva");
    }


}
