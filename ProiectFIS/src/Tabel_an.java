import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.Icon;
import com.toedter.calendar.JDayChooser;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabel_an extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String data = null;
					Tabel_an frame = new Tabel_an(data);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tabel_an(String data) {
		setResizable(false);
		setBounds(100, 100, 933, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JDayChooser dayChooser = new JDayChooser();
		dayChooser.setMonth(0);
		dayChooser.setBounds(31, 71, 204, 105);
		contentPane.add(dayChooser);

		JDayChooser dayChooser_1 = new JDayChooser();
		dayChooser_1.setMonth(1);
		dayChooser_1.setBounds(245, 71, 189, 105);
		contentPane.add(dayChooser_1);

		JDayChooser dayChooser_2 = new JDayChooser();
		dayChooser_2.setMonth(2);
		dayChooser_2.setBounds(444, 71, 206, 105);
		contentPane.add(dayChooser_2);

		JDayChooser dayChooser_3 = new JDayChooser();
		dayChooser_3.setMonth(3);
		dayChooser_3.setBounds(660, 71, 206, 105);
		contentPane.add(dayChooser_3);

		JDayChooser dayChooser_4 = new JDayChooser();
		dayChooser_4.setMonth(8);
		dayChooser_4.setBounds(31, 332, 204, 105);
		contentPane.add(dayChooser_4);

		JDayChooser dayChooser_5 = new JDayChooser();
		dayChooser_5.setMonth(10);
		dayChooser_5.setBounds(444, 332, 206, 105);
		contentPane.add(dayChooser_5);

		JDayChooser dayChooser_6 = new JDayChooser();
		dayChooser_6.setMonth(4);
		dayChooser_6.setBounds(31, 198, 204, 105);
		contentPane.add(dayChooser_6);

		JDayChooser dayChooser_1_1 = new JDayChooser();
		dayChooser_1_1.setMonth(5);
		dayChooser_1_1.setBounds(245, 198, 189, 105);
		contentPane.add(dayChooser_1_1);

		JDayChooser dayChooser_2_1 = new JDayChooser();
		dayChooser_2_1.setMonth(6);
		dayChooser_2_1.setBounds(446, 198, 204, 105);
		contentPane.add(dayChooser_2_1);

		JDayChooser dayChooser_3_1 = new JDayChooser();
		dayChooser_3_1.setMonth(7);
		dayChooser_3_1.setBounds(662, 198, 204, 105);
		contentPane.add(dayChooser_3_1);

		JDayChooser dayChooser_4_1 = new JDayChooser();
		dayChooser_4_1.setMonth(9);
		dayChooser_4_1.setBounds(245, 332, 189, 105);
		contentPane.add(dayChooser_4_1);

		JDayChooser dayChooser_5_1 = new JDayChooser();
		dayChooser_5_1.setMonth(11);
		dayChooser_5_1.setBounds(660, 332, 206, 105);
		contentPane.add(dayChooser_5_1);

		JLabel lblIanuarie = new JLabel("Ianuarie");
		lblIanuarie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIanuarie.setBounds(96, 56, 70, 14);
		contentPane.add(lblIanuarie);

		JLabel lblFebruarie = new JLabel("Februarie");
		lblFebruarie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFebruarie.setBounds(301, 56, 70, 14);
		contentPane.add(lblFebruarie);

		JLabel lblMartie = new JLabel("Martie");
		lblMartie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMartie.setBounds(504, 56, 70, 14);
		contentPane.add(lblMartie);

		JLabel lblAprilie = new JLabel("Aprilie");
		lblAprilie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAprilie.setBounds(728, 56, 70, 14);
		contentPane.add(lblAprilie);

		JLabel lblMai = new JLabel("Mai");
		lblMai.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMai.setBounds(97, 182, 64, 14);
		contentPane.add(lblMai);

		JLabel lblIunie = new JLabel("Iunie");
		lblIunie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIunie.setBounds(313, 182, 70, 14);
		contentPane.add(lblIunie);

		JLabel lblIulie = new JLabel("Iulie");
		lblIulie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIulie.setBounds(526, 182, 70, 14);
		contentPane.add(lblIulie);

		JLabel lblAugust = new JLabel("August");
		lblAugust.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAugust.setBounds(728, 182, 70, 14);
		contentPane.add(lblAugust);

		JLabel lblSeptembrie = new JLabel("Septembrie");
		lblSeptembrie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSeptembrie.setBounds(91, 314, 89, 14);
		contentPane.add(lblSeptembrie);

		JLabel lblOctombrie = new JLabel("Octombrie");
		lblOctombrie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOctombrie.setBounds(301, 314, 70, 14);
		contentPane.add(lblOctombrie);

		JLabel lblNoiembrie = new JLabel("Noiembrie");
		lblNoiembrie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNoiembrie.setBounds(509, 314, 126, 14);
		contentPane.add(lblNoiembrie);

		JLabel lblDecembrie = new JLabel("Decembrie");
		lblDecembrie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDecembrie.setBounds(717, 315, 89, 14);
		contentPane.add(lblDecembrie);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(384, 448, 127, 26);
		textField.setText(data);

		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnInapoi.setBounds(384, 485, 127, 33);
		contentPane.add(btnInapoi);
	}
}
