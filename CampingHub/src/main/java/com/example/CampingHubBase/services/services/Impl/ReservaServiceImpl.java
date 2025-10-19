package com.example.CampingHub.services.Impl;

import com.example.CampingHub.entities.Cliente;
import com.example.CampingHub.entities.Finca;
import com.example.CampingHub.entities.Reserva;
import com.example.CampingHub.repositories.ClienteRepository;
import com.example.CampingHub.repositories.FincaRepository;
import com.example.CampingHub.repositories.ReservaRepository;
import com.example.CampingHub.services.ReservaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {
    private final ReservaRepository reservaRepository;

    private final ClienteRepository clienteRepository;
    private final FincaRepository fincaRepository;


    public ReservaServiceImpl(ReservaRepository reservaRepository, ClienteRepository clienteRepository, FincaRepository fincaRepository) {
        this.reservaRepository = reservaRepository;
        this.clienteRepository = clienteRepository;
        this.fincaRepository = fincaRepository;
    }

    @Override
    public Reserva crearReserva(Reserva reserva){

        Cliente clienteCompleto = clienteRepository.findById(reserva.getCliente().getIdUsuario())
                .orElseThrow(() -> new RuntimeException("No se encontró el cliente con ID: " + reserva.getCliente().getIdUsuario()));


        Finca fincaCompleta = fincaRepository.findById(reserva.getFinca().getIdFinca())
                .orElseThrow(() -> new RuntimeException("No se encontró la finca con ID: " + reserva.getFinca().getIdFinca()));

       
        reserva.setCliente(clienteCompleto);
        reserva.setFinca(fincaCompleta);


        reserva.setEstado("pendiente");
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva confirmarReserva(Long id){
        Reserva r =  reservaRepository.findById(id).orElseThrow();
        r.confirmarReserva();
        return reservaRepository.save(r);
    }

    @Override
    public Reserva cancelarReserva(Long id) {
        Reserva r = reservaRepository.findById(id).orElseThrow();
        r.cancelarReserva();
        return reservaRepository.save(r);
    }

    @Override
    public List<Reserva> obtenerTodasLasReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva obtenerReservaPorId(Long id) {
        return reservaRepository.findById(id).orElseThrow(() -> new RuntimeException("Reserva no encontrada con id: " + id));
    }
}


