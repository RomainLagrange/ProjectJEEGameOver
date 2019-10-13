package Projet.Editeur;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "EDITEUR", schema = "Jeux", catalog = "")
public class EditeurEntity {
    private int idEditeur;
    private String nomJeu;
    private String pays;
    private Integer nbEmployees;

    @Id
    @Column(name = "ID_EDITEUR")
    public int getIdEditeur() {
        return idEditeur;
    }

    public void setIdEditeur(int idEditeur) {
        this.idEditeur = idEditeur;
    }

    @Basic
    @Column(name = "NOM_JEU")
    public String getNomJeu() {
        return nomJeu;
    }

    public void setNomJeu(String nomJeu) {
        this.nomJeu = nomJeu;
    }

    @Basic
    @Column(name = "PAYS")
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Basic
    @Column(name = "NB_EMPLOYEES")
    public Integer getNbEmployees() {
        return nbEmployees;
    }

    public void setNbEmployees(Integer nbEmployees) {
        this.nbEmployees = nbEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditeurEntity that = (EditeurEntity) o;
        return idEditeur == that.idEditeur &&
                Objects.equals(nomJeu, that.nomJeu) &&
                Objects.equals(pays, that.pays) &&
                Objects.equals(nbEmployees, that.nbEmployees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEditeur, nomJeu, pays, nbEmployees);
    }

    @Override
    public String toString() {
        return String.valueOf(idEditeur);
    }
}
