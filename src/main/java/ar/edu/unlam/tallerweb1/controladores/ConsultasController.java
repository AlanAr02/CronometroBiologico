package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Consultas;
import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.modelo.ObraSocial;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsultas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ConsultasController {

    private ServicioConsultas servicioConsultas;

    @Autowired
    public ConsultasController(ServicioConsultas servicioConsultas) {
        this.servicioConsultas = servicioConsultas;
    }


    @RequestMapping(path = "/nueva-consulta", method = RequestMethod.GET)
    public ModelAndView irANuevaConsulta() {
        ModelMap model = new ModelMap();
        List<Medico> medicos = servicioConsultas.traerMedicos();
        List<ObraSocial> obrasociales = servicioConsultas.traerObrasSociales();
        model.put("obrasociales", obrasociales);
        model.put("medicos", medicos);
        return new ModelAndView("nueva-consulta", model);
    }

    @RequestMapping(path = "/crear-consulta", method = RequestMethod.POST)
    public ModelAndView crearConsulta(@ModelAttribute("consultas") Consultas consulta) {
        servicioConsultas.saveConsulta(consulta);
        return new ModelAndView("redirect:/home");
    }
}
