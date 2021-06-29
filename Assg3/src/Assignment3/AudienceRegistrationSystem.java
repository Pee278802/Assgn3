package Assignment3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;

public class AudienceRegistrationSystem extends JFrame{

	JFrame frame;
	private JTextField textField_Name;
	private JTextField textField_MobileNo;
	private JTable table;
	private JTextField textField_ICNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AudienceRegistrationSystem window = new AudienceRegistrationSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AudienceRegistrationSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1305, 685);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(128, 0, 0));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(32, 178, 170)));
		panel.setBackground(new Color(255, 250, 205));
		panel.setBounds(12, 13, 1263, 75);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblRegistration = new JLabel("Audience Registration System");
		lblRegistration.setFont(new Font("Verdana", Font.BOLD, 25));
		lblRegistration.setBounds(377, 13, 433, 49);
		panel.add(lblRegistration);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(128, 0, 0));
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 50, 204)));
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(12, 91, 1263, 534);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblName.setBounds(40, 29, 114, 25);
		panel_1.add(lblName);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO");
		lblMobileNo.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblMobileNo.setBounds(40, 94, 114, 25);
		panel_1.add(lblMobileNo);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblGender.setBounds(40, 146, 114, 25);
		panel_1.add(lblGender);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(164, 29, 319, 28);
		panel_1.add(textField_Name);
		textField_Name.setColumns(10);
		
		textField_MobileNo = new JTextField();
		textField_MobileNo.setColumns(10);
		textField_MobileNo.setBounds(166, 91, 319, 28);
		panel_1.add(textField_MobileNo);
		
		JLabel lblIC = new JLabel("IC No");
		lblIC.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblIC.setBounds(40, 197, 114, 25);
		panel_1.add(lblIC);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblAddress.setBounds(40, 235, 114, 25);
		panel_1.add(lblAddress);
		
		JComboBox comboBox_Gender = new JComboBox();
		comboBox_Gender.setModel(new DefaultComboBoxModel(new String[] {"Select gender", "Male", "Female"}));
		comboBox_Gender.setBounds(166, 149, 131, 22);
		panel_1.add(comboBox_Gender);
		
		JCheckBox chckbx_TermAndConditions = new JCheckBox("Accept Term And Conditions.");
		chckbx_TermAndConditions.setBounds(40, 398, 195, 25);
		panel_1.add(chckbx_TermAndConditions);
		
		JTextPane textPane_Address = new JTextPane();
		textPane_Address.setBounds(164, 235, 319, 105);
		panel_1.add(textPane_Address);
		
		JLabel lblFee = new JLabel("FEE (RM)");
		lblFee.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblFee.setBounds(40, 352, 114, 25);
		panel_1.add(lblFee);
		
		JLabel lblFee_1 = new JLabel("");
		lblFee_1.setText(Integer.toString(499));
		lblFee_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblFee_1.setBounds(164, 353, 114, 25);
		panel_1.add(lblFee_1);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField_Name.setText("");
					textField_MobileNo.setText("");
					textField_ICNo.setText("");
					comboBox_Gender.setSelectedItem("Select gender");
					textPane_Address.setText("");
					lblFee_1.setText(" ");		
			}
		});
		btnReset.setBounds(40, 432, 165, 37);
		panel_1.add(btnReset);
		
		JButton btnSubmit = new JButton("SUBMIT");		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (e.getSource() == btnSubmit) {
					if (chckbx_TermAndConditions.isSelected()) {
						model.addRow(new Object[]{
								textField_Name.getText(),
								textField_MobileNo.getText(),
								textField_ICNo.getText(),
								comboBox_Gender.getSelectedItem(),
								textPane_Address.getText(),
								lblFee_1.getText(),
						});
						
					}else {
						
						JOptionPane.showMessageDialog(null, "Please accept the terms & conditions.");
					}
		}else if (e.getSource() == btnReset) {
	};
				

			

			}});
			
		btnSubmit.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSubmit.setBounds(272, 484, 165, 37);
		panel_1.add(btnSubmit);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				this.toBack();
				setVisible(false);
				new Home().toFront();
				new Home().setState(java.awt.Frame.NORMAL);
			}

			private void toBack() {
				// TODO Auto-generated method stub
				
			}
		});
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnBack.setBounds(40, 484, 165, 37);
		panel_1.add(btnBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(519, 24, 732, 482);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "MOBILE NO", "GENDER", "IC No", "ADDRESS", "FEE"
			}
		));
		scrollPane.setViewportView(table);
		
		textField_ICNo = new JTextField();
		textField_ICNo.setColumns(10);
		textField_ICNo.setBounds(164, 197, 319, 28);
		panel_1.add(textField_ICNo);
		
		JButton btn_Refund = new JButton("REFUND");
		btn_Refund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if (table.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "No data can be refunded",
									"Membership Management System", JOptionPane.OK_OPTION);
				} else if(table.getSelectedRow() != -1) {
		               // remove selected row from the model
		               model.removeRow(table.getSelectedRow());
		               JOptionPane.showMessageDialog(null, "Refund successfully");
				}else {
					JOptionPane.showMessageDialog(null, "Please select a data to refund",
							"Membership Management System", JOptionPane.OK_OPTION);
				}
			}
		});
		btn_Refund.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn_Refund.setBounds(272, 432, 165, 37);
		panel_1.add(btn_Refund);

		

		

		

	}
}
