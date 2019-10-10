package Projet.Jeu;

import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;

@Named
public class JeuView {

    @EJB
    private JeuDAO dao;

    public List<JeuEntity> getJeu() throws ClassNotFoundException {
        return dao.getAllJeu();
    }

}