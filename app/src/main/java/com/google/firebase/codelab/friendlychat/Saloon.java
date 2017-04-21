package com.google.firebase.codelab.friendlychat;

/**
 * Created by nesab on 20/04/2017.
 */


public class Saloon {
    private int color;
    private String pseudo;
    private String text;

    public Saloon(int color, String pseudo, String text) {
        this.color = color;
        this.pseudo = pseudo;
        this.text = text;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
