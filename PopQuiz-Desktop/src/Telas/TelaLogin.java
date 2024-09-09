package Telas;

import java.awt.EventQueue;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panLogin = new JPanel();
		panLogin.setLayout(null);
		panLogin.setBounds(0, 0, 474, 404);
		contentPane.add(panLogin);
		
		JLabel lblNewLabel = new JLabel("Bem-vindo de volta!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(155, 30, 141, 20);
		panLogin.add(lblNewLabel);
		
		JPanel cmpEmail = new JPanel();
		cmpEmail.setBounds(10, 61, 454, 68);
		panLogin.add(cmpEmail);
		cmpEmail.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("    E-mail:");
		cmpEmail.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("Email");
		textField.setColumns(10);
		cmpEmail.add(textField);
		
		JPanel cmpSenha = new JPanel();
		cmpSenha.setBounds(10, 140, 454, 68);
		panLogin.add(cmpSenha);
		cmpSenha.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("    Senha:");
		cmpSenha.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Senha");
		cmpSenha.add(passwordField);
		System.out.println(passwordField);
		
		JPanel cmpButtons = new JPanel();
		cmpButtons.setBounds(74, 235, 346, 94);
		panLogin.add(cmpButtons);
		cmpButtons.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                TelaCategorias categorias = new TelaCategorias();
                categorias.setVisible(true);
                dispose();
        		try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/strauss","root","coxinha");
                    System.out.println("inserindo dados");
                    Statement stmt=con.createStatement();
                    String sql="INSERT INTO usuarios(email,senha) VALUES('"+textField.getText()+"','"+passwordField.getText().toString()+"')";
                    stmt.executeUpdate(sql);
                }
                catch (Exception execao){
                    System.out.println(execao);
                }
			}
		});
		cmpButtons.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Não tem conta? Crie uma aqui");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                TelaCadastro cadastro = new TelaCadastro();
                cadastro.setVisible(true);
                dispose();
			}
		});
		btnNewButton_3.setBackground(SystemColor.menu);
		cmpButtons.add(btnNewButton_3);
	}

}
