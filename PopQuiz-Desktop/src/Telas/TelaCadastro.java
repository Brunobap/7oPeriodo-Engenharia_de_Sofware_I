package Telas;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	public boolean verificarSenhasIguais(String senha, String confirmarSenha) {
	    return senha.equals(confirmarSenha) && !senha.isEmpty();
	}

	public TelaCadastro() {
		setResizable(false);
		setTitle("Cadastro");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panCadastro = new JPanel();
		panCadastro.setBounds(5, 5, 474, 404);
		panCadastro.setLayout(null);
		contentPane.add(panCadastro);
		
		JLabel lblNewLabel_3 = new JLabel("Bem-vindo ao Pop Quiz");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(157, 30, 167, 20);
		panCadastro.add(lblNewLabel_3);
		
		JPanel cmpEmail_1 = new JPanel();
		cmpEmail_1.setBounds(10, 61, 454, 68);
		panCadastro.add(cmpEmail_1);
		cmpEmail_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1_2 = new JLabel("    E-mail:");
		cmpEmail_1.add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Email");
		textField_1.setColumns(10);
		cmpEmail_1.add(textField_1);
		
		JPanel cmpSenha_1 = new JPanel();
		cmpSenha_1.setBounds(10, 140, 454, 68);
		panCadastro.add(cmpSenha_1);
		cmpSenha_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("    Senha:");
		cmpSenha_1.add(lblNewLabel_1_1_1);
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("Senha");
		cmpSenha_1.add(passwordField_1);
		String senha = new String(passwordField_1.getPassword());
		
		JPanel cmpButtons_1 = new JPanel();
		cmpButtons_1.setBounds(74, 299, 346, 94);
		panCadastro.add(cmpButtons_1);
		cmpButtons_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_2 = new JButton("Criar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = new String(passwordField_1.getPassword());
				String confirmarSenha = new String(passwordField_2.getPassword());
				
				// Verificar se as senhas são iguais
				if (!senha.equals(confirmarSenha) || senha.length()==0) {
					JOptionPane.showMessageDialog(null, "Senhas diferentes, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					// Senhas iguais, pode avançar para a próxima tela
					try {
	                    Class.forName("com.mysql.cj.jdbc.Driver");
	                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/popQuiz","root","R00t%P4$$");
	                    System.out.println("INSERINDO DADOS");
	                    PreparedStatement ptmt=con.prepareStatement("INSERT INTO usuarios(email,senha) VALUES(?,?)");
	                    ptmt.setString(1, textField_1.getText());
	                    ptmt.setString(2, senha);
	                    ptmt.executeUpdate();
	                }
	                catch (Exception execao){
	                    System.out.println(execao);
	                }
					finally {
						TelaCategorias categorias = new TelaCategorias();
						categorias.setVisible(true);
						dispose();
					}
				}
			}
		});
		cmpButtons_1.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Já tem conta? Entre por aqui");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                TelaLogin login = new TelaLogin();
                login.setVisible(true);
                dispose();
			}
		});
		btnNewButton_1.setBackground(SystemColor.menu);
		cmpButtons_1.add(btnNewButton_1);
		
		JPanel cmpSenha_1_1 = new JPanel();
		cmpSenha_1_1.setBounds(10, 219, 454, 68);
		panCadastro.add(cmpSenha_1_1);
		cmpSenha_1_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("    Confirme sua senha:");
		cmpSenha_1_1.add(lblNewLabel_1_1_1_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setToolTipText("Senha");
		cmpSenha_1_1.add(passwordField_2);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panCadastro}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panCadastro}));
	}
}
