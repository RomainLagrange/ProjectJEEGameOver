package Projet.Jeu;

import Projet.Jeu.JeuEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class JeuDAO {

    private EntityManager entityManager;

    protected EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManager = Persistence.createEntityManagerFactory(
                    "NewPersistenceUnit").createEntityManager();
        }
        return entityManager;
    }

    public List<JeuEntity> getAllJeu() {
        Query requete = getEntityManager().createQuery("select j from JeuEntity j");
        return requete.getResultList();
    }

    public JeuEntity insert(JeuEntity u) {
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(u);
        getEntityManager().getTransaction().commit();
        return u;
    }
}
