package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.ObraSocial;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("RepositorioObraSocial")
public class RepositorioObraSocialImpl implements RepositorioObraSocial{


    private SessionFactory sessionFactory;


    @Autowired
    public RepositorioObraSocialImpl(SessionFactory sessionFactory){ //crea objeto session factory en el repo consulta :D CON ESTO ME CONECTO A LA BDD
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<ObraSocial> getObraSociales()  {
        final Session session = sessionFactory.getCurrentSession();
        return (List<ObraSocial>) session.createCriteria(ObraSocial.class)
                .list();
    }

    @Override
    public ObraSocial buscarPor(Long id) {
        return sessionFactory.getCurrentSession().get(ObraSocial.class, id);
    }

    @Override
    public List<ObraSocial> buscarTodas() {
        return sessionFactory.getCurrentSession().createCriteria(ObraSocial.class).list();
    }

    @Override
    public void saveObraSocial(ObraSocial obrasocial){
            final Session session = sessionFactory.getCurrentSession();
            session.save(obrasocial);
        }
    }

