package com.example.CampingHub.entities;


import jakarta.persistence.Entity;

@Entity
public class Cliente extends Usuario {
    public void realizarReserva(){

        System.out.println("el cliente" + getNombre() + "ha realizado una reserva" );
    }


}
