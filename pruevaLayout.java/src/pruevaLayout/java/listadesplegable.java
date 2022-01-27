package pruevaLayout.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listadesplegable extends JFrame {

	private JPanel contentPane;
	private JComboBox comboidioma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listadesplegable frame = new listadesplegable();
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
	public listadesplegable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][grow]", "[][][][][]"));
		
		JLabel lblNewLabel = new JLabel("idioma");
		contentPane.add(lblNewLabel, "cell 1 1");
		
		comboidioma = new JComboBox();
		comboidioma.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1ol", "Ingles", "Aleman", "Frances"}));
		contentPane.add(comboidioma, "cell 4 2,growx");
		
		JButton btnNewButton = new JButton("aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboidioma.getSelectedIndex()==0) {
					JOptionPane.showConfirmDialog(null, "debe seleccionar un idioma");
				}
			}
		});
		contentPane.add(btnNewButton, "cell 0 4 5 1,alignx center,aligny center");
	}

}
