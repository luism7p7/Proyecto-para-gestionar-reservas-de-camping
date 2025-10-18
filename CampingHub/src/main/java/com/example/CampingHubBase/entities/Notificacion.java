package com.example.CampingHub.entities;

import jakarta.persistence.*;


import java.util.Date;
@Entity
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNotificacion;
    private String mensaje;
    private Date fechaEnvio;

    public void enviar(){
        System.out.println("notificacion enviada : " + mensaje);
    }

}
