package Telas;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaCategorias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaCategorias() {
		setResizable(false);
		setTitle("Categorias");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 371, 296);
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
