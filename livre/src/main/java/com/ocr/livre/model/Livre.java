package com.ocr.livre.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "livre")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_livre")
    private long id;

    private String auteurName;

    private String auteurPrenom ;

    private String titre ;

    private String edition ;

    private String image;

    private int quantiteDispo ;


    private boolean Present;


   @OneToMany(mappedBy="livre", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   private Set<Emprunt> emprunt;


    public Livre() {
    }

    public Livre(String auteurName, String auteurPrenom, String titre, String edition, String image, int quantiteDispo) {

        this.auteurName = auteurName;
        this.auteurPrenom = auteurPrenom;
        this.titre = titre;
        this.edition = edition;
        this.quantiteDispo = quantiteDispo;
        this.image = image;
        this.emprunt = emprunt;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPresent(boolean present) {
        Present = present;
    }

    public String getAuteurName() {
        return auteurName;
    }

    public void setAuteurName(String auteurName) {
        this.auteurName = auteurName;
    }

    public String getAuteurPrenom() {
        return auteurPrenom;
    }

    public void setAuteurPrenom(String auteurPrenom) {
        this.auteurPrenom = auteurPrenom;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<Emprunt> getEmprunt() {
        return emprunt;
    }

    public void setEmprunt(Set<Emprunt> emprunt) {
        this.emprunt = emprunt;
    }

    public int getQuantiteDispo() {
        return quantiteDispo;
    }

    public void setQuantiteDispo(int quantiteDispo) {
        this.quantiteDispo = quantiteDispo;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", auteurName='" + auteurName + '\'' +
                ", auteurPrenom='" + auteurPrenom + '\'' +
                ", titre='" + titre + '\'' +
                ", edition='" + edition + '\'' +
                ", image='" + image + '\'' +
                ", quantiteDispo='" + quantiteDispo + '\''+
                ", emprunt='" + emprunt + '\''+
                '}';
    }


    public boolean isPresent() {
        return Present;
    }
}

