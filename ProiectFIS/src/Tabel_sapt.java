import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.Icon;
import com.toedter.calendar.JDayChooser;
import com.toedter.components.JLocaleChooser;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Tabel_sapt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabel_sapt frame = new Tabel_sapt();
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
	public Tabel_sapt() {
		setResizable(false);
		setBounds(100, 100, 963, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList listLuni = new JList();
		listLuni.setBounds(61, 101, 109, 263);
		contentPane.add(listLuni);
		
		JList listMarti = new JList();
		listMarti.setBounds(180, 101, 109, 263);
		contentPane.add(listMarti);
		
		JList listMiercuri = new JList();
		listMiercuri.setBounds(299, 101, 109, 263);
		contentPane.add(listMiercuri);
		
		JList listJoi = new JList();
		listJoi.setBounds(418, 101, 109, 263);
		contentPane.add(listJoi);
		
		JList listVineri = new JList();
		listVineri.setBounds(537, 101, 109, 263);
		contentPane.add(listVineri);
		
		JList listSambata = new JList();
		listSambata.setBounds(654, 101, 109, 263);
		contentPane.add(listSambata);
		
		JList listDuminica = new JList();
		listDuminica.setBounds(773, 101, 109, 263);
		contentPane.add(listDuminica);
		
		JLabel lblNewLabel = new JLabel("Luni");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(100, 84, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMarti = new JLabel("Marti");
		lblMarti.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMarti.setBounds(214, 86, 49, 14);
		contentPane.add(lblMarti);
		
		JLabel lblMiercuri = new JLabel("Miercuri");
		lblMiercuri.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMiercuri.setBounds(323, 84, 64, 14);
		contentPane.add(lblMiercuri);
		
		JLabel lblJoi = new JLabel("Joi");
		lblJoi.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblJoi.setBounds(452, 86, 49, 14);
		contentPane.add(lblJoi);
		
		JLabel lblVineri = new JLabel("Vineri");
		lblVineri.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVineri.setBounds(563, 86, 49, 14);
		contentPane.add(lblVineri);
		
		JLabel lblSambata = new JLabel("Sambata");
		lblSambata.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSambata.setBounds(671, 86, 72, 14);
		contentPane.add(lblSambata);
		
		JLabel lblDuminica = new JLabel("Duminica");
		lblDuminica.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDuminica.setBounds(791, 86, 91, 14);
		contentPane.add(lblDuminica);
		
		textField = new JTextField();
		textField.setBounds(400, 375, 154, 31);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
