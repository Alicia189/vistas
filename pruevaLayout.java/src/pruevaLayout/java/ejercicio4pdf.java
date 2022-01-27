package pruevaLayout.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio4pdf extends JFrame {

	private JPanel contentPane;
	private JButton btnIzq;
	private JButton btnCentral;
	private JButton btnDcho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio4pdf frame = new ejercicio4pdf();
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
	public ejercicio4pdf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][][]", "[][][]"));
		
		JLabel lblNewLabel = new JLabel("Habilitar /Deshabilitar");
		contentPane.add(lblNewLabel, "cell 1 0 9 1,alignx left");
		
		btnIzq = new JButton("Desabilita Central");
		btnIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCentral.setEnabled(false);
				btnIzq.setEnabled(false);
				btnDcho.setEnabled(true);
			}
		});
		contentPane.add(btnIzq, "cell 3 2");
		
		btnCentral = new JButton("Central");
		contentPane.add(btnCentral, "cell 5 2");
		
		btnDcho = new JButton("Habilita Central");
		btnDcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnCentral.setEnabled(true);
				btnIzq.setEnabled(true);
				btnDcho.setEnabled(false);
				
				
			}
			
		});
		btnDcho.setEnabled(false);
		contentPane.add(btnDcho, "cell 8 2");
	}

}
