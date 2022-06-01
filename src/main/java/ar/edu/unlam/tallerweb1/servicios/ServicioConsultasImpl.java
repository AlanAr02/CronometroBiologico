package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Consultas;
import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.modelo.ObraSocial;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("servicioConsultas")
@Transactional
public class ServicioConsultasImpl implements ServicioConsultas {
    //ESTO INYECTA UN OBJETO "REPOSITORIO CONSULTA" Y POR ENDE TRAE CON SIGO SUS RESPECTIVOS METODOS, VOY A PODER USAR TODOS LOS METODOS QUE HAYAN EN EL REPO

    private RepositorioConsulta repoConsulta;

    @Autowired
    public ServicioConsultasImpl(RepositorioConsulta repoConsulta) {
        this.repoConsulta = repoConsulta;
    }

    @Override
    public List<Consultas> traerConsultas() {
        return repoConsulta.getConsultas();
    }

    @Override
    public List<Medico> traerMedicos() {
        return repoConsulta.getMedicos();
    }

    @Override
    public List<ObraSocial> traerObrasSociales() {
        return repoConsulta.getObraSociales();
    }

    @Override
    public void saveConsulta(Consultas consulta) {
        repoConsulta.save(consulta);
    }

    @Override
    public void saveMedico(Medico medico) {
        repoConsulta.saveMedico(medico);
    }

    @Override
    public void saveObraSocial(ObraSocial obrasocial) {
        repoConsulta.saveObraSocial(obrasocial);
    }

}
