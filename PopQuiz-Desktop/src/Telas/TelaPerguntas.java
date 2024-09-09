package Telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaPerguntas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private int ponteiro = 0;
	private int lugarCerto;
	private int pontuacao;
	
	private JButton[] botoes;
	private JLabel enunciado;
	
	private Pergunta[] perguntas;

	/**
	 * Create the frame.
	 */
	public TelaPerguntas(String tipo, Pergunta[] perguntas) {
		setTitle("Quiz: "+tipo);
		this.perguntas = perguntas;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.lugarCerto = (int) Math.round(Math.random()*3);
		this.pontuacao = 0;

		ArrayList<Integer> posicoes = new ArrayList<Integer>();
		posicoes.add(0);
		posicoes.add(1);
		posicoes.add(2);
		
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel(perguntas[ponteiro].enunciado);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		enunciado = lblNewLabel;
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		String txtResp = "";
		if (lugarCerto == 0) txtResp = perguntas[ponteiro].respCerta;
		else {
			int remove = (int) Math.random()*posicoes.size();
			int pos = posicoes.remove(remove);
			txtResp = perguntas[ponteiro].respsErradas[pos];
		}
		JButton btnNewButton = new JButton(txtResp);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lugarCerto == 0) pontuacao += perguntas[ponteiro].peso;
				else pontuacao -= perguntas[ponteiro].peso/2;
				
				ponteiro++;
				atualizaTela();
			}
		});
		panel.add(btnNewButton);
		
		if (lugarCerto == 1) txtResp = perguntas[ponteiro].respCerta;
		else {
			int remove = (int) Math.random()*posicoes.size();
			int pos = posicoes.remove(remove);
			txtResp = perguntas[ponteiro].respsErradas[pos];
		}
		JButton btnNewButton_1 = new JButton(txtResp);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lugarCerto == 1) pontuacao += perguntas[ponteiro].peso;
				else pontuacao -= perguntas[ponteiro].peso/2;
				
				ponteiro++;
				atualizaTela();
			}
		});
		panel.add(btnNewButton_1);
		
		if (lugarCerto == 2) txtResp = perguntas[ponteiro].respCerta;
		else {
			int remove = (int) Math.random()*posicoes.size();
			int pos = posicoes.remove(remove);
			txtResp = perguntas[ponteiro].respsErradas[pos];
		}
		JButton btnNewButton_2 = new JButton(txtResp);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lugarCerto == 2) pontuacao += perguntas[ponteiro].peso;
				else pontuacao -= perguntas[ponteiro].peso/2;
				
				ponteiro++;
				atualizaTela();
			}
		});
		panel.add(btnNewButton_2);
		
		if (lugarCerto == 3) txtResp = perguntas[ponteiro].respCerta;
		else {
			int remove = (int) Math.random()*posicoes.size();
			int pos = posicoes.remove(remove);
			txtResp = perguntas[ponteiro].respsErradas[pos];
		}
		JButton btnNewButton_3 = new JButton(txtResp);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lugarCerto == 3) pontuacao += perguntas[ponteiro].peso;
				else pontuacao -= perguntas[ponteiro].peso/2;
				
				ponteiro++;
				atualizaTela();
			}
		});
		panel.add(btnNewButton_3);
		
		this.botoes = new JButton[4];
		botoes[0] = btnNewButton;
		botoes[1] = btnNewButton_1;
		botoes[2] = btnNewButton_2;
		botoes[3] = btnNewButton_3;
	}
	
	private void atualizaTela() {
		if (ponteiro >= 4) {
			System.out.println(this.pontuacao);
			this.dispose();
		}
		
		enunciado.setText(perguntas[ponteiro].enunciado);
		
		ArrayList<Integer> posicoes = new ArrayList<Integer>();
		posicoes.add(0); posicoes.add(1); posicoes.add(2);
		
		this.lugarCerto = (int) Math.round(Math.random()*3);
		
		String txtResp = "";
		if (lugarCerto == 0) txtResp = perguntas[ponteiro].respCerta;
		else {
			int remove = (int) Math.random()*(posicoes.size()-1);
			int pos = posicoes.remove(remove);
			txtResp = perguntas[ponteiro].respsErradas[pos];
		} this.botoes[0].setText(txtResp);
		
		if (lugarCerto == 1) txtResp = perguntas[ponteiro].respCerta;
		else {
			int remove = (int) Math.random()*(posicoes.size()-1);
			int pos = posicoes.remove(remove);
			txtResp = perguntas[ponteiro].respsErradas[pos];
		} this.botoes[1].setText(txtResp);
		
		if (lugarCerto == 2) txtResp = perguntas[ponteiro].respCerta;
		else {
			int remove = (int) Math.random()*(posicoes.size()-1);
			int pos = posicoes.remove(remove);
			txtResp = perguntas[ponteiro].respsErradas[pos];
		} this.botoes[2].setText(txtResp);
		
		if (lugarCerto == 3) txtResp = perguntas[ponteiro].respCerta;
		else {
			int remove = (int) Math.random()*(posicoes.size()-1);
			int pos = posicoes.remove(remove);
			txtResp = perguntas[ponteiro].respsErradas[pos];
		} this.botoes[3].setText(txtResp);
	}
}
