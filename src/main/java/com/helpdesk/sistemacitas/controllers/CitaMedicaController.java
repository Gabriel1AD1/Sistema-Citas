package com.helpdesk.sistemacitas.controllers;

import com.helpdesk.sistemacitas.models.CitaMedica;
import com.helpdesk.sistemacitas.services.CitaMedicaService;
import com.helpdesk.sistemacitas.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CitaMedicaController {
    @Autowired
    private CitaMedicaService citaMedicaService;

    @Autowired
    private PacienteService pacienteService;
    @GetMapping("/registrarCita")
    public String showForm(Model model) {
        model.addAttribute("citaMedica", new CitaMedica());
        model.addAttribute("pacientes", pacienteService.findAll());
        return "registrarCita";
    }

    @PostMapping("/registrarCita")
    public String submitForm(@ModelAttribute CitaMedica citaMedica) {
        citaMedicaService.registrarCita(citaMedica);
        return "redirect:/citas";
    }

    @GetMapping("/citas")
    public String listCitas(Model model) {
        model.addAttribute("citas", citaMedicaService.findAll());
        return "listCitas";
    }
}