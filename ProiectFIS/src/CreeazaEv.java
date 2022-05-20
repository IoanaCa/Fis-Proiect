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
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import com.google.gson.*;



public class CreeazaEv extends JFrame {

	private JPanel contentPane;
	private JTextField textTitlu;
	private JTextField textDescriere;
	private JTextField textDataInceput;
	private JTextField textDataSfarsit;
	private JTextField textInterval1;
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
		comboBoxRecurenta.setModel(new DefaultComboBoxModel(new String[] {"-", "Zilnic", "Saptamanal", "Lunar", "Anual"}));
		comboBoxRecurenta.setBounds(248, 413, 145, 22);
		contentPane.add(comboBoxRecurenta);

		JLabel lblAlarmaIntervalRecurenta = new JLabel("Alarma ");
		lblAlarmaIntervalRecurenta.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAlarmaIntervalRecurenta.setBounds(121, 458, 69, 41);
		contentPane.add(lblAlarmaIntervalRecurenta);

		textInterval1 = new JTextField();
		textInterval1.setBounds(248, 522, 96, 20);
		contentPane.add(textInterval1);
		textInterval1.setColumns(10);

		JLabel lblInterval = new JLabel("Interval");
		lblInterval.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInterval.setBounds(131, 510, 69, 41);
		contentPane.add(lblInterval);

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
		comboBoxCuloare.setModel(new DefaultComboBoxModel(new String[] {"Pink", "Red", "Yellow"}));
		comboBoxCuloare.setToolTipText("");
		comboBoxCuloare.setBounds(248, 361, 145, 22);
		contentPane.add(comboBoxCuloare);

		textRecurenta = new JTextField();
		textRecurenta.setColumns(10);
		textRecurenta.setBounds(248, 561, 96, 20);
		contentPane.add(textRecurenta);

		JCheckBox chckbxAlarma = new JCheckBox("Seteaza");
		chckbxAlarma.setBounds(245, 470, 99, 23);
		contentPane.add(chckbxAlarma);

		JLabel lblMin = new JLabel("Min");
		lblMin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMin.setBounds(364, 567, 70, 14);
		contentPane.add(lblMin);
		JButton btnSalveaza = new JButton("Salveaza");
		List<Eveniment> evenimente;
		
		

		
	

		btnSalveaza.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String titlu= textTitlu.getText();
				//System.out.println(titlu);
				String descriere= textDescriere.getText();
				//System.out.println(descriere);
				String data_ora_incep= textDataInceput.getText();
				//System.out.println(data_ora_incep);
				String data_ora_sf= textDataSfarsit.getText();
				//System.out.println(data_ora_sf);
				String cod_culoare= (String) comboBoxCuloare.getSelectedItem();
				//System.out.println(cod_culoare);
				String  tip_recurenta= (String) comboBoxRecurenta.getSelectedItem();
				//System.out.println(tip_recurenta);
				Boolean alarma= (Boolean)chckbxAlarma.isSelected();
				//System.out.println(alarma);
				int recurenta_alarma=Integer.valueOf(textRecurenta.getText()) ;
				//System.out.println(recurenta_alarma);
				int interval=Integer.valueOf(textInterval1.getText()) ;
				//System.out.println(interval);
				Eveniment ev= new Eveniment(titlu,descriere,data_ora_incep,data_ora_sf,cod_culoare,alarma,recurenta_alarma,tip_recurenta,interval);
				/* System.out.println(ev); */
				try {
				    // create Gson instance
				    Gson gson = new Gson();

				    // create a reader
				    Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));

				    // convert JSON array to list 
				    List<Eveniment> eveniment = new ArrayList( Arrays.asList(gson.fromJson(reader, Eveniment[].class)));
				    
				    if(eveniment==null)
				    	throw new Exception();

				    // print 
				    //eveniment.forEach(System.out::println);

				    // close reader
				    reader.close();
				
				eveniment.add(ev);


				Writer writer;
				try {
					writer = Files.newBufferedWriter(Paths.get("evenimente.json"));
					//Gson gson=new Gson(); 
					String json=gson.toJson(eveniment); 
					gson.toJson(eveniment, writer);
					writer.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}



				/*
				 * try { PrintStream fis= new PrintStream("event.txt"); fis.println(ev); } catch
				 * (FileNotFoundException e1) { // TODO Auto-generated catch block
				 * e1.printStackTrace(); }
				 */

				} catch (Exception ex) {
				    ex.printStackTrace();
				}
			}
			
		});

		btnSalveaza.setBounds(392, 618, 120, 34);
		contentPane.add(btnSalveaza);


		/*
		 * try { // create Gson instance Gson gson = new Gson();
		 * 
		 * // create a reader Reader reader =
		 * Files.newBufferedReader(Paths.get("evenimente.json"));
		 * 
		 * // convert JSON string to Book object Eveniment even = gson.fromJson(reader,
		 * Eveniment.class);
		 * 
		 * // print book System.out.println(even);
		 * 
		 * // close reader reader.close();
		 * 
		 * } catch (Exception ex) { ex.printStackTrace(); }
		 */
		try {
		    // create Gson instance
		    Gson gson = new Gson();

		    // create a reader
		    Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));

		    // convert JSON array to list 
		    List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));
		    
		    for(Eveniment e:eveniment) {
		    	System.out.println(e);
		    }

		    // print 
		    //eveniment.forEach(System.out::println);

		    // close reader
		    reader.close();

		} catch (Exception ex) {
		    ex.printStackTrace();
		}
		
	}
}

