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

    public List<JeuEntity> getAllJeu() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        EntityManagerFactory f = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = f.createEntityManager();
        Query requete = em.createQuery("select j from JeuEntity j");
        return requete.getResultList();
    }
}
