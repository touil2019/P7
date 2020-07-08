package com.ocr.livre.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Emprunt implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmprunt;


    private String pseudoEmprunteur;


    private Date dateDebut;


    private Date dateFin;


    private boolean prolongeable;


    private boolean cloturer;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_livre")
    private Livre livre;


    public Emprunt() {


        super();
    }

    public Emprunt(String pseudoEmprunteur, Date dateDebut,  boolean prolongeable, boolean cloturer, Livre livre) {
        this.pseudoEmprunteur = pseudoEmprunteur;
        this.dateDebut = dateDebut;

        this.prolongeable = prolongeable;
        this.cloturer = cloturer;
        this.livre = livre;
    }

    public Long getIdEmprunt() {
        return idEmprunt;
    }

    public void setIdEmprunt(Long idEmprunt) {
        this.idEmprunt = idEmprunt;
    }

    public String getPseudoEmprunteur() {
        return pseudoEmprunteur;
    }

    public void setPseudoEmprunteur(String pseudoEmprunteur) {
        this.pseudoEmprunteur = pseudoEmprunteur;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public boolean isProlongeable() {
        return prolongeable;
    }

    public void setProlongeable(boolean prolongeable) {
        this.prolongeable = prolongeable;
    }

    public boolean isCloturer() {
        return cloturer;
    }

    public void setCloturer(boolean enCours) {
        this.cloturer = enCours;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "idEmprunt=" + idEmprunt +
                ", Emprunteur='" + pseudoEmprunteur + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", prolongeable=" + prolongeable +
                ", enCours=" + cloturer +
                ", livre=" + livre +
                '}';

    }
}
