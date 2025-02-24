package org.example;

import java.util.List;

public class Auteur {
    private int id;
    private String nom;
    private String prenom;
    private List<Article[]> articles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    protected Article addArticle(int id, String title, String description , String status) {
        Article article = new Article();
        article.setId(id);
        article.setTitle(title);
        article.setDescription(description);
        article.setStatus(status);
        return article;
    }
}
