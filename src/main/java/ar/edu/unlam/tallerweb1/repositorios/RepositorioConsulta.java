package ar.edu.unlam.tallerweb1.repositorios;
import ar.edu.unlam.tallerweb1.modelo.Consultas;
import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.modelo.ObraSociales;

import java.util.List;

public interface RepositorioConsulta {
    List<Consultas> getConsultas();
    List<Medico> getMedicos();
    List<ObraSociales> getObraSociales();

    void save(Consultas consulta);
}
