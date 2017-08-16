package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Janela extends JFrame {

    private final JLabel etiqueta1 ;
    private final JLabel etiqueta2 ;
    private final JTextField resultado;

    public Janela() throws HeadlessException {
        super("Inverte");

    }
}
