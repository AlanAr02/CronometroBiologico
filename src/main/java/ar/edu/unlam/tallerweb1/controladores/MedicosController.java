package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsultas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MedicosController {

    private ServicioConsultas servicioConsultas;

    @Autowired
    public MedicosController(ServicioConsultas servicioConsultas) {
        this.servicioConsultas = servicioConsultas;
    }


    @RequestMapping(path = "/nuevo-medico", method = RequestMethod.GET)
    public ModelAndView irANuevoMedico() {
        return new ModelAndView("nuevo-medico");
    }

    @RequestMapping(path = "/crear-medico", method = RequestMethod.POST)
    public ModelAndView crearMedico(@ModelAttribute("medicos") Medico medico) {
        servicioConsultas.saveMedico(medico);
        return new ModelAndView("redirect:/medicos");
    }
}
