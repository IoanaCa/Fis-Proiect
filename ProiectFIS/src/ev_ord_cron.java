import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
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
		
		JList list = new JList();
		list.setBounds(124, 26, 582, 331);
		contentPane.add(list);
	}
}
