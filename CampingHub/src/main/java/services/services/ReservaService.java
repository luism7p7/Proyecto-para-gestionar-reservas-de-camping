package com.example.CampingHub.services;
import java.util.List;
import com.example.CampingHub.entities.Reserva;

public interface ReservaService {

    Reserva crearReserva(Reserva reserva);

    Reserva confirmarReserva(Long id);

    Reserva cancelarReserva(Long id);

    List<Reserva> obtenerTodasLasReservas();

    Reserva obtenerReservaPorId(Long id);

}
