package com.example.CampingHub;

import com.example.CampingHub.entities.Cliente;
import com.example.CampingHub.entities.Finca;
import com.example.CampingHub.repositories.ClienteRepository;
import com.example.CampingHub.repositories.FincaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CampingHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampingHubApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadData(FincaRepository fincaRepository, ClienteRepository clienteRepository) {
        return args -> {
            System.out.println("Cargando datos de prueba ...");

            Finca fincaDePrueba = new Finca();
            fincaDePrueba.setNombre("finca el descanso");
            fincaDePrueba.setUbicacion("Guatape, Antioquia");
            fincaDePrueba.setCapacidad(10);
            fincaRepository.save(fincaDePrueba);

            Cliente clienteDePrueba = new Cliente();
            clienteDePrueba.setNombre("Luis Miguel");
            clienteDePrueba.setCorreo("Lmunosrendon123@gmail.com");
            clienteDePrueba.setContraseña("12345678");
            clienteRepository.save(clienteDePrueba);

            System.out.println("datos de prueba cargados: 1 finca y un cliente con ID 1.");
        };
    }
}