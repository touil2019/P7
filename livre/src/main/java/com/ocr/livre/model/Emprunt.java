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

    public boolean isEnCours;

    private boolean enCours;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_livre")
    private Livre livre;


    public Emprunt(String user, Date date, Date date1, boolean b, boolean b1, String livre) {
        super();
    }

    public Emprunt(Long idEmprunt, String pseudoEmprunteur, Date dateDebut, Date dateFin, boolean prolongeable, boolean enCours, Livre livre) {
        this.idEmprunt = idEmprunt;
        this.pseudoEmprunteur = pseudoEmprunteur;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prolongeable = prolongeable;
        this.enCours = enCours;
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

    public boolean isEnCours() {
        return isEnCours;
    }

    public boolean isEnCours(boolean b) {
        return enCours;
    }

    public void setEnCours(boolean enCours) {
        this.enCours = enCours;
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
                ", enCours=" + enCours +
                ", livre=" + livre +
                '}';

    }
}
