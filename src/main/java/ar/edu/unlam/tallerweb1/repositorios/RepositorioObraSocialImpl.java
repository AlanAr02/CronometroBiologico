package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.ObraSociales;
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
    public List<ObraSociales> getObraSociales()  {
        final Session session = sessionFactory.getCurrentSession();
        return (List<ObraSociales>) session.createCriteria(ObraSociales.class)
                .list();
    }

    @Override
    public ObraSociales buscarPor(Long id) {
        return sessionFactory.getCurrentSession().get(ObraSociales.class, id);
    }

    @Override
    public void saveObraSocial(ObraSociales obrasocial){
            final Session session = sessionFactory.getCurrentSession();
            session.save(obrasocial);
        }
    }

