package dci.ufro.cl.fifa.controller;

import dci.ufro.cl.fifa.model.ListaJugador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class templatesController {

    @RequestMapping("/")
    public String getindex(Model model){

        model.addAttribute("jugadores", ListaJugador.getListaJugadores());

        return "index";
        //para lanzar una pagina se agrega la pagina en templates y se escribe la direccion donde enviarla
    }
}
