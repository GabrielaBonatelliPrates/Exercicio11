package com.mycompany.exercicio11;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio11 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if ((n1 % 2) == 0) {
            JOptionPane.showMessageDialog(null, "É múltiplo de 2");
        } else {
            JOptionPane.showMessageDialog(null, "Não é múltiplo de 2");
        }
    }

}
