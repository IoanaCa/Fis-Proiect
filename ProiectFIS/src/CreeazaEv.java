import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class CreeazaEv extends JFrame {

	private JPanel contentPane;
	private JTextField textTitlu;
	private JTextField textDescriere;
	private JTextField textDataInceput;
	private JTextField textDataSfarsit;
	private JTextField textInterval1;
	private JTextField textInterval2;
	private JTextField textRecurenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreeazaEv frame = new CreeazaEv();
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
	public CreeazaEv() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 902);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textTitlu = new JTextField();
		textTitlu.setBounds(205, 24, 130, 20);
		contentPane.add(textTitlu);
		textTitlu.setColumns(10);
		
		JLabel lblTitlu = new JLabel("Titlu");
		lblTitlu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTitlu.setBounds(121, 22, 74, 20);
		contentPane.add(lblTitlu);
		
		textDescriere = new JTextField();
		textDescriere.setBounds(121, 111, 333, 182);
		contentPane.add(textDescriere);
		textDescriere.setColumns(10);
		
		JLabel lblDescriere = new JLabel("Descriere");
		lblDescriere.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescriere.setBounds(121, 80, 74, 20);
		contentPane.add(lblDescriere);
		
		textDataInceput = new JTextField();
		textDataInceput.setBounds(260, 330, 145, 20);
		contentPane.add(textDataInceput);
		textDataInceput.setColumns(10);
		
		JLabel lblDataInceput = new JLabel("Data de inceput");
		lblDataInceput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDataInceput.setBounds(121, 331, 117, 14);
		contentPane.add(lblDataInceput);
		
		textDataSfarsit = new JTextField();
		textDataSfarsit.setColumns(10);
		textDataSfarsit.setBounds(260, 381, 145, 20);
		contentPane.add(textDataSfarsit);
		
		JLabel lblDataSfarsit = new JLabel("Data sfarsit");
		lblDataSfarsit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDataSfarsit.setBounds(121, 384, 117, 14);
		contentPane.add(lblDataSfarsit);
		
		JLabel lblNewLabel = new JLabel("Culoare");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(125, 449, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblRecurenta = new JLabel("Recurenta");
		lblRecurenta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRecurenta.setBounds(121, 488, 70, 14);
		contentPane.add(lblRecurenta);
		
		JComboBox comboBoxRecurenta = new JComboBox();
		comboBoxRecurenta.setModel(new DefaultComboBoxModel(new String[] {"-", "Zilnic", "Saptamanal", "Lunar", "Anual"}));
		comboBoxRecurenta.setBounds(260, 486, 145, 22);
		contentPane.add(comboBoxRecurenta);
		
		JLabel lblAlarmaIntervalRecurenta = new JLabel("Alarma ");
		lblAlarmaIntervalRecurenta.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAlarmaIntervalRecurenta.setBounds(122, 535, 69, 41);
		contentPane.add(lblAlarmaIntervalRecurenta);
		
		textInterval1 = new JTextField();
		textInterval1.setBounds(260, 584, 96, 20);
		contentPane.add(textInterval1);
		textInterval1.setColumns(10);
		
		JLabel lblInterval = new JLabel("Interval");
		lblInterval.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInterval.setBounds(132, 572, 69, 41);
		contentPane.add(lblInterval);
		
		JLabel lblInterval_1 = new JLabel("-");
		lblInterval_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInterval_1.setBounds(365, 572, 69, 41);
		contentPane.add(lblInterval_1);
		
		textInterval2 = new JTextField();
		textInterval2.setColumns(10);
		textInterval2.setBounds(381, 584, 96, 20);
		contentPane.add(textInterval2);
		
		JLabel lblRecurenta_1 = new JLabel("Recurenta");
		lblRecurenta_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRecurenta_1.setBounds(157, 612, 70, 14);
		contentPane.add(lblRecurenta_1);
		
		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.setBounds(75, 666, 120, 34);
		contentPane.add(btnInapoi);
		
		JButton btnSalveaza = new JButton("Salveaza");
		btnSalveaza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalveaza.setBounds(401, 666, 120, 34);
		contentPane.add(btnSalveaza);
		
		JComboBox comboBoxCuloare = new JComboBox();
		comboBoxCuloare.setModel(new DefaultComboBoxModel(new String[] {"Pink", "Red", "Yellow"}));
		comboBoxCuloare.setToolTipText("");
		comboBoxCuloare.setBounds(260, 447, 145, 22);
		contentPane.add(comboBoxCuloare);
		
		textRecurenta = new JTextField();
		textRecurenta.setColumns(10);
		textRecurenta.setBounds(260, 611, 96, 20);
		contentPane.add(textRecurenta);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMin.setBounds(375, 614, 70, 14);
		contentPane.add(lblMin);
	}
}
