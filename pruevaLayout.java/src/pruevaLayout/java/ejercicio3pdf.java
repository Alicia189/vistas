package pruevaLayout.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio3pdf extends JFrame {

	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textnota1;
	private JTextField textnota2;
	private JTextField textnota3;
	private JLabel lblPromediotitulo;
	private JLabel lblPromedio;
	private JLabel lblResultadomensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio3pdf frame = new ejercicio3pdf();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ejercicio3pdf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][][grow][]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("CALCULAR PROMEDIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		contentPane.add(lblNewLabel, "cell 0 0 5 1,grow");
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		contentPane.add(lblNewLabel_2, "cell 0 3,alignx trailing");
		
		textnombre = new JTextField();
		contentPane.add(textnombre, "cell 1 3 4 1,growx");
		textnombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1");
		contentPane.add(lblNewLabel_1, "cell 0 4,alignx trailing");
		
		textnota1 = new JTextField();
		contentPane.add(textnota1, "cell 1 4,growx");
		textnota1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 2");
		contentPane.add(lblNewLabel_3, "cell 2 4,alignx trailing");
		
		textnota2 = new JTextField();
		contentPane.add(textnota2, "cell 3 4,growx");
		textnota2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nota 3");
		contentPane.add(lblNewLabel_4, "flowx,cell 4 4");
		
		textnota3 = new JTextField();
		contentPane.add(textnota3, "cell 4 4");
		textnota3.setColumns(10);
		
		 lblPromediotitulo = new JLabel("Promedio :");
		contentPane.add(lblPromediotitulo, "cell 1 6");
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {

			private JLabel lblResultado;

			public void actionPerformed(ActionEvent e) {
				String nombre = textnombre.getText();
				double nota1 = Double.parseDouble(textnota1.getText());
				double nota2 = Double.parseDouble(textnota2.getText());
				double nota3 = Double.parseDouble(textnota3.getText());
				double media = (nota1 + nota2 + nota3)/3;
				if ( media > 5 ) {
					lblResultadomensaje.setText( nombre+ "ha aprobado la asignatura");
				}
				else {
					lblResultadomensaje.setText(nombre+ "Toca recuperar");
					}
				
				lblPromedio.setText(""+media);    //Double.toString(media));
			}
		});
		

		
		lblPromedio = new JLabel("");
		contentPane.add(lblPromedio, "cell 2 6 2 1");
		contentPane.add(btnNewButton, "cell 4 6");
		
		
		

		
		JLabel lblResultado = new JLabel("Resultado :");
		contentPane.add(lblResultado, "cell 1 7");
		
		lblResultadomensaje = new JLabel("");
		contentPane.add(lblResultadomensaje, "cell 2 7");
	}

}
