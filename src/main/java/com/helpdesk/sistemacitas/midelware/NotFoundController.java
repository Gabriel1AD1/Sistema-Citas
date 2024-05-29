package com.helpdesk.sistemacitas.midelware;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotFoundController {

    @GetMapping("/**") // Captura todas las rutas que no están mapeadas
    public String handleNotFound() {
        return "error/404"; // Puedes personalizar la vista de error según tus necesidades
    }
    @GetMapping("/") // Captura todas las rutas que no están mapeadas
    public String index() {
        return "index"; // Puedes personalizar la vista de error según tus necesidades
    }
}