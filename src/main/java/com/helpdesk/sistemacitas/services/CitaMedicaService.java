package com.helpdesk.sistemacitas.services;

import com.helpdesk.sistemacitas.models.CitaMedica;
import com.helpdesk.sistemacitas.repository.CitaMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaMedicaService {
    @Autowired
    private CitaMedicaRepository citaMedicaRepository;

    public CitaMedica registrarCita(CitaMedica citaMedica) {
        // Determinar el tipo de cita (nueva o seguimiento)
        List<CitaMedica> citasAnteriores = citaMedicaRepository.findByPacienteId(citaMedica.getPaciente().getId());
        if (citasAnteriores.isEmpty()) {
            citaMedica.setEsSeguimiento(false);
        } else {
            citaMedica.setEsSeguimiento(true);
        }
        return citaMedicaRepository.save(citaMedica);
    }

    public List<CitaMedica> findAll() {
        return citaMedicaRepository.findAll();
    }
}