package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Consultas;
import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.modelo.ObraSocial;

import java.util.List;

public interface ServicioConsultas {

    List<Consultas> traerConsultas();
    List<Medico> traerMedicos();

    List<ObraSocial> traerObrasSociales();

    void saveConsulta(Consultas consulta);

    void saveMedico(Medico medico);

    void saveObraSocial(ObraSocial obrasocial);
}
