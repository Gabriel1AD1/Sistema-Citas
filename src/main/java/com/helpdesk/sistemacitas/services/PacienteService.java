package com.helpdesk.sistemacitas.services;

import com.helpdesk.sistemacitas.models.CitaMedica;
import com.helpdesk.sistemacitas.models.Paciente;
import com.helpdesk.sistemacitas.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public String registrarPaciente(Paciente paciente) {
        Optional<Paciente> isPresent = pacienteRepository.findOneByDni(paciente.getDni());

        if (isPresent.isPresent()) {
            // El paciente ya existe en la base de datos
            return "Paciente Existe";
        }

        pacienteRepository.save(paciente);
        return "Cliente Registrado Con Exito";
    }
    public Optional<Paciente> findById(Long pacienteId) {
        return pacienteRepository.findById(pacienteId);
    }

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }
}
