package Telas;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCategorias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
        btnMatematica.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Pergunta[] usadas = new Pergunta[5];
        		for (int i=0; i<5; i++) {
        			String[] erradas = new String[3];
        			for (int j=0; j<3; j++) erradas[j] = "não é essa\n"+j;
        			Pergunta p = new Pergunta("POR AQUI", "teste "+i, "Matemática", erradas, i);
        			usadas[i] = p;
        		}
        		
        		TelaPerguntas perguntas = new TelaPerguntas("Matematica", usadas);
        		perguntas.setVisible(true);
        	}
        });
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
