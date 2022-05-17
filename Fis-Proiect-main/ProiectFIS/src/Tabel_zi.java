import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabel_zi extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabel_zi frame = new Tabel_zi();
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
	public Tabel_zi() {
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
		btnStergeEveniment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStergeEveniment.setBounds(529, 414, 123, 35);
		contentPane.add(btnStergeEveniment);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table.setColumnSelectionAllowed(true);
		table.setBounds(125, 82, 636, 277);
		contentPane.add(table);
		
		textField = new JTextField();
		textField.setBounds(360, 59, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
