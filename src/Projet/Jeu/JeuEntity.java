package Projet.Jeu;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "JEU", schema = "Jeux", catalog = "")
public class JeuEntity {
    private int idJeu;
    private String nomJeu;
    private String genre;
    private Integer prix;
    private Date dateSortie;

    @Id
    @Column(name = "ID_JEU")
    public int getIdJeu() {
        return idJeu;
    }

    public void setIdJeu(int idJeu) {
        this.idJeu = idJeu;
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
    @Column(name = "GENRE")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Basic
    @Column(name = "PRIX")
    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    @Basic
    @Column(name = "DATE_SORTIE")
    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JeuEntity jeuEntity = (JeuEntity) o;
        return idJeu == jeuEntity.idJeu &&
                Objects.equals(nomJeu, jeuEntity.nomJeu) &&
                Objects.equals(genre, jeuEntity.genre) &&
                Objects.equals(prix, jeuEntity.prix) &&
                Objects.equals(dateSortie, jeuEntity.dateSortie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJeu, nomJeu, genre, prix, dateSortie);
    }
}
