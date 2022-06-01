package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.ObraSociales;

import java.util.List;

public interface RepositorioObraSocial {

    List<ObraSociales> getObraSociales();

    void saveObraSocial(ObraSociales obrasocial);

    ObraSociales buscarPor(Long id);
}
