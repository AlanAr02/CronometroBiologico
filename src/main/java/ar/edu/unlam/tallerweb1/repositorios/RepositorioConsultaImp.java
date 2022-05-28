package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Consultas;
import ar.edu.unlam.tallerweb1.modelo.Medico;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repositorioConsultas")
public class RepositorioConsultaImp implements RepositorioConsulta {
    private SessionFactory sessionFactory;


    @Autowired
    public RepositorioConsultaImp(SessionFactory sessionFactory){ //crea objeto session factory en el repo consulta :D CON ESTO ME CONECTO A LA BDD
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Consultas> getConsultas() {
        final Session session = sessionFactory.getCurrentSession();
        return (List<Consultas>) session.createCriteria(Consultas.class)
                .list(); // AGARRA LA BDD Y TRAE LA LISTA DE CONSULTAS. LAS Q ESTEN EN LA BDD
    }

    @Override
    public List<Medico> getMedicos() {
        final Session session = sessionFactory.getCurrentSession();
        return (List<Medico>) session.createCriteria(Medico.class)
                .list();
    }
}
