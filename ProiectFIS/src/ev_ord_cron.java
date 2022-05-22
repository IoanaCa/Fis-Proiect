import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;

import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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

	class SortbyData implements Comparator<Eveniment> {
		public int compare(Eveniment a, Eveniment b) {
			String[] s1 = a.getData_incep().split("-");
			String[] s2 = b.getData_incep().split("-");
			int a1, a2, b1, b2, c1, c2;
			a1 = Integer.valueOf(s1[0]);
			a2 = Integer.valueOf(s2[0]);
			b1 = Integer.valueOf(s1[1]);
			b2 = Integer.valueOf(s2[1]);
			c1 = Integer.valueOf(s1[2]);
			c2 = Integer.valueOf(s2[2]);
			int bu = c1 - c2;
			if (bu != 0)
				return bu;
			bu = b1 - b2;
			if (bu != 0)
				return bu;
			bu = a1 - a2;
			return bu;
		}
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

		JButton btnModificaEveniment = new JButton("Modifica eveniment");

		btnModificaEveniment.setBounds(234, 414, 132, 35);
		contentPane.add(btnModificaEveniment);

		JButton btnStergeEveniment = new JButton("Sterge eveniment");

		btnStergeEveniment.setBounds(462, 414, 123, 35);
		contentPane.add(btnStergeEveniment);

		DefaultListModel demoList = new DefaultListModel();
		JList listd = new JList(demoList);

		listd.setBounds(124, 26, 582, 331);
		contentPane.add(listd);

		btnStergeEveniment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (listd.getSelectedValue() != null) {
						Gson gson = new Gson();

						Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));

						List<Eveniment> eveniment = new ArrayList(
								Arrays.asList(gson.fromJson(reader, Eveniment[].class)));

						if (eveniment == null)

							throw new Exception();

						reader.close();

						// eveniment.add(ev);
						eveniment.remove(listd.getSelectedIndex());

						Writer writer;
						try {
							writer = Files.newBufferedWriter(Paths.get("evenimente.json"));
							String json = gson.toJson(eveniment);
							gson.toJson(eveniment, writer);
							writer.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}

					} else
						JOptionPane.showMessageDialog(null, "Selectati un eveniment!");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		btnModificaEveniment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listd.getSelectedValue() != null) {

					String sir = String.valueOf(listd.getSelectedValue());
					ModificaEv mod = new ModificaEv(sir);
					mod.setVisible(true);
				} else
					JOptionPane.showMessageDialog(null, "Selectati un eveniment!");
			}
		});

		listd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// System.out.println(listd.getSelectedValue());
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				try {

					Gson gson = new Gson();
					Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));

					List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));

					Collections.sort(eveniment, new SortbyData());

					demoList.clear();
					for (Eveniment ee : eveniment)
						demoList.addElement(ee.getTitlu());

					contentPane.add(listd);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		/*
		 * JList list = new JList(); list.setBounds(124, 26, 582, 331);
		 * contentPane.add(list); list.add(model);
		 */
		// model.addElement("g");
		try {
			// create Gson instance
			Gson gson = new Gson();

			// create a reader
			Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));

			// convert JSON array to list
			List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));

			// for(Eveniment e:eveniment) {
			// System.out.println(e);
			// }

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

			for (Eveniment e : eveniment)
				demoList.addElement(e.getTitlu());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
