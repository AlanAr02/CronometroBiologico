package ar.edu.unlam.tallerweb1.repositorios;
import ar.edu.unlam.tallerweb1.modelo.Consultas;
import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.modelo.ObraSocial;

import java.util.List;

public interface RepositorioConsulta {
    List<Consultas> getConsultas();
    List<Medico> getMedicos();
    List<ObraSocial> getObraSociales();

    void save(Consultas consulta);
    void saveMedico(Medico medico);

    void saveObraSocial(ObraSocial obrasocial);
}
