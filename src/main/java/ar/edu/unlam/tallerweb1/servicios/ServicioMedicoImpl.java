package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("servicioMedico")
@Transactional
public class ServicioMedicoImpl implements ServicioMedico{

    private RepositorioMedico repoMedico;

    @Autowired
    public ServicioMedicoImpl(RepositorioMedico repoMedico) {
        this.repoMedico = repoMedico;
    }

    @Override
    public List<Medico> traerMedicos() {
        return repoMedico.getMedicos();
    }

    @Override
    public void guardarMedico(Medico medico) {
        repoMedico.guardar(medico);
    }

    @Override
    public Medico traerPorId(Long id) {
        return repoMedico.buscarPorId(id);
    }
}
