package org.example.controller;

import org.example.model.PratoNode;
import org.example.view.DialogPanel;

public class Gourmet {
    private static PratoNode node;
    private static DialogPanel panel;

    public Gourmet() {
        this.node = new PratoNode("massa", new PratoNode("Lasanha"), new PratoNode("Bolo de Chocolate"));
        panel = new DialogPanel();
    }

    public static void iniciar() {
        Gourmet gourmet = new Gourmet();
        while(true) {
            panel.inicia();
            while(!node.isLeaf()) {
                if(0 == panel.pratoPensou(node.getNome())) {
                    node = node.getPratoLeft();
                }else {
                    node = node.getPratoRight();
                }
            }

            if(0 == panel.pratoPensou(node.getNome())) {
                panel.acertei();
            }else {
                String novoPrato = panel.adicionar();
                node.setPratoRight(node);
                node.setPratoLeft(new PratoNode(novoPrato));
                node.setNome(panel.adicionarComplete(novoPrato, node));
            }
        }

    }

}
