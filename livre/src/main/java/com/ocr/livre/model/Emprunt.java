package com.ocr.livre.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "emprunt")
public class Emprunt {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateemprunt;
    private Date dateretour;
    private boolean prolongee;
    private Long id_utilisateur;
    private boolean cloturee;


    @ManyToOne
    @JoinColumn(name = "ID_LIVRE")
    private Livre livre;

    public Emprunt() {
        super();

    }

    public Emprunt(Date dateemprunt, Date dateretour, Long id_utilisateur, Livre livre) {
        this.dateemprunt = dateemprunt;
        this.dateretour = dateretour;
        this.id_utilisateur=id_utilisateur;
        this.livre =livre;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getDateemprunt() {
        return dateemprunt;
    }
    public void setDateemprunt(Date dateemprunt) {
        this.dateemprunt = dateemprunt;
    }

    public Date getDateretour() {
        return dateretour;
    }

    public void setDateretour(Date dateretour) {
        this.dateretour = dateretour;
    }

    public boolean isProlongee() {
        return prolongee;
    }

    public void setProlongee(boolean prolongee) {
        this.prolongee = prolongee;
    }

    public Long getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(Long id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public boolean isCloturee() {
        return cloturee;
    }

    public void setCloturee(boolean cloturee) {
        this.cloturee = cloturee;
    }

   public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }
}