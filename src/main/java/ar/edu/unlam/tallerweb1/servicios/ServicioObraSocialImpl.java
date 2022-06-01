package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.ObraSocial;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioObraSocial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ServicioObraSocial")
@Transactional
public class ServicioObraSocialImpl implements ServicioObraSocial {



    private RepositorioObraSocial repoObraSocial;

    @Autowired
    public ServicioObraSocialImpl(RepositorioObraSocial repoObraSocial) {
        this.repoObraSocial = repoObraSocial;
    }

    @Override
    public void saveObraSocial(ObraSocial creada) {
        repoObraSocial.saveObraSocial(creada);
    }

    @Override
    public ObraSocial buscarPor(Long id) {
        return repoObraSocial.buscarPor(id);
    }

    @Override
    public List<ObraSocial> listarTodas() {
        return repoObraSocial.buscarTodas();
    }

}
