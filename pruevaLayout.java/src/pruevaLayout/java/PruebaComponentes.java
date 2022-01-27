package pruevaLayout.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class PruebaComponentes extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup sexogroup = new ButtonGroup();
	private final ButtonGroup idiomagroup = new ButtonGroup();
	private JRadioButton rdbtnhombre;
	private JRadioButton rdbtningles;
	private JRadioButton rdbtnaleman;
	private JRadioButton rdbtnmujer;
	private JRadioButton rdbtnespañol;
	private JRadioButton rdbtnfrances;
	private JRadioButton rdbtnNewRadioButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaComponentes frame = new PruebaComponentes();
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
	public PruebaComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][]", "[][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("sexo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 1 1");
		
		JLabel lblNewLabel_1 = new JLabel("idioma");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 3 1");
		
		rdbtnhombre = new JRadioButton("hombre");
		sexogroup.add(rdbtnhombre);
		contentPane.add(rdbtnhombre, "cell 2 2");
		
		rdbtningles = new JRadioButton("Ingles");
		idiomagroup.add(rdbtningles);
		contentPane.add(rdbtningles, "cell 5 2");
		
		rdbtnaleman = new JRadioButton("aleman");
		idiomagroup.add(rdbtnaleman);
		contentPane.add(rdbtnaleman, "cell 6 2");
		
		rdbtnmujer = new JRadioButton("mujer");
		rdbtnmujer.setSelected(true);
		sexogroup.add(rdbtnmujer);
		contentPane.add(rdbtnmujer, "cell 2 3");
		
		rdbtnespañol = new JRadioButton("espa\u00F1ol");
		rdbtnespañol.setSelected(true);
		idiomagroup.add(rdbtnespañol);
		contentPane.add(rdbtnespañol, "cell 5 3");
		
		rdbtnfrances = new JRadioButton("frances");
		idiomagroup.add(rdbtnfrances);
		contentPane.add(rdbtnfrances, "cell 6 3");
		
		rdbtnNewRadioButton_2 = new JRadioButton("prefiero no decirlo");
		sexogroup.add(rdbtnNewRadioButton_2);
		contentPane.add(rdbtnNewRadioButton_2, "cell 2 4");
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sexo=null;
				String idioma=null;
				if (rdbtnhombre.isSelected()) {
					sexo="hombre";
				} else if (rdbtnmujer.isSelected()) {
					sexo="mujer";
				}else if (rdbtnNewRadioButton_2.isSelected()) {
					sexo="prefiero no decirlo";
					
			}
				if (rdbtnespañol.isSelected()) {
					idioma= "español";
				} else if (rdbtnfrances.isSelected()) {
					idioma= "frances";
				} else if(rdbtnaleman.isSelected()) {
					idioma= "aleman";
				} else if(rdbtningles.isSelected()) {
							idioma= "ingles";
				}
				JOptionPane.showMessageDialog(null, "has seleccionado el sexo "+sexo+ " y el idioma es "+ idioma);
		}
		});
		contentPane.add(btnNewButton, "cell 2 6 4 1,alignx center,aligny center");
	}

	
}
