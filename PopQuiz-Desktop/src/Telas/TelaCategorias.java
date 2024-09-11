package Telas;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.sql.*;
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
        		try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/popQuiz","root","R00t%P4$$");
                    System.out.println("BUSCANDO PERGUNTAS");
                    Statement stmt=con.createStatement();
                    String sql="Select * from quizzes where nome='Matematica'";
                    ResultSet rs=stmt.executeQuery(sql);
                                                  

                    if(rs.next()) {
	                    int tam = 5;
	                    Pergunta[] usadas = new Pergunta[tam];
	                    
	                    for (int i=1; i<=tam; i++) {
	                    	stmt = con.createStatement();
	                    	sql = "Select * from perguntas where id="+i;
	                        ResultSet res = stmt.executeQuery(sql);
	                                         
	                        if (res.next()) { 
		                        int peso = res.getInt("peso");
		                        String materia = res.getString("materia");
		                        String enunciado = res.getString("enunciado");
			                    String respCerta = res.getString("respCerta");
			                    String erradas = res.getString("respErradas");
				               
			                    String[] respErradas = erradas.split(",");
			                    for (int j=0; j<3; j++) {
			                    	String resp = respErradas[j];
			                    	respErradas[j] = resp.substring(1, resp.length()-1);
			                    }
			                    		                    
		                    	Pergunta p = new Pergunta(respCerta, enunciado, materia, respErradas, peso);
		                    	usadas[i-1] = p;

		                    } else {
		                    	JOptionPane.showMessageDialog(null, "Login faiou", "Erro", JOptionPane.ERROR_MESSAGE);
		                    	con.close();
		                    	return;
		                    }
	                    }
	                    
	                	TelaPerguntas perguntas = new TelaPerguntas(rs.getString("nome"), usadas);
	                	perguntas.setVisible(true);
						dispose();
						
                    } else {
                    	JOptionPane.showMessageDialog(null, "Login faiou", "Erro", JOptionPane.ERROR_MESSAGE);
                    	con.close();
                    }
                }
                catch (Exception execao){
                    System.out.println(execao);
                }
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
