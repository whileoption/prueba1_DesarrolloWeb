package com.prueba1.controller;

import com.prueba1.entity.Artista;
import com.prueba1.entity.Evento;
import com.prueba1.service.IArtistaService;
import com.prueba1.service.IEventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Karina Madrigal
 */

@Controller
public class EventoController {
    
    @Autowired
    private IEventoService eventoService;
    
    @Autowired
    private IArtistaService artistaService;
    
    //Metodo que genera una tabla y carga los datos del DB
    @GetMapping("/evento")
    public String index(Model model) {
        List<Evento> listaEvento = eventoService.getAllEvento();
        model.addAttribute("titulo", "Tabla Eventos");
        model.addAttribute("eventos", listaEvento);
        return "eventos";
    }
    
    //Metodo que actualiza los datos del DB y tabla existente
    @GetMapping("/eventoN")
    public String crearEvento(Model model) {
        List<Artista> listaArtista = artistaService.listArtista();
        model.addAttribute("evento", new Evento());
        model.addAttribute("artistas", listaArtista);
        return "crear";
    }
    
    //Metodo que genera una tabla y carga los datos del DB
    @PostMapping("/save")
    public String guardarEvento(@ModelAttribute Evento evento) {
        eventoService.saveEvento(evento);
        return "redirect:/evento";
    }
    
    //Metodo que edita en la tabla y en el DB
    @GetMapping("/editEvento/{id}")
    public String editarEvento(@PathVariable("id") Long idEvento, Model model) {
        Evento evento = eventoService.getEventoById(idEvento);
        List<Artista> listaArtista = artistaService.listArtista();
        model.addAttribute("evento", evento);
        model.addAttribute("artistas", listaArtista);
        return "crear";
    }
    
    //Metodo que elimina en la tabla y en el DB
    @GetMapping("/delete/{id}")
    public String eliminarEvento(@PathVariable("id") Long idEvento) {
        eventoService.delete(idEvento);
        return "redirect:/evento";
    }

}
