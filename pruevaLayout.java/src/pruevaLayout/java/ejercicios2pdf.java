package pruevaLayout.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicios2pdf extends JFrame {

	private JPanel contentPane;
	private JTextField textusuario;
	private JTextField textcontrase�a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicios2pdf frame = new ejercicios2pdf();
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
	public ejercicios2pdf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("usuario");
		contentPane.add(lblNewLabel, "cell 0 3");
		
		textusuario = new JTextField();
		contentPane.add(textusuario, "cell 1 3,growx");
		textusuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("contrase\u00F1a");
		contentPane.add(lblNewLabel_1, "cell 0 5,alignx trailing");
		
		textcontrase�a = new JTextField();
		contentPane.add(textcontrase�a, "cell 1 5,growx");
		textcontrase�a.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario=textusuario.getText();
				String contrase�a=textcontrase�a.getText();
				if (usuario.equals("Alicia") && contrase�a.equals("123")){
					JOptionPane.showMessageDialog(null, "has seleccionado usuario Alicia"+
							" y la contrase�a es correcta 123");
				}else  {
					JOptionPane.showMessageDialog(null, "El usuario y la contrase�a es incorrecto");
				}
			
					
			}
		});
		contentPane.add(btnNewButton, "cell 0 7 3 1,alignx right,aligny center");
	}

}
