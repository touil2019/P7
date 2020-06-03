package com.ocr.livre.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livre {

    @Id
    @GeneratedValue
    private int id;

    private String auteurName;

    private String auteurPrenom ;

    private String titre ;

    private String edition ;

    private String image;
    private boolean Present;


    public Livre() {
    }

    public Livre(int id, String auteurName, String auteurPrenom, String titre, String edition, String image) {
        this.id = id;
        this.auteurName = auteurName;
        this.auteurPrenom = auteurPrenom;
        this.titre = titre;
        this.edition = edition;
        this.image = image;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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



    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", auteurName='" + auteurName + '\'' +
                ", auteurPrenom='" + auteurPrenom + '\'' +
                ", titre='" + titre + '\'' +
                ", edition='" + edition + '\'' +
                ", image='" + image + '\'' +
                '}';
    }


    public boolean isPresent() {
        return Present;
    }
}

