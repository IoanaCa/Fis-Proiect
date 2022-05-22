import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class ModificaEv extends JFrame {

	private JPanel contentPane;
	private JTextField textTitlu;
	private JTextField textDescriere;
	private JTextField textDataInceput;
	private JTextField textDataSfarsit;
	private JTextField textOraInceput;
	private JTextField textRecurenta;
	private JTextField textOraSfarsit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String sir=null;
					ModificaEv frame = new ModificaEv(sir);
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
	public ModificaEv(String sir) {
		setResizable(false);
		setBounds(100, 100, 591, 736);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textTitlu = new JTextField();
		textTitlu.setBounds(205, 24, 130, 20);
		contentPane.add(textTitlu);
		textTitlu.setColumns(10);
		textTitlu.setText(sir);

		JLabel lblTitlu = new JLabel("Titlu");
		lblTitlu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTitlu.setBounds(121, 22, 74, 20);
		contentPane.add(lblTitlu);

		textDescriere = new JTextField();
		textDescriere.setBounds(121, 111, 335, 114);
		contentPane.add(textDescriere);
		textDescriere.setColumns(10);

		JLabel lblDescriere = new JLabel("Descriere");
		lblDescriere.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescriere.setBounds(121, 80, 74, 20);
		contentPane.add(lblDescriere);

		textDataInceput = new JTextField();
		textDataInceput.setBounds(248, 280, 145, 20);
		contentPane.add(textDataInceput);
		textDataInceput.setColumns(10);

		JLabel lblDataInceput = new JLabel("Data de inceput");
		lblDataInceput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDataInceput.setBounds(121, 281, 117, 14);
		contentPane.add(lblDataInceput);

		textDataSfarsit = new JTextField();
		textDataSfarsit.setColumns(10);
		textDataSfarsit.setBounds(248, 325, 145, 20);
		contentPane.add(textDataSfarsit);

		JLabel lblDataSfarsit = new JLabel("Data sfarsit");
		lblDataSfarsit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDataSfarsit.setBounds(121, 326, 117, 14);
		contentPane.add(lblDataSfarsit);

		JLabel lblNewLabel = new JLabel("Culoare");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(122, 363, 70, 14);
		contentPane.add(lblNewLabel);

		JLabel lblRecurenta = new JLabel("Recurenta");
		lblRecurenta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRecurenta.setBounds(121, 415, 70, 14);
		contentPane.add(lblRecurenta);

		JComboBox comboBoxRecurenta = new JComboBox();
		comboBoxRecurenta.setModel(new DefaultComboBoxModel(new String[] { "-", "Zilnic", "Saptamanal", "Lunar", "Anual" }));
		comboBoxRecurenta.setBounds(248, 413, 145, 22);
		contentPane.add(comboBoxRecurenta);

		JLabel lblAlarmaIntervalRecurenta = new JLabel("Alarma ");
		lblAlarmaIntervalRecurenta.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAlarmaIntervalRecurenta.setBounds(121, 458, 69, 41);
		contentPane.add(lblAlarmaIntervalRecurenta);

		textOraInceput = new JTextField();
		textOraInceput.setEnabled(false);
		textOraInceput.setBounds(234, 522, 46, 20);
		contentPane.add(textOraInceput);
		textOraInceput.setColumns(10);

		JLabel lblOrainceput = new JLabel("Ora inceput");
		lblOrainceput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOrainceput.setBounds(121, 510, 90, 41);
		contentPane.add(lblOrainceput);

		JLabel lblRecurenta_1 = new JLabel("Recurenta");
		lblRecurenta_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRecurenta_1.setBounds(141, 562, 70, 14);
		contentPane.add(lblRecurenta_1);

		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		btnInapoi.setBounds(75, 618, 120, 34);
		contentPane.add(btnInapoi);

		JComboBox comboBoxCuloare = new JComboBox();
		comboBoxCuloare.setModel(new DefaultComboBoxModel(new String[] { "Pink", "Red", "Yellow" }));
		comboBoxCuloare.setToolTipText("");
		comboBoxCuloare.setBounds(248, 361, 145, 22);
		contentPane.add(comboBoxCuloare);

		textRecurenta = new JTextField();
		textRecurenta.setEnabled(false);
		textRecurenta.setColumns(10);
		textRecurenta.setBounds(248, 561, 96, 20);
		contentPane.add(textRecurenta);

		JCheckBox chckbxAlarma = new JCheckBox("Seteaza");

		chckbxAlarma.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Boolean alarma = (Boolean) chckbxAlarma.isSelected();
				if (alarma == true) {

					textOraInceput.setEnabled(true);
					textOraSfarsit.setEnabled(true);
					textRecurenta.setEnabled(true);
				} else {
					textOraInceput.setEnabled(false);
					textOraSfarsit.setEnabled(false);
					textRecurenta.setEnabled(false);
				}
			}
		});
		chckbxAlarma.setBounds(245, 470, 99, 23);
		contentPane.add(chckbxAlarma);

		JLabel lblMin = new JLabel("Min");
		lblMin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMin.setBounds(364, 567, 70, 14);
		contentPane.add(lblMin);
		JButton btnSalveaza = new JButton("Salveaza");
		List<Eveniment> evenimente = new ArrayList<Eveniment>();

		btnSalveaza.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String titlu = textTitlu.getText();
				// System.out.println(titlu);
				String descriere = textDescriere.getText();
				// System.out.println(descriere);
				String data_ora_incep = textDataInceput.getText();
				// System.out.println(data_ora_incep);
				String data_ora_sf = textDataSfarsit.getText();
				// System.out.println(data_ora_sf);
				String cod_culoare = (String) comboBoxCuloare.getSelectedItem();
				// System.out.println(cod_culoare);
				String tip_recurenta = (String) comboBoxRecurenta.getSelectedItem();
				// System.out.println(tip_recurenta);
				Boolean alarma = (Boolean) chckbxAlarma.isSelected();
				int recurenta_alarma;
				String ora_i;
				String ora_s;
				if (alarma == true) {
					recurenta_alarma = Integer.valueOf(textRecurenta.getText());
					ora_i = textOraInceput.getText();
					ora_s = textOraSfarsit.getText();
				} else {
					recurenta_alarma = 0;
					ora_i = "";
					ora_s = "";
				}
				Eveniment ev = new Eveniment(titlu, descriere, data_ora_incep, data_ora_sf, cod_culoare, tip_recurenta,
						alarma, ora_i, ora_s, recurenta_alarma);
				/*
				 * evenimente.add(ev); Writer writer;
				 */
				/*
				 * try { writer = Files.newBufferedWriter(Paths.get("evenimente.json")); Gson
				 * gson=new Gson(); String json=gson.toJson(evenimente); gson.toJson(evenimente,
				 * writer); writer.close(); } catch (IOException e1) { // TODO Auto-generated
				 * catch block e1.printStackTrace(); }
				 */
				try {

					Gson gson = new Gson();

					Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));

					List<Eveniment> eveniment = new ArrayList(Arrays.asList(gson.fromJson(reader, Eveniment[].class)));

					if (eveniment == null)

						throw new Exception();

					reader.close();
					
					int nr=-1;
					
					for(Eveniment ee: eveniment) {
						nr++;
						if(ee.getTitlu().equals(sir))
							break;
					}
					eveniment.remove(nr);
					eveniment.add(ev);
					//eveniment.remove()

					Writer writer;
					try {
						writer = Files.newBufferedWriter(Paths.get("evenimente.json"));
						//String json = gson.toJson(eveniment);
						gson.toJson(eveniment, writer);
						writer.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}

					

				} catch (Exception ex) {
					ex.printStackTrace();
				}
				dispose();

			}

		});

		btnSalveaza.setBounds(392, 618, 120, 34);
		contentPane.add(btnSalveaza);

		textOraSfarsit = new JTextField();
		textOraSfarsit.setEnabled(false);
		textOraSfarsit.setColumns(10);
		textOraSfarsit.setBounds(392, 522, 46, 20);
		contentPane.add(textOraSfarsit);

		JLabel lblOraSfarsit = new JLabel("Ora sfarsit");
		lblOraSfarsit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOraSfarsit.setBounds(304, 510, 90, 41);
		contentPane.add(lblOraSfarsit);

		
		try {
			Gson gson = new Gson();
			Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));
			List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));
			
			for(Eveniment e: eveniment)
				if(e.getTitlu().equals(sir)) {
					textDescriere.setText(e.getDescriere());
					textDataInceput.setText(e.getData_incep());
					textDataSfarsit.setText(e.getData_sf());
					int c;
					if(e.getCod_culoare().equalsIgnoreCase("PINK"))
						c=0;
					else if(e.getCod_culoare().equalsIgnoreCase("RED"))
						c=1;
					else
						c=2;
					comboBoxCuloare.setSelectedIndex(c);
					
					if(e.getTip_recurenta().equals("-"))
						c=0;
					else if(e.getTip_recurenta().equals("Zilnic"))
						c=1;
					else if(e.getTip_recurenta().equals("Saptamanal"))
						c=2;
					else if(e.getTip_recurenta().equals("Lunar"))
						c=3;
					else 
						c=4;
					comboBoxRecurenta.setSelectedIndex(c);
					
					if(e.isAlarma()) {
						chckbxAlarma.setSelected(true);
						textOraInceput.setEnabled(true);
						textOraSfarsit.setEnabled(true);
						textRecurenta.setEnabled(true);
						textOraInceput.setText(e.getOra_incep());
						textOraSfarsit.setText(e.getOra_sf());
						textRecurenta.setText(String.valueOf(e.getRecurenta_alarma()));
					}
				}
			
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}

	}
}