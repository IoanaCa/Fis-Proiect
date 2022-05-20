import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;

import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JList;

public class ev_ord_cron extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ev_ord_cron frame = new ev_ord_cron();
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
	public ev_ord_cron() {
		setResizable(false);
		setBounds(100, 100, 845, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Creeaza eveniment");
		btnNewButton.setBounds(145, 414, 127, 35);
		contentPane.add(btnNewButton);

		JButton btnModificaEveniment = new JButton("Modifica eveniment");
		btnModificaEveniment.setBounds(350, 414, 132, 35);
		contentPane.add(btnModificaEveniment);

		JButton btnStergeEveniment = new JButton("Sterge eveniment");
		btnStergeEveniment.setBounds(582, 414, 123, 35);
		contentPane.add(btnStergeEveniment);
		Component model=null;
		/*
		 * JList list = new JList(); list.setBounds(124, 26, 582, 331);
		 * contentPane.add(list); list.add(model);
		 */
		//model.addElement("g");
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



			// close reader
			reader.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
		Gson gson = new Gson();

		// create a reader
		Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));

		List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));
		
		DefaultListModel demoList = new DefaultListModel();
		
		for(Eveniment e: eveniment)
		demoList.addElement(e.getTitlu());
		
		
		JList listd = new JList(demoList);
		listd.setBounds(124, 26, 582, 331);
		contentPane.add(listd);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
