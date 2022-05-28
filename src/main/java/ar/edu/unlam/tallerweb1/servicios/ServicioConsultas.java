package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Consultas;
import ar.edu.unlam.tallerweb1.modelo.Medico;

import java.util.List;

public interface ServicioConsultas {

    List<Consultas> traerConsultas();
    List<Medico> traerMedicos();
}
