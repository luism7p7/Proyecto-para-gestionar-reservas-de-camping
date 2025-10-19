package com.example.CampingHub.entities;

import jakarta.persistence.*;


import java.util.Date;
@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;

    public Reserva() {
    }

    public Reserva(Long idReserva, Finca finca, Cliente cliente, String estado, Date fechaFin, Date fechaInicio) {
        this.idReserva = idReserva;
        this.finca = finca;
        this.cliente = cliente;
        this.estado = estado;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Finca finca;

    public void confirmarReserva(){
        this.estado = "Confirmada";
        System.out.println("reserva confirmada");
    }

    public void cancelarReserva(){
        this.estado = "Cancelada";
        System.out.println("reserva cancelada");
    }




}
