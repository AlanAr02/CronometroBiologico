package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Consultas;
import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.modelo.ObraSociales;

import java.util.List;

public interface ServicioConsultas {

    List<Consultas> traerConsultas();
    List<Medico> traerMedicos();

    List<ObraSociales> traerObrasSociales();

    void saveConsulta(Consultas consulta);
}
