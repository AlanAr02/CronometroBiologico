package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.ObraSociales;

public interface ServicioObraSocial {


    void saveObraSocial(ObraSociales creada);


   ObraSociales buscarPor(Long id);
}
