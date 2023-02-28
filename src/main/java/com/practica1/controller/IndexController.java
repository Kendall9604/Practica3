
package com.practica1.controller;

import com.practica1.domain.Estado;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.practica1.service.EstadoService;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    EstadoService estadoService;

    @GetMapping("/")
    public String page(Model model) {
        log.info("Ahora utilizando MVC");
        var estados = estadoService.getEstados();
        model.addAttribute("estados", estados);
        return "index";
    }

    @GetMapping("/nuevoEstado")
    public String nuevoEstado(Estado estado) {
        return "modificarEstado";  // retorna nombre del  html
    }

    @PostMapping("/guardarEstado")
    public String guardarEstado(Estado estado) {
        estadoService.save(estado);
        return "redirect:/";
    }

    @GetMapping("/modificarEstado/{idEstado}")
    public String modificarEstado(Estado estado, Model model) {
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificarEstado";
    }

    @GetMapping("/eliminarEstado/{idEstado}")
    public String eliminarEstado(Estado estado) {
        estadoService.delete(estado);
        return "redirect:/";
    }

}
