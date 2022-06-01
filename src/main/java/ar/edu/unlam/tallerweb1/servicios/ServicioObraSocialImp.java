package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.ObraSociales;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioObraSocial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ServicioObraSocial")
@Transactional
public class ServicioObraSocialImp implements ServicioObraSocial {



    private RepositorioObraSocial repoObraSocial;

    @Autowired
    public ServicioObraSocialImp(RepositorioObraSocial repoObraSocial) {
        this.repoObraSocial = repoObraSocial;
    }

    @Override
    public void saveObraSocial(ObraSociales creada) {
        repoObraSocial.saveObraSocial(creada);
    }

    @Override
    public ObraSociales buscarPor(Long id) {
        return repoObraSocial.buscarPor(id);
    }

}
