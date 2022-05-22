import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.google.gson.Gson;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tabel_zi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String sir = null;
					Tabel_zi frame = new Tabel_zi(sir);
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
	public Tabel_zi(String sir) {
		setResizable(false);
		setBounds(100, 100, 882, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnModificaEveniment = new JButton("Modifica eveniment");

		btnModificaEveniment.setBounds(196, 414, 132, 35);
		contentPane.add(btnModificaEveniment);

		JButton btnStergeEveniment = new JButton("Sterge eveniment");

		btnStergeEveniment.setBounds(568, 414, 123, 35);
		contentPane.add(btnStergeEveniment);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(360, 59, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField.setText(sir);
		DefaultListModel demoList = new DefaultListModel();

		JList list = new JList(demoList);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				try {
					if (sir != null) {
						String[] s = sir.split("-");
						int zi = Integer.valueOf(s[0]);
						int luna = Integer.valueOf(s[1]);
						int an = Integer.valueOf(s[2]);
						int a, z, lu;
						Gson gson = new Gson();
						Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));

						List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));

						demoList.clear();
						for (Eveniment ee : eveniment) {
							String[] dat = ee.getData_incep().split("-");
							a = Integer.valueOf(dat[2]);
							lu = Integer.valueOf(dat[1]);
							z = Integer.valueOf(dat[0]);
							if (an == a && lu == luna && z == zi)
								demoList.addElement(ee.getTitlu());
						}

						contentPane.add(list);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}

			}
		});
		list.setBounds(150, 128, 594, 236);
		contentPane.add(list);
		
		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnInapoi.setBounds(388, 414, 132, 35);
		contentPane.add(btnInapoi);

		btnModificaEveniment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sir = String.valueOf(list.getSelectedValue());
				ModificaEv mod = new ModificaEv(sir);
				mod.setVisible(true);
			}
		});

		btnStergeEveniment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (list.getSelectedValue() != null) {

						Gson gson = new Gson();
						Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));
						List<Eveniment> eveniment = new ArrayList(
								Arrays.asList(gson.fromJson(reader, Eveniment[].class)));
						if (eveniment == null)
							throw new Exception();

						reader.close();
						eveniment.remove(list.getSelectedIndex());

						Writer writer;
						try {
							writer = Files.newBufferedWriter(Paths.get("evenimente.json"));
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

		try {
			if (sir != null) {
				String[] s = sir.split("-");
				int zi = Integer.valueOf(s[0]);
				int luna = Integer.valueOf(s[1]);
				int an = Integer.valueOf(s[2]);
				int a, z, lu;

				// String dat=zi+"-"+luna+"-"+an;

				Gson gson = new Gson();
				Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));

				List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));

				demoList.clear();
				for (Eveniment ee : eveniment) {
					String[] dat = ee.getData_incep().split("-");
					a = Integer.valueOf(dat[2]);
					lu = Integer.valueOf(dat[1]);
					z = Integer.valueOf(dat[0]);
					if (an == a && lu == luna && z == zi)
						demoList.addElement(ee.getTitlu());
				}

				contentPane.add(list);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
