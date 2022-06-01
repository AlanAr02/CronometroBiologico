package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.ObraSocial;

import java.util.List;

public interface RepositorioObraSocial {

    List<ObraSocial> getObraSociales();

    void saveObraSocial(ObraSocial obrasocial);

    ObraSocial buscarPor(Long id);

    List<ObraSocial> buscarTodas();
}
