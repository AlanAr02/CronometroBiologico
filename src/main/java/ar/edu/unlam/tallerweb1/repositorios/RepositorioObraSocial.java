package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.ObraSocial;

import java.util.List;

public interface RepositorioObraSocial {

    List<ObraSocial> getObraSociales();

    Long saveObraSocial(ObraSocial nombre);

    ObraSocial buscarPor(Long id);

    List<ObraSocial> buscarTodas();
}
