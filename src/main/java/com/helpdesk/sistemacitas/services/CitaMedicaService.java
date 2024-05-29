package com.helpdesk.sistemacitas.services;

import com.helpdesk.sistemacitas.models.CitaMedica;
import com.helpdesk.sistemacitas.models.Paciente;
import com.helpdesk.sistemacitas.repository.CitaMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaMedicaService {
    @Autowired
    private CitaMedicaRepository citaMedicaRepository;

    @Autowired
    private PacienteService pacienteService;

    public CitaMedica registrarCita(CitaMedica citaMedica) {
        System.out.println(citaMedica.getPaciente().getId());
        Paciente paciente = citaMedica.getPaciente();

        // Obtener el historial de citas del paciente
        List<CitaMedica> citasAnteriores = citaMedicaRepository.findByPacienteId(paciente.getId());

        // Obtener el historial de tratamientos del paciente
        Optional<Paciente> pacienteOptional = pacienteService.findById(paciente.getId());

        if (pacienteOptional.isPresent()) {
            paciente = pacienteOptional.get();
            List<CitaMedica> historialTratamientos = paciente.getHistorialTratamientos();

            // Verificar si el tratamiento es repetido
            boolean tratamientoRepetido = false;
            for (CitaMedica cita : historialTratamientos) {
                if (citaMedica.esTratamientoSimilar(cita)) {
                    System.out.println("Cita Encontrada");
                    tratamientoRepetido = true;
                    break;
                }
            }

            // Establecer esSeguimiento dependiendo de si el tratamiento es repetido
            citaMedica.setEsSeguimiento(tratamientoRepetido);
        }

        return citaMedicaRepository.save(citaMedica);
    }


    public List<CitaMedica> findAll() {
        return citaMedicaRepository.findAll();
    }
}
