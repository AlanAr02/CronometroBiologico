package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Medico;
import ar.edu.unlam.tallerweb1.modelo.ObraSociales;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repositorioMedico")
public class RepositorioMedicoImp implements RepositorioMedico{

    private SessionFactory sessionFactory;

    @Autowired //inyecta un objeto que implementa la interface sessionFactory
    public RepositorioMedicoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Medico> getMedicos() {
        final Session session = sessionFactory.getCurrentSession();
        return (List<Medico>) session.createCriteria(Medico.class)
                .list();
    }

    @Override
    public void guardar(Medico medico) {
        sessionFactory.getCurrentSession().save(medico);
    }

    @Override
    public Medico buscarPorId(Long id) {
        final Session session = sessionFactory.getCurrentSession();
        return (Medico) session.createCriteria(Medico.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }
}
