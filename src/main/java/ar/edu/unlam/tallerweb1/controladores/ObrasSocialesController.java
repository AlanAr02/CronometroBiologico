package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.ObraSociales;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsultas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ObrasSocialesController {

    private ServicioConsultas servicioConsultas;

    @Autowired
    public ObrasSocialesController(ServicioConsultas servicioConsultas) {
        this.servicioConsultas = servicioConsultas;
    }


    @RequestMapping(path = "/nueva-obrasocial", method = RequestMethod.GET)
    public ModelAndView irANuevaObraSocial() {
        return new ModelAndView("nueva-obrasocial");
    }

    @RequestMapping(path = "/crear-obrasocial", method = RequestMethod.POST)
    public ModelAndView crearObraSocial(@ModelAttribute("obrassociales") ObraSociales creada) {
        ModelMap model = new ModelMap();
        if(creada.getNombre()!=null){

        model.put("resultado", "la obra social fue creada correctamente");}
    return new ModelAndView("obras-sociales", model);
    }

   /* @RequestMapping(path = "/crear-obrasocial", method = RequestMethod.POST)
    public ModelAndView crearObraSocial(@ModelAttribute("obrassociales") ObraSociales obrasocial) {
        servicioConsultas.saveObraSocial(obrasocial);
        return new ModelAndView("redirect:/obras-sociales");
    }*/



}
