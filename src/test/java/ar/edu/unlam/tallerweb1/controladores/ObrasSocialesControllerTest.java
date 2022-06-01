package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.ObraSocial;
import ar.edu.unlam.tallerweb1.servicios.CampoVacioException;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsultas;
import ar.edu.unlam.tallerweb1.servicios.ServicioObraSocial;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class ObrasSocialesControllerTest {

    private ServicioConsultas servicioConsultas;
    private ServicioObraSocial servicioObraSocial;
    private ObrasSocialesController obrasSocialesController;
    private ModelAndView mav;

    @Before
    public void init(){
        servicioObraSocial = mock(ServicioObraSocial.class);
        obrasSocialesController = new ObrasSocialesController(servicioObraSocial);
    }

    @Test
    public void siLaObraSocialTieneNombreSeGuardaConExito(){
        String nombre = givenCreoUnaObraSocial("pepito");
        ObraSocial obraSocial = whenGuardoUnaObraSocialConNombre(nombre);
        thenLaObraSocialSeCreaCorrectamente(obraSocial);
    }

    private void thenLaObraSocialSeCreaCorrectamente(ObraSocial OS) {
        assertThat(OS).isNotNull();
        assertThat(mav.getViewName()).isEqualTo("redirect:/obras-sociales");
        assertThat(mav.getModel().get("resultado")).isEqualTo("la obra social fue creada correctamente");
    }

    private ObraSocial whenGuardoUnaObraSocialConNombre(String nombre) {
            return servicioObraSocial.saveObraSocial(nombre);
    }

    private String givenCreoUnaObraSocial(String nombre) {
        return nombre;
    }

   @Test
    public void siLaObraSocialNoTieneNombreLaCreacionFalla(){
       String creadaVacio = givenCreoUnaObraSocial(" hola ");
       doThrow(CampoVacioException.class)
               .when(servicioObraSocial).saveObraSocial(creadaVacio);
       whenGuardoUnaObraSocialConNombre(creadaVacio);
       thenLaCreacionFalla();
   }

    private void thenLaCreacionFalla() {
        assertThat(mav.getViewName()).isEqualTo("redirect:/nueva-obrasocial");
        assertThat(mav.getModel().get("error")).isEqualTo("Para crear la Obra Social debe indicar su nombre");
    }


}


