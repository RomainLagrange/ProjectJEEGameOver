package Projet.Editeur;


import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;
import java.util.Map;

@Named
public class EditeurView {

    @EJB
    private EditeurDao dao;

    private List<EditeurEntity> editeurList;
    private EditeurEntity newEditeur = new EditeurEntity();

    public List<EditeurEntity> getEditeur() {
        if (editeurList == null) {
            editeurList = dao.getAllEditeur();
        }
        return editeurList;
    }

    public EditeurDao getDao() {
        return dao;
    }

    public void setDao(EditeurDao dao) {
        this.dao = dao;
    }

    public List<EditeurEntity> getEditeurList() {
        return editeurList;
    }

    public void setEditeurList(List<EditeurEntity> editeurList) {
        this.editeurList = editeurList;
    }

    public EditeurEntity getNewEditeur() {
        return newEditeur;
    }

    public void setNewEditeur(EditeurEntity newEditeur) {
        this.newEditeur = newEditeur;
    }

}

