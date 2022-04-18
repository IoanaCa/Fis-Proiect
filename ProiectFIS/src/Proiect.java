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
		btnNewButton.setBounds(100, 412, 127, 35);
		contentPane.add(btnNewButton);
		
		JButton btnModificaEveniment = new JButton("Modifica eveniment");
		btnModificaEveniment.setBounds(305, 412, 132, 35);
		contentPane.add(btnModificaEveniment);
		
		JButton btnStergeEveniment = new JButton("Sterge eveniment");
		btnStergeEveniment.setBounds(537, 412, 123, 35);
		contentPane.add(btnStergeEveniment);
		
		JButton btnOrdCronologica = new JButton("Ev ordine \n cronologica");
		btnOrdCronologica.setBounds(10, 98, 89, 35);
		contentPane.add(btnOrdCronologica);
		
		JButton btnEv = new JButton("Ev ");
		btnEv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEv.setBounds(10, 144, 89, 35);
		contentPane.add(btnEv);
		Icon icon = new ImageIcon("E:\\year.png");
	      
		JButton btnEv_1 = new JButton((Icon) null);
		btnEv_1.setBounds(10, 190, 89, 35);
		contentPane.add(btnEv_1);
		
		
		JButton btnEv_2 = new JButton("Ev ");
		btnEv_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEv_2.setBounds(10, 254, 89, 35);
		contentPane.add(btnEv_2);
		
		JButton btnEv_3 = new JButton("Ev ");
		btnEv_3.setBounds(10, 300, 89, 35);
		contentPane.add(btnEv_3);
		//JTable table = new JTable(data, columnNames);
	}
}
