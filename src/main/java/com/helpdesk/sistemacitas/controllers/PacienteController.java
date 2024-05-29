package com.helpdesk.sistemacitas.controllers;

import com.helpdesk.sistemacitas.models.Paciente;
import com.helpdesk.sistemacitas.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/registrarPaciente")
    public String showForm(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "registrarPaciente";
    }

    @PostMapping("/registrarPaciente")
    public String submitForm(@ModelAttribute Paciente paciente, Model model) {
        String result = pacienteService.registrarPaciente(paciente);

        if ("Paciente Existe".equals(result)) {
            model.addAttribute("error", result);
            return "registrarPaciente";
        }

        return "redirect:/pacientes";
    }

    @GetMapping("/pacientes")
    public String listPacientes(Model model) {
        model.addAttribute("pacientes", pacienteService.findAll());
        return "listPacientes";
    }
}
