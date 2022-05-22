import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.google.gson.Gson;
import com.jgoodies.common.collect.LinkedListModel;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Proiect extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proiect frame = new Proiect();
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
	public Proiect() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 516);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JCalendar calendar = new JCalendar();
		calendar.getDayChooser().setSundayForeground(Color.RED);
		
		
		JPanel jpanel = calendar.getDayChooser().getDayPanel();
		Component[] component = jpanel.getComponents();
		 for (int i = 1; i <8 ; i++) {
	         component[i].setBackground(Color.RED);
	    }

		calendar.setSundayForeground(new Color(153, 0, 0));
		calendar.setDecorationBackgroundColor(Color.PINK);
		calendar.setBounds(109, 55, 487, 292);
		contentPane.add(calendar);

		String zi, luna, an;
		zi = String.valueOf(calendar.getDayChooser().getDay());
		luna = String.valueOf(calendar.getMonthChooser().getMonth() + 1);
		an = String.valueOf(calendar.getYearChooser().getYear());
		
		JButton btnNewButton = new JButton("Creeaza eveniment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String zi = String.valueOf(calendar.getDayChooser().getDay());
				String luna = String.valueOf(calendar.getMonthChooser().getMonth() + 1);
				String an = String.valueOf(calendar.getYearChooser().getYear());

				String dat = zi + "-" + luna + "-" + an;
				NouEvSelectat ev = new NouEvSelectat(dat);
				ev.setVisible(true);

			}
		});
		btnNewButton.setBounds(287, 408, 127, 35);
		contentPane.add(btnNewButton);

		JButton btnOrdCronologica = new JButton("Ev ordine \n cronologica");
		btnOrdCronologica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ev_ord_cron ev_ord_cron = new ev_ord_cron();
				ev_ord_cron.setVisible(true);
			}
		});
		btnOrdCronologica.setBounds(89, 9, 179, 35);
		contentPane.add(btnOrdCronologica);

		JButton btnTabelzi = new JButton("Tabel zi");
		btnTabelzi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String zi = String.valueOf(calendar.getDayChooser().getDay());
				String luna = String.valueOf(calendar.getMonthChooser().getMonth() + 1);
				String an = String.valueOf(calendar.getYearChooser().getYear());

				String dat = zi + "-" + luna + "-" + an;

				Tabel_zi tabel_zi = new Tabel_zi(dat);
				tabel_zi.setVisible(true);
			}
		});
		btnTabelzi.setBounds(339, 9, 89, 35);
		contentPane.add(btnTabelzi);
		Icon icon = new ImageIcon("E:\\year.png");
		
		System.out.println(calendar.getDate());

		JButton btnTabelsapt = new JButton((Icon) null);
		btnTabelsapt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String zi = String.valueOf(calendar.getDayChooser().getDay());
				String luna = String.valueOf(calendar.getMonthChooser().getMonth() + 1);
				String an = String.valueOf(calendar.getYearChooser().getYear());
				String dat = zi + "-" + luna + "-" + an;
				String[] s=String.valueOf(calendar.getDate()).split(" ");
				
				Tabel_sapt tabel_sapt = new Tabel_sapt(dat,s[0]);
				tabel_sapt.setVisible(true);
			}
		});
		btnTabelsapt.setText("Tabel sapt");
		btnTabelsapt.setBounds(482, 9, 89, 35);
		contentPane.add(btnTabelsapt);

		JButton btnTabelan = new JButton("Tabel an");
		btnTabelan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String zi = String.valueOf(calendar.getDayChooser().getDay());
				String luna = String.valueOf(calendar.getMonthChooser().getMonth() + 1);
				String an = String.valueOf(calendar.getYearChooser().getYear());

				String dat = zi + "-" + luna + "-" + an;

				Tabel_an tabel_an = new Tabel_an(dat);
				tabel_an.setVisible(true);
			}
		});
		btnTabelan.setBounds(608, 9, 89, 35);
		contentPane.add(btnTabelan);

		DefaultListModel demoList = new DefaultListModel();
		JList list = new JList(demoList);
		list.setBounds(649, 159, 154, 188);
		contentPane.add(list);

		calendar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				try {
					int zi = calendar.getDayChooser().getDay();
					int luna = calendar.getMonthChooser().getMonth() + 1;
					int an = calendar.getYearChooser().getYear();
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
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

	}
}
