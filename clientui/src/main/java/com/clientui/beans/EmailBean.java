package com.clientui.beans;

public class EmailBean {

    private Long idMail ;

    private String nom_Utilisateur;

    private String objet ;

    private String contenu ;

    public void Email() {
    }

    public void Email(Long idMail, String nom_Utilisateur, String objet, String contenu) {
        this.idMail = idMail;
        this.nom_Utilisateur = nom_Utilisateur;
        this.objet = objet;
        this.contenu = contenu;
    }

    public Long getIdMail() {
        return idMail;
    }

    public void setIdMail(Long idMail) {
        this.idMail = idMail;
    }


    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "email{" +
                "idMail=" + idMail +
                ", nom_Utilisateur='" + nom_Utilisateur + '\'' +
                ", objet='" + objet + '\'' +
                ", contenu='" + contenu + '\'' +
                '}';
    }
}
