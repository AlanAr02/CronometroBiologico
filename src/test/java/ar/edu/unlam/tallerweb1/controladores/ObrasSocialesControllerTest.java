package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.modelo.ObraSociales;
import ar.edu.unlam.tallerweb1.servicios.ServicioConsultas;
import ar.edu.unlam.tallerweb1.servicios.ServicioObraSocial;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class ObrasSocialesControllerTest {

    private ServicioConsultas servicioConsultas;
    private ServicioObraSocial servicioObraSocial;
    private ObrasSocialesController obrasSocialesController;
    private ModelAndView mav;

    @Before
    public void init(){
        servicioObraSocial = mock(ServicioObraSocial.class);
        obrasSocialesController = new ObrasSocialesController(servicioConsultas);
    }

    @Test
    public void asdasdsa (){

    }

    @Test
    public void queSePuedaCrearUnaObraSocial(){
        ObraSociales creada= givenCreoUnaObraSocial("pepito");
        Long id = whenGuardoUnaObraSocial(creada);
        thenEstaLaObraSocial(id);
    }

    private void thenEstaLaObraSocial(Long id) {
        assertThat(mav.getViewName()).isEqualTo("obras-sociales");
        assertThat(servicioObraSocial.buscarPor(id));
    assertThat(mav.getModel().get("resultado")).isEqualTo("la obra social fue creada correctamente");
    }

    private Long whenGuardoUnaObraSocial(ObraSociales creada) {
       Long aux=null;
        if(creada.getNombre()!=null){
        mav = obrasSocialesController.crearObraSocial(creada);
       servicioObraSocial.saveObraSocial(creada);
       aux = creada.getId();}
        return aux;
    }

    private ObraSociales givenCreoUnaObraSocial(String nombre) {
        ObraSociales creada= new ObraSociales();
        creada.setNombre(nombre);
        return creada;
    }




}


