package com.helpdesk.sistemacitas.controllers;

import com.helpdesk.sistemacitas.models.Paciente;
import com.helpdesk.sistemacitas.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class HistorialController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/historial")
    public String mostrarFormulario(Model model) {
        model.addAttribute("pacientes", pacienteService.findAll());
        return "historialFormulario";
    }

    @PostMapping("/historial")
    public String mostrarHistorial(@RequestParam Long pacienteId, Model model) {
        Optional<Paciente> optionalPaciente = pacienteService.findById(pacienteId);
        if (optionalPaciente.isPresent()) {
            Paciente paciente = optionalPaciente.get();
            model.addAttribute("paciente", paciente);
            return "historialResultado";
        } else {
            // Manejo cuando no se encuentra el paciente
            return "error"; // Otra vista de error o redirigir a una página de error
        }
    }

}
