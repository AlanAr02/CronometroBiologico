package ar.edu.unlam.tallerweb1.controladores;
import ar.edu.unlam.tallerweb1.modelo.Consultas;
import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsultas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    private ServicioConsultas servicioConsultas;

    @Autowired
    public HomeController(ServicioConsultas servicioConsultas) {
        this.servicioConsultas = servicioConsultas;
    }

    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public ModelAndView irAHome() {
        ModelMap model = new ModelMap();
        List<Consultas> consultas = servicioConsultas.traerConsultas();
        model.put("consultas", consultas);

        return new ModelAndView("home", model);
    }

    @RequestMapping(path = "/nueva-consulta", method = RequestMethod.GET)
    public ModelAndView irANuevaConsulta() {
        ModelMap model = new ModelMap();
        List<Medico> medicos = servicioConsultas.traerMedicos();
        model.put("medicos", medicos);
        return new ModelAndView("nueva-consulta", model);
    }
}
