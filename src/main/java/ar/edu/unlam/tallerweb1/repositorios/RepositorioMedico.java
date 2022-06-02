package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Medico;

import java.util.List;

public interface RepositorioMedico {
    List<Medico> getMedicos();
    void guardar(Medico medico);
    Medico buscarPorId(Long id);
}
