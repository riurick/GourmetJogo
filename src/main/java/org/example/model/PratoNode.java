package org.example.model;




public class PratoNode {

    private String nome;

    private PratoNode pratoLeft;

    private PratoNode pratoRight;

    public PratoNode(String nome, PratoNode pratoLeft, PratoNode pratoRight) {
        this.nome = nome;
        this.pratoLeft = pratoLeft;
        this.pratoRight = pratoRight;
    }

    public PratoNode(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PratoNode getPratoLeft() {
        return pratoLeft;
    }

    public void setPratoLeft(PratoNode pratoLeft) {
        this.pratoLeft = pratoLeft;
    }

    public PratoNode getPratoRight() {
        return pratoRight;
    }

    public void setPratoRight(PratoNode pratoRight) {
        this.pratoRight = pratoRight;
    }

    public boolean isLeaf() {
        return getPratoLeft() == null && getPratoRight() == null;
    }
}
