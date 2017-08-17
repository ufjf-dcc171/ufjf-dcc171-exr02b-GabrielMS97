package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Janela extends JFrame {

    private final JLabel etiqueta1;
    private final JLabel etiqueta2;
    private final JTextField resultado;
    private final JLabel saida;

    public Janela() throws HeadlessException {
        super("Inverter Texto");

        setLayout(new FlowLayout(FlowLayout.CENTER));
        etiqueta1 = new JLabel("Digite seu texto aqui: ");
        etiqueta2 = new JLabel("");
        resultado = new JTextField(30);
        saida = new JLabel("");

        add(etiqueta1);
        add(etiqueta2);
        add(resultado);

        resultado.addActionListener(new inverte());
        add(saida);
    }

    private class inverte implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            StringBuffer s = new StringBuffer(resultado.getText());
            s.reverse();
            saida.setText("Invertido: " + s);
        }
    }
}
