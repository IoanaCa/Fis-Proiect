import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JCalendar;
import com.jgoodies.common.collect.LinkedListModel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JList;

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
		calendar.setSundayForeground(new Color(153, 0, 0));
		calendar.setDecorationBackgroundColor(Color.PINK);
		calendar.setBounds(109, 55, 487, 292);
		contentPane.add(calendar);
		
		JButton btnNewButton = new JButton("Creeaza eveniment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreeazaEv ev=new CreeazaEv();
				ev.show();
				
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
		btnOrdCronologica.setBounds(89, 9, 154, 35);
		contentPane.add(btnOrdCronologica);
		
		JButton btnTabelzi = new JButton("Tabel zi");
		btnTabelzi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabel_zi tabel_zi = new Tabel_zi();
				tabel_zi.setVisible(true);
			}
		});
		btnTabelzi.setBounds(278, 9, 89, 35);
		contentPane.add(btnTabelzi);
		Icon icon = new ImageIcon("E:\\year.png");
	      
		JButton btnTabelsapt = new JButton((Icon) null);
		btnTabelsapt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabel_sapt tabel_sapt = new Tabel_sapt();
				tabel_sapt.setVisible(true);
			}
		});
		btnTabelsapt.setText("Tabel sapt");
		btnTabelsapt.setBounds(396, 9, 89, 35);
		contentPane.add(btnTabelsapt);
		
		JButton btnTabelan = new JButton("Tabel an");
		btnTabelan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabel_an tabel_an = new Tabel_an();
				tabel_an.setVisible(true);
			}
		});
		btnTabelan.setBounds(524, 11, 89, 35);
		contentPane.add(btnTabelan);
		
		JList list = new JList();
		list.setBounds(649, 159, 154, 188);
		contentPane.add(list);
		//JTable table = new JTable(data, columnNames);
	}
}
