package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.controladores.MedicosController;
import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioMedico;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServicioMedicoImplTest {

    private ServicioConsultas servicioConsultas;
    private ServicioMedico servicioMedico;
    private MedicosController medicosController;
    private ModelAndView mav;

    private Medico medico;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        servicioMedico = mock(ServicioMedico.class);
        medicosController = new MedicosController(servicioMedico);
    }

    @Test
    public void queSePuedaCrearUnMedico() {
        Medico medico = giveCreoUnMedico("alan", "arqueologo", 1L);
        Long id = whenGuardoUnMedico(medico);
        thenEstaElMedico(id);
    }

    private void thenEstaElMedico(Long id) {
        assertThat(mav.getViewName()).isEqualTo("redirect:/medicos");
        assertThat(servicioMedico.traerPorId(id));
        assertThat(mav.getModel().get("resultado")).isEqualTo("medico creado exitosamente");
    }

    private Long whenGuardoUnMedico(Medico medicoCreado) {
        Long aux = null;
        mav = medicosController.crearMedico(medicoCreado);
        servicioMedico.guardarMedico(medicoCreado);
        aux = medicoCreado.getId();
        return aux;
    }

    private Medico giveCreoUnMedico(String nombre, String especialidad, Long id) {
        Medico medicoCreado = new Medico();
        medicoCreado.setNombre(nombre);
        medicoCreado.setId(id);
        medicoCreado.setEspecialidad(especialidad);
        return medicoCreado;
    }
}