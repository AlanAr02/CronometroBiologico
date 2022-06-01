package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.ObraSocial;

import java.util.List;

public interface ServicioObraSocial {


    ObraSocial saveObraSocial(String nombre);


   ObraSocial buscarPor(Long id);

   List<ObraSocial> listarTodas();
}
