package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.Consultas;
import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.modelo.ObraSociales;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsultas;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsultasImp;
import ar.edu.unlam.tallerweb1.servicios.ServicioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MedicosController {

    private ServicioMedico servicioMedico;

    @Autowired
    public MedicosController(ServicioMedico servicioMedico) {
        this.servicioMedico = servicioMedico;
    }

    @RequestMapping(path = "/nuevo-medico", method = RequestMethod.GET)
    public ModelAndView irANuevoMedico() {
        return new ModelAndView("nuevo-medico");
    }

    @RequestMapping(path = "/crear-medico", method = RequestMethod.POST)
    public ModelAndView crearMedico(@ModelAttribute("medicos") Medico medico) {
        servicioMedico.guardarMedico(medico);
        ModelMap model = new ModelMap();
        if(medico.getNombre()!=null || medico.getNombre()!=""){
            model.put("resultado", "medico creado exitosamente");
        }
        return new ModelAndView("redirect:/medicos", model);
    }
}
