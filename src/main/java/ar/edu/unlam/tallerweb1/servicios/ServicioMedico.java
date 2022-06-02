package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Medico;

import java.util.List;

public interface ServicioMedico {
    List<Medico> traerMedicos();
    void guardarMedico(Medico medico);
    Medico traerPorId(Long id);
}
