/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP3.Parties.Planetes;

public class Planetes  {

    private String name;
    private int taille;

    public String getName() {
        return name;
    }

    public Planetes(String name, int taille) {
        this.name = name;
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setName(String name) {
        this.name = name;
    }
}
