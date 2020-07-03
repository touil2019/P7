package com.ocr.livre.beans;

public class UtilisateurBean {

    private Long id_Utilisateur ;
    private String username;
    private String email;
    private String password;


    public UtilisateurBean(){
        super();
    }

    public UtilisateurBean(Long id_Utilisateur, String username, String password, String email) {
        this.id_Utilisateur = id_Utilisateur;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Long getId_Utilisateur() {
        return id_Utilisateur;
    }

    public void setId_Utilisateur(Long id_Utilisateur) {
        this.id_Utilisateur = id_Utilisateur;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Utilisateur{" +
                "idUtilisateur=" + id_Utilisateur +
                ", username='" + username + '\'' +
                ", email='" + email + '\''+
                ", password='" + password + '\'' +
                '}';
    }
}
