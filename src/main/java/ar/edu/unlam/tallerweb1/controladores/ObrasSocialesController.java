package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.ObraSocial;
import ar.edu.unlam.tallerweb1.servicios.CampoVacioException;
import ar.edu.unlam.tallerweb1.servicios.ServicioObraSocial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ObrasSocialesController {

    private ServicioObraSocial servicioObraSocial;

    @Autowired
    public ObrasSocialesController(ServicioObraSocial servicioObraSocial) {
        this.servicioObraSocial = servicioObraSocial;
    }


    @RequestMapping(path = "/obras-sociales", method = RequestMethod.GET)
    public ModelAndView irAObrasSociales() {
        ModelMap model = new ModelMap();
        List<ObraSocial> obrasocial = servicioObraSocial.listarTodas();
        model.put("obrasociales", obrasocial);
        return new ModelAndView("obras-sociales", model);
    }
    @RequestMapping(path = "/nueva-obrasocial", method = RequestMethod.GET)
    public ModelAndView irANuevaObraSocial() {
        return new ModelAndView("nueva-obrasocial");
    }

    @RequestMapping(path = "/crear-obrasocial", method = RequestMethod.POST)
    public ModelAndView crearObraSocial(@ModelAttribute("obrassociales") String nombreObraSocial) {
        ModelMap model = new ModelMap();
        try{
            servicioObraSocial.saveObraSocial(nombreObraSocial);
        }catch (CampoVacioException e) {
            model.put("error", "Para crear la Obra Social debe indicar su nombre");
            return new ModelAndView("redirect:/nueva-obrasocial", model);
        }
        model.put("resultado", "la obra social fue creada correctamente");
    return new ModelAndView("redirect:/obras-sociales", model);
    }

    private boolean elNombreEstaVacio(ObraSocial creada) {
        return creada.getNombre() == null || creada.getNombre().isEmpty() || creada.getNombre().isBlank();
    }

   /* @RequestMapping(path = "/crear-obrasocial", method = RequestMethod.POST)
    public ModelAndView crearObraSocial(@ModelAttribute("obrassociales") ObraSociales obrasocial) {
        servicioConsultas.saveObraSocial(obrasocial);
        return new ModelAndView("redirect:/obras-sociales");
    }*/



}
