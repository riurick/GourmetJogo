package org.example.view;

import org.example.model.PratoNode;

import javax.swing.*;

public class DialogPanel {

    public void inicia() {
        JOptionPane.showMessageDialog(null, "Pense em um prato que gosta");
    }

    public int pratoPensou(String nome) {
        return JOptionPane.showConfirmDialog(null, "O prato que voce pensou é " + nome,
                "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    public void acertei() {
        JOptionPane.showMessageDialog(null, "Acertei de novo!");
    }

    public String adicionar() {
        return JOptionPane.showInputDialog(null, "Qual prato voce pensou?");
    }

    public String adicionarComplete(String nome, PratoNode node) {
        return JOptionPane.showInputDialog(nome + "é ________ mas " + node.getNome() + " não.");
    }
}
