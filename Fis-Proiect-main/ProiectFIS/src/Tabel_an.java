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
					Tabel_an frame = new Tabel_an();
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
	public Tabel_an() {
		setResizable(false);
		setBounds(100, 100, 1504, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDayChooser dayChooser = new JDayChooser();
		dayChooser.setDay(-1);
		dayChooser.setMonth(0);
		dayChooser.setBounds(0, 71, 204, 105);
		contentPane.add(dayChooser);
		
		JDayChooser dayChooser_1 = new JDayChooser();
		dayChooser_1.setMonth(1);
		dayChooser_1.setBounds(214, 71, 189, 105);
		contentPane.add(dayChooser_1);
		
		JDayChooser dayChooser_2 = new JDayChooser();
		dayChooser_2.setMonth(2);
		dayChooser_2.setBounds(413, 71, 206, 105);
		contentPane.add(dayChooser_2);
		
		JDayChooser dayChooser_3 = new JDayChooser();
		dayChooser_3.setMonth(3);
		dayChooser_3.setBounds(629, 71, 206, 105);
		contentPane.add(dayChooser_3);
		
		JDayChooser dayChooser_4 = new JDayChooser();
		dayChooser_4.setMonth(4);
		dayChooser_4.setBounds(845, 71, 206, 105);
		contentPane.add(dayChooser_4);
		
		JDayChooser dayChooser_5 = new JDayChooser();
		dayChooser_5.setMonth(5);
		dayChooser_5.setBounds(1061, 71, 212, 105);
		contentPane.add(dayChooser_5);
		
		JDayChooser dayChooser_6 = new JDayChooser();
		dayChooser_6.setMonth(6);
		dayChooser_6.setBounds(0, 198,  204, 105);
		contentPane.add(dayChooser_6);
		
		JDayChooser dayChooser_1_1 = new JDayChooser();
		dayChooser_1_1.setMonth(7);
		dayChooser_1_1.setBounds(214, 198, 189, 105);
		contentPane.add(dayChooser_1_1);
		
		JDayChooser dayChooser_2_1 = new JDayChooser();
		dayChooser_2_1.setMonth(8);
		dayChooser_2_1.setBounds(415, 198, 204, 105);
		contentPane.add(dayChooser_2_1);
		
		JDayChooser dayChooser_3_1 = new JDayChooser();
		dayChooser_3_1.setMonth(9);
		dayChooser_3_1.setBounds(631, 198, 204, 105);
		contentPane.add(dayChooser_3_1);
		
		JDayChooser dayChooser_4_1 = new JDayChooser();
		dayChooser_4_1.setMonth(10);
		dayChooser_4_1.setBounds(847, 198, 204, 105);
		contentPane.add(dayChooser_4_1);
		
		JDayChooser dayChooser_5_1 = new JDayChooser();
		dayChooser_5_1.setMonth(11);
		dayChooser_5_1.setBounds(1061, 198, 212, 105);
		contentPane.add(dayChooser_5_1);
		
		JLabel lblIanuarie = new JLabel("Ianuarie");
		lblIanuarie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIanuarie.setBounds(62, 56, 70, 14);
		contentPane.add(lblIanuarie);
		
		JLabel lblFebruarie = new JLabel("Februarie");
		lblFebruarie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFebruarie.setBounds(270, 56, 70, 14);
		contentPane.add(lblFebruarie);
		
		JLabel lblMartie = new JLabel("Martie");
		lblMartie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMartie.setBounds(473, 56, 70, 14);
		contentPane.add(lblMartie);
		
		JLabel lblAprilie = new JLabel("Aprilie");
		lblAprilie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAprilie.setBounds(697, 56, 70, 14);
		contentPane.add(lblAprilie);
		
		JLabel lblMai = new JLabel("Mai");
		lblMai.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMai.setBounds(910, 56, 70, 14);
		contentPane.add(lblMai);
		
		JLabel lblIunie = new JLabel("Iunie");
		lblIunie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIunie.setBounds(1133, 56, 70, 14);
		contentPane.add(lblIunie);
		
		JLabel lblIulie = new JLabel("Iulie");
		lblIulie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIulie.setBounds(62, 184, 70, 14);
		contentPane.add(lblIulie);
		
		JLabel lblAugust = new JLabel("August");
		lblAugust.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAugust.setBounds(270, 184, 70, 14);
		contentPane.add(lblAugust);
		
		JLabel lblSeptembrie = new JLabel("Septembrie");
		lblSeptembrie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSeptembrie.setBounds(473, 184, 89, 14);
		contentPane.add(lblSeptembrie);
		
		JLabel lblOctombrie = new JLabel("Octombrie");
		lblOctombrie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOctombrie.setBounds(697, 185, 70, 14);
		contentPane.add(lblOctombrie);
		
		JLabel lblNoiembrie = new JLabel("Noiembrie");
		lblNoiembrie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNoiembrie.setBounds(910, 184, 70, 14);
		contentPane.add(lblNoiembrie);
		
		JLabel lblDecembrie = new JLabel("Decembrie");
		lblDecembrie.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDecembrie.setBounds(1133, 184, 89, 14);
		contentPane.add(lblDecembrie);
		
		textField = new JTextField();
		textField.setBounds(568, 322, 127, 35);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
