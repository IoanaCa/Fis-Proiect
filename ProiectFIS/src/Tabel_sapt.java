import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.Icon;

import com.google.gson.Gson;
import com.toedter.calendar.JDayChooser;
import com.toedter.components.JLocaleChooser;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabel_sapt extends JFrame {

	private JPanel contentPane;
	private JTextField textData;
	private JTextField textMon;
	private JTextField textTue;
	private JTextField textWed;
	private JTextField textThu;
	private JTextField textFri;
	private JTextField textSat;
	private JTextField textSun;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String data = null, ziua = null;
					Tabel_sapt frame = new Tabel_sapt(data, ziua);
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
	String data_urm(String dat, int nr) {
		String[] s = dat.split("-");
		LocalDate da = LocalDate.of(Integer.valueOf(s[2]), Integer.valueOf(s[1]), Integer.valueOf(s[0]));
		da=da.plusDays(nr);
		String urm=String.valueOf(da.getDayOfMonth())+"-"+String.valueOf(da.getMonthValue())+"-"+String.valueOf(da.getYear());
		return urm;
	}
	
	String data_prec(String dat, int nr) {
		String[] s = dat.split("-");
		LocalDate da = LocalDate.of(Integer.valueOf(s[2]), Integer.valueOf(s[1]), Integer.valueOf(s[0]));
		da=da.minusDays(nr);
		String urm=String.valueOf(da.getDayOfMonth())+"-"+String.valueOf(da.getMonthValue())+"-"+String.valueOf(da.getYear());
		return urm;
	}

	public Tabel_sapt(String data, String ziua) {
		
		setResizable(false);
		setBounds(100, 100, 963, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultListModel demoListMon = new DefaultListModel();
		DefaultListModel demoListTue = new DefaultListModel();
		DefaultListModel demoListWed = new DefaultListModel();
		DefaultListModel demoListThu = new DefaultListModel();
		DefaultListModel demoListFri = new DefaultListModel();
		DefaultListModel demoListSat = new DefaultListModel();
		DefaultListModel demoListSun = new DefaultListModel();

		JList listMon = new JList(demoListMon);
		listMon.setBounds(61, 101, 109, 263);
		contentPane.add(listMon);

		JList listTue = new JList(demoListTue);
		listTue.setBounds(180, 101, 109, 263);
		contentPane.add(listTue);

		JList listWed = new JList(demoListWed);
		listWed.setBounds(299, 101, 109, 263);
		contentPane.add(listWed);

		JList listThu = new JList(demoListThu);
		listThu.setBounds(418, 101, 109, 263);
		contentPane.add(listThu);

		JList listFri = new JList(demoListFri);
		listFri.setBounds(537, 101, 109, 263);
		contentPane.add(listFri);

		JList listSat = new JList(demoListSat);
		listSat.setBounds(654, 101, 109, 263);
		contentPane.add(listSat);

		JList listSun = new JList(demoListSun);
		listSun.setBounds(773, 101, 109, 263);
		contentPane.add(listSun);

		JLabel lblMon = new JLabel("Mon");
		lblMon.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMon.setBounds(100, 84, 49, 14);
		contentPane.add(lblMon);

		JLabel lblTue = new JLabel("Tue");
		lblTue.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTue.setBounds(214, 84, 49, 14);
		contentPane.add(lblTue);

		JLabel lblWed = new JLabel("Wed");
		lblWed.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWed.setBounds(335, 84, 64, 14);
		contentPane.add(lblWed);

		JLabel lblThu = new JLabel("Thu");
		lblThu.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblThu.setBounds(455, 84, 49, 14);
		contentPane.add(lblThu);

		JLabel lblFri = new JLabel("Fri");
		lblFri.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFri.setBounds(575, 84, 49, 14);
		contentPane.add(lblFri);

		JLabel lblSat = new JLabel("Sat");
		lblSat.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSat.setBounds(690, 84, 72, 14);
		contentPane.add(lblSat);

		JLabel lblSun = new JLabel("Sun");
		lblSun.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSun.setBounds(805, 84, 39, 14);
		contentPane.add(lblSun);

		textData = new JTextField();
		textData.setEditable(false);
		textData.setBounds(418, 383, 109, 20);
		contentPane.add(textData);
		textData.setColumns(10);

		textMon = new JTextField();
		textMon.setEditable(false);
		textMon.setColumns(10);
		textMon.setBounds(61, 53, 109, 20);
		contentPane.add(textMon);

		textTue = new JTextField();
		textTue.setEditable(false);
		textTue.setColumns(10);
		textTue.setBounds(180, 53, 109, 20);
		contentPane.add(textTue);

		textWed = new JTextField();
		textWed.setEditable(false);
		textWed.setColumns(10);
		textWed.setBounds(299, 53, 109, 20);
		contentPane.add(textWed);

		textThu = new JTextField();
		textThu.setEditable(false);
		textThu.setColumns(10);
		textThu.setBounds(418, 53, 109, 20);
		contentPane.add(textThu);

		textFri = new JTextField();
		textFri.setEditable(false);
		textFri.setColumns(10);
		textFri.setBounds(537, 53, 109, 20);
		contentPane.add(textFri);

		textSat = new JTextField();
		textSat.setEditable(false);
		textSat.setColumns(10);
		textSat.setBounds(654, 53, 109, 20);
		contentPane.add(textSat);

		textSun = new JTextField();
		textSun.setEditable(false);
		textSun.setColumns(10);
		textSun.setBounds(773, 53, 109, 20);
		contentPane.add(textSun);
		
		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnInapoi.setBounds(418, 414, 109, 32);
		contentPane.add(btnInapoi);

		if (ziua != null) {
			textData.setText(data);
			
			if (ziua.equals("Mon")) {
				textMon.setText(data);
				textTue.setText(data_urm(data,1));
				textWed.setText(data_urm(data,2));
				textThu.setText(data_urm(data,3));
				textFri.setText(data_urm(data,4));
				textSat.setText(data_urm(data,5));
				textSun.setText(data_urm(data,6));
			} else if (ziua.equals("Tue")) {
				textMon.setText(data_prec(data,1));
				textTue.setText(data);
				textWed.setText(data_urm(data,1));
				textThu.setText(data_urm(data,2));
				textFri.setText(data_urm(data,3));
				textSat.setText(data_urm(data,4));
				textSun.setText(data_urm(data,5));
			} else if (ziua.equals("Wed")) {
				textMon.setText(data_prec(data,2));
				textTue.setText(data_prec(data,1));
				textWed.setText(data);
				textThu.setText(data_urm(data,1));
				textFri.setText(data_urm(data,2));
				textSat.setText(data_urm(data,3));
				textSun.setText(data_urm(data,4));
			} else if (ziua.equals("Thu")) {
				textMon.setText(data_prec(data,3));
				textTue.setText(data_prec(data,2));
				textWed.setText(data_prec(data,1));
				textThu.setText(data);
				textFri.setText(data_urm(data,1));
				textSat.setText(data_urm(data,2));
				textSun.setText(data_urm(data,3));
			} else if (ziua.equals("Fri")) {
				textMon.setText(data_prec(data,4));
				textTue.setText(data_prec(data,3));
				textWed.setText(data_prec(data,2));
				textThu.setText(data_prec(data,1));
				textFri.setText(data);
				textSat.setText(data_urm(data,1));
				textSun.setText(data_urm(data,2));
			} else if (ziua.equals("Sat")) {
				textMon.setText(data_prec(data,5));
				textTue.setText(data_prec(data,4));
				textWed.setText(data_prec(data,3));
				textThu.setText(data_prec(data,2));
				textFri.setText(data_prec(data,1));
				textSat.setText(data);
				textSun.setText(data_urm(data,1));
			} else if (ziua.equals("Sun")) {
				textMon.setText(data_prec(data,6));
				textTue.setText(data_prec(data,5));
				textWed.setText(data_prec(data,4));
				textThu.setText(data_prec(data,3));
				textFri.setText(data_prec(data,2));
				textSat.setText(data_prec(data,1));
				textSun.setText(data);
			}
		}
		
		try {
			if (textMon.getText() != null) {
				String[] s = textMon.getText().split("-");
				int zi = Integer.valueOf(s[0]);
				int luna = Integer.valueOf(s[1]);
				int an = Integer.valueOf(s[2]);
				int a, z, lu;
				Gson gson = new Gson();
				Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));
				List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));
				demoListMon.clear();
				for (Eveniment ee : eveniment) {
					String[] dat = ee.getData_incep().split("-");
					a = Integer.valueOf(dat[2]);
					lu = Integer.valueOf(dat[1]);
					z = Integer.valueOf(dat[0]);
					if (an == a && lu == luna && z == zi)
						demoListMon.addElement(ee.getTitlu());
				}
				contentPane.add(listMon);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			if (textTue.getText() != null) {
				String[] s = textTue.getText().split("-");
				int zi = Integer.valueOf(s[0]);
				int luna = Integer.valueOf(s[1]);
				int an = Integer.valueOf(s[2]);
				int a, z, lu;
				Gson gson = new Gson();
				Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));
				List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));
				demoListTue.clear();
				for (Eveniment ee : eveniment) {
					String[] dat = ee.getData_incep().split("-");
					a = Integer.valueOf(dat[2]);
					lu = Integer.valueOf(dat[1]);
					z = Integer.valueOf(dat[0]);
					if (an == a && lu == luna && z == zi)
						demoListTue.addElement(ee.getTitlu());
				}
				contentPane.add(listTue);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		
		try {
			if (textWed.getText() != null) {
				String[] s = textWed.getText().split("-");
				int zi = Integer.valueOf(s[0]);
				int luna = Integer.valueOf(s[1]);
				int an = Integer.valueOf(s[2]);
				int a, z, lu;
				Gson gson = new Gson();
				Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));
				List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));
				demoListWed.clear();
				for (Eveniment ee : eveniment) {
					String[] dat = ee.getData_incep().split("-");
					a = Integer.valueOf(dat[2]);
					lu = Integer.valueOf(dat[1]);
					z = Integer.valueOf(dat[0]);
					if (an == a && lu == luna && z == zi)
						demoListWed.addElement(ee.getTitlu());
				}
				contentPane.add(listWed);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			if (textThu.getText() != null) {
				String[] s = textThu.getText().split("-");
				int zi = Integer.valueOf(s[0]);
				int luna = Integer.valueOf(s[1]);
				int an = Integer.valueOf(s[2]);
				int a, z, lu;
				Gson gson = new Gson();
				Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));
				List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));
				demoListThu.clear();
				for (Eveniment ee : eveniment) {
					String[] dat = ee.getData_incep().split("-");
					a = Integer.valueOf(dat[2]);
					lu = Integer.valueOf(dat[1]);
					z = Integer.valueOf(dat[0]);
					if (an == a && lu == luna && z == zi)
						demoListThu.addElement(ee.getTitlu());
				}
				contentPane.add(listThu);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			if (textFri.getText() != null) {
				String[] s = textFri.getText().split("-");
				int zi = Integer.valueOf(s[0]);
				int luna = Integer.valueOf(s[1]);
				int an = Integer.valueOf(s[2]);
				int a, z, lu;
				Gson gson = new Gson();
				Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));
				List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));
				demoListFri.clear();
				for (Eveniment ee : eveniment) {
					String[] dat = ee.getData_incep().split("-");
					a = Integer.valueOf(dat[2]);
					lu = Integer.valueOf(dat[1]);
					z = Integer.valueOf(dat[0]);
					if (an == a && lu == luna && z == zi)
						demoListFri.addElement(ee.getTitlu());
				}
				contentPane.add(listFri);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			if (textSat.getText() != null) {
				String[] s = textSat.getText().split("-");
				int zi = Integer.valueOf(s[0]);
				int luna = Integer.valueOf(s[1]);
				int an = Integer.valueOf(s[2]);
				int a, z, lu;
				Gson gson = new Gson();
				Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));
				List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));
				demoListSat.clear();
				for (Eveniment ee : eveniment) {
					String[] dat = ee.getData_incep().split("-");
					a = Integer.valueOf(dat[2]);
					lu = Integer.valueOf(dat[1]);
					z = Integer.valueOf(dat[0]);
					if (an == a && lu == luna && z == zi)
						demoListSat.addElement(ee.getTitlu());
				}
				contentPane.add(listSat);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			if (textSun.getText() != null) {
				String[] s = textSun.getText().split("-");
				int zi = Integer.valueOf(s[0]);
				int luna = Integer.valueOf(s[1]);
				int an = Integer.valueOf(s[2]);
				int a, z, lu;
				Gson gson = new Gson();
				Reader reader = Files.newBufferedReader(Paths.get("evenimente.json"));
				List<Eveniment> eveniment = Arrays.asList(gson.fromJson(reader, Eveniment[].class));
				demoListSun.clear();
				for (Eveniment ee : eveniment) {
					String[] dat = ee.getData_incep().split("-");
					a = Integer.valueOf(dat[2]);
					lu = Integer.valueOf(dat[1]);
					z = Integer.valueOf(dat[0]);
					if (an == a && lu == luna && z == zi)
						demoListSun.addElement(ee.getTitlu());
				}
				contentPane.add(listSun);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
}









