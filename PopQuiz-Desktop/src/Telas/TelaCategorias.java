package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class TelaCategorias extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public TelaCategorias() {
        setTitle("Categorias");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(7, 1, 5, 5));

        JLabel lblCategorias = new JLabel("Categorias:");
        contentPane.add(lblCategorias);

        JButton btnMatematica = new JButton("Matematica");
        contentPane.add(btnMatematica);

        JButton btnPortugues = new JButton("Portugues");
        contentPane.add(btnPortugues);

        JButton btnHistoria = new JButton("História");
        contentPane.add(btnHistoria);

        JButton btnGeografia = new JButton("Geografia");
        contentPane.add(btnGeografia);

        JButton btnConhecimentosGerais = new JButton("Conhecimentos gerais");
        contentPane.add(btnConhecimentosGerais);

        JButton btnEsportes = new JButton("Esportes");
        contentPane.add(btnEsportes);
    }
}
