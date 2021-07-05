package Assignment3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class AdvertisementAndMarketing extends JFrame{

	private JPanel contentPane;
	private JTextField textField_Description;
	private JTextField textField_Start;
	private JTextField textField_End;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvertisementAndMarketing frame = new AdvertisementAndMarketing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdvertisementAndMarketing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1002, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setBounds(0, 0, 990, 590);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(396, 5, 2, 2);
		panel.add(scrollPane);
		
		JLabel lblNo = new JLabel("Advertisement & Marketing");
		lblNo.setForeground(new Color(255, 255, 0));
		lblNo.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNo.setBounds(267, 13, 427, 48);
		panel.add(lblNo);
		
		JLabel lbl_Method = new JLabel("Method");
		lbl_Method.setForeground(new Color(0, 255, 255));
		lbl_Method.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lbl_Method.setBounds(12, 57, 132, 29);
		panel.add(lbl_Method);
		
		JLabel lbl_Description = new JLabel("Description");
		lbl_Description.setForeground(Color.CYAN);
		lbl_Description.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lbl_Description.setBounds(12, 104, 132, 29);
		panel.add(lbl_Description);
		
		textField_Description = new JTextField();
		textField_Description.setColumns(10);
		textField_Description.setBounds(169, 104, 427, 74);
		panel.add(textField_Description);
		
		JLabel lbl_Start = new JLabel("Start");
		lbl_Start.setForeground(Color.CYAN);
		lbl_Start.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lbl_Start.setBounds(673, 60, 80, 29);
		panel.add(lbl_Start);
		
		JComboBox comboBox_Method = new JComboBox();
		comboBox_Method.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_Method.setModel(new DefaultComboBoxModel(new String[] {"Select Method", "Social media advertising (Facebook, Instagram, Twitter and Youtube ads)", "Billboard advertising (Malaysia)", "Spokeman (Kris Wu & Vin Diesel)"}));
		String m1 = "Social media advertising (Facebook, Instagram, Twitter and Youtube ads)";
		String m2 = "Billboard advertising (Malaysia)";
		String m3 = "Spokeman (Kris Wu & Vin Diesel)";
		comboBox_Method.setBounds(169, 60, 331, 29);
		panel.add(comboBox_Method);
		
		JLabel lbl_End = new JLabel("End");
		lbl_End.setForeground(Color.CYAN);
		lbl_End.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lbl_End.setBounds(673, 104, 73, 29);
		panel.add(lbl_End);
		
		textField_Start = new JTextField();
		textField_Start.setBounds(783, 63, 195, 25);
		panel.add(textField_Start);
		textField_Start.setColumns(10);
		
		textField_End = new JTextField();
		textField_End.setColumns(10);
		textField_End.setBounds(783, 108, 195, 29);
		panel.add(textField_End);
		
		JButton btnDone = new JButton("DONE");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDone.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		btnDone.setBounds(793, 530, 185, 47);
		panel.add(btnDone);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();

				}
			});
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		btnBack.setBounds(12, 530, 185, 47);
		panel.add(btnBack);
		
		JLabel lbl_Fee = new JLabel("Fee (RM)");
		lbl_Fee.setForeground(Color.CYAN);
		lbl_Fee.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lbl_Fee.setBounds(673, 149, 110, 29);
		panel.add(lbl_Fee);
		
		JLabel lbl_Fee1 = new JLabel("");
		double f1 = 1000000;
		double f2 = 2000000;
		double f3 = 5000000;
		String Fee = String.valueOf(f1);
		lbl_Fee1.setText((Fee) + "0"); 
		lbl_Fee1.setForeground(Color.CYAN);
		lbl_Fee1.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lbl_Fee1.setBounds(783, 150, 195, 29);
		panel.add(lbl_Fee1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 254, 966, 263);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 966, 263);
		panel_1.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Method", "Start", "End",
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_Method.setSelectedItem("Select method");
				textField_Description.setText("");
				textField_Start.setText("");
				textField_End.setText("");
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
		btnNewButton.setBounds(673, 203, 132, 36);
		panel.add(btnNewButton);
		
		JButton btnApply = new JButton("APPLY");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
								comboBox_Method.getSelectedItem(),
								textField_Start.getText(),
								textField_End.getText(),

				});
		
				if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
								JOptionPane.showMessageDialog(null, "Advertisement and Marketing has been set", null, JOptionPane.OK_OPTION, null);
					}
				}
				}
		});

		btnApply.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
		btnApply.setBounds(846, 205, 132, 36);
		panel.add(btnApply);
	}
}
