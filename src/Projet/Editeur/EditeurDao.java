package Projet.Editeur;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Objects;

@Stateless
public class EditeurDao {

    private EntityManager entityManager;

    protected EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManager = Persistence.createEntityManagerFactory(
                    "NewPersistenceUnit").createEntityManager();
        }
        return entityManager;
    }

    public List<EditeurEntity> getAllEditeur() {
        Query requete = getEntityManager().createQuery("select e from EditeurEntity e");
        return requete.getResultList();
    }

    public EditeurEntity insert(EditeurEntity u) {
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(u);
        getEntityManager().getTransaction().commit();
        return u;
    }

}
