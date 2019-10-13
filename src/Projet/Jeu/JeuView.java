package Projet.Jeu;

import Projet.Editeur.EditeurEntity;

import javax.ejb.EJB;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
public class JeuView implements Serializable {

    @EJB
    private JeuDAO dao;

    private List<JeuEntity> jeuList;
    private JeuEntity newJeu = new JeuEntity();
    private EditeurEntity edit = new EditeurEntity();

    public List<JeuEntity> getJeu() {
        if(jeuList==null){
            jeuList = dao.getAllJeu();
        }
        return jeuList;
    }

    public String addJeu() {
        newJeu.setEditeur(edit);
        dao.insert(newJeu);
        newJeu = new JeuEntity();
        jeuList = dao.getAllJeu();
        return null;
    }


    public JeuDAO getDao() {
        return dao;
    }

    public void setDao(JeuDAO dao) {
        this.dao = dao;
    }

    public List<JeuEntity> getJeuList() {
        return jeuList;
    }

    public void setJeuList(List<JeuEntity> jeuList) {
        this.jeuList = jeuList;
    }

    public JeuEntity getNewJeu() {
        return newJeu;
    }

    public void setNewJeu(JeuEntity newJeu) {
        this.newJeu = newJeu;
    }

    public EditeurEntity getEdit() {
        return edit;
    }

    public void setEdit(EditeurEntity edit) {
        this.edit = edit;
    }
}