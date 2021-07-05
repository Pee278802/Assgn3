package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class ContestantRegistrationSystem extends JFrame {

	private JPanel contentPane;
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
					ContestantRegistrationSystem frame = new ContestantRegistrationSystem();
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
	public ContestantRegistrationSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1302, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(128, 0, 0));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(32, 178, 170)));
		panel.setBackground(new Color(255, 250, 205));
		panel.setBounds(12, 13, 1263, 75);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblRegistration = new JLabel("Contestant Registration System");
		lblRegistration.setFont(new Font("Verdana", Font.BOLD, 25));
		lblRegistration.setBounds(377, 13, 509, 49);
		panel.add(lblRegistration);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(128, 0, 0));
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 50, 204)));
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(12, 91, 1263, 610);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblName.setBounds(40, 29, 114, 25);
		panel_1.add(lblName);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO");
		lblMobileNo.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblMobileNo.setBounds(40, 67, 114, 25);
		panel_1.add(lblMobileNo);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblGender.setBounds(40, 105, 114, 25);
		panel_1.add(lblGender);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(164, 29, 319, 28);
		panel_1.add(textField_Name);
		textField_Name.setColumns(10);
		
		textField_MobileNo = new JTextField();
		textField_MobileNo.setColumns(10);
		textField_MobileNo.setBounds(164, 67, 319, 28);
		panel_1.add(textField_MobileNo);
		
		JLabel lblIC = new JLabel("IC No");
		lblIC.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblIC.setBounds(40, 143, 114, 25);
		panel_1.add(lblIC);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblAddress.setBounds(40, 181, 114, 25);
		panel_1.add(lblAddress);
		
		JComboBox comboBox_Gender = new JComboBox();
		comboBox_Gender.setModel(new DefaultComboBoxModel(new String[] {"Select gender", "Male", "Female"}));
		comboBox_Gender.setBounds(164, 108, 131, 22);
		panel_1.add(comboBox_Gender);
		
		JCheckBox chckbx_TermAndConditions = new JCheckBox("Accept Term And Conditions.");
		chckbx_TermAndConditions.setBounds(40, 447, 195, 25);
		panel_1.add(chckbx_TermAndConditions);
		
		JTextPane textPane_Address = new JTextPane();
		textPane_Address.setBounds(164, 184, 319, 105);
		panel_1.add(textPane_Address);
		
		JLabel lblRacingType = new JLabel("RACING TYPE");
		lblRacingType.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblRacingType.setBounds(40, 302, 114, 25);
		panel_1.add(lblRacingType);
		
		JLabel lbl_Fee = new JLabel("FEE(RM)");
		lbl_Fee.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lbl_Fee.setBounds(40, 382, 114, 25);
		panel_1.add(lbl_Fee);
		
		JLabel lbl_Fee1 = new JLabel("");
		lbl_Fee1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lbl_Fee1.setBounds(164, 384, 187, 25);
		panel_1.add(lbl_Fee1);
		
		JComboBox comboBox_RacingType = new JComboBox();
		comboBox_RacingType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//int Fee = comboBox_RacingType.getSelectedIndex();
				if (comboBox_RacingType.getSelectedIndex() == 1) {
					lbl_Fee1.setText("250000");
				} else if
				(comboBox_RacingType.getSelectedIndex() == 1) {
					lbl_Fee1.setText("430000");
				} else if 
				(comboBox_RacingType.getSelectedIndex() == 1) {
					lbl_Fee1.setText("210000");
				} else {
					lbl_Fee1.setText("1450000");
				}
			}
		});
		comboBox_RacingType.setModel(new DefaultComboBoxModel(new String[] {"Select Racing Type", "Formula Racing", "Sport Car Racing", "Stock Car Racing", "Drag Car Racing"}));
		comboBox_RacingType.setBounds(164, 302, 187, 28);
		panel_1.add(comboBox_RacingType);
		
		JLabel lbl_CarProvided = new JLabel("CAR PROVIDED");
		lbl_CarProvided.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lbl_CarProvided.setBounds(40, 344, 114, 25);
		panel_1.add(lbl_CarProvided);
		
		
		JComboBox comboBox_CarProvided = new JComboBox();
		comboBox_CarProvided.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox_RacingType.getSelectedIndex() == 1) {
					comboBox_CarProvided.setModel(new DefaultComboBoxModel(new String[] {"Select Car", "Alfa Romeo Ferrari C39 (Formula)", "Renault RS20 (Formula)", "Racing Point BWT Mercedes RP20 (Formula)"	}));
				}else if (comboBox_RacingType.getSelectedIndex() == 2) {
					comboBox_CarProvided.setModel(new DefaultComboBoxModel(new String[] {"Williams Mercedes FW43 (Sport)", "Porsche 911 (Sport)", "Alpine A110 (Sport)", "Porsche 718 Boxster/Cayman (Sport)", "McLaren 570S (Sport)"}));
				}else if (comboBox_RacingType.getSelectedIndex() == 3) {
					comboBox_CarProvided.setModel(new DefaultComboBoxModel(new String[] {"Declasse Burger Shot Stallion (Stock)", "Bravado Redwood Gauntlet (Stock)", "Vapid Pisswasser Dominator (Stock)", "Bravado Sprunk Buffalo (Stock)"}));
				}else {
					comboBox_CarProvided.setModel(new DefaultComboBoxModel(new String[] {"Chevrolet Camaro ZL1 (Drag)", "Buick Grand National GNX (Drag)", "Chevrolet Corvette C7 Z06 (Drag)", "Mustang GT500 (Drag)", "Chevrolet Nova (Drag)"}));
				}
				comboBox_CarProvided.setBounds(164, 343, 187, 28);
				panel_1.add(comboBox_CarProvided);
		}});
;
				
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField_Name.setText("");
					textField_MobileNo.setText("");
					textField_ICNo.setText("");
					comboBox_Gender.setSelectedItem("Select gender");
					textPane_Address.setText("");
					lbl_Fee1.setText("");
			}
		});
		btnReset.setBounds(40, 494, 165, 37);
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
								comboBox_Gender.getSelectedItem(),
								textField_ICNo.getText(),
								textPane_Address.getText(),
								lbl_Fee1.getText(),
						});
						
					}else {
						
						JOptionPane.showMessageDialog(null, "Please accept the terms & conditions.");
					}
		}else if (e.getSource() == btnReset) {
	};
			}});
			
		btnSubmit.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnSubmit.setBounds(272, 544, 165, 37);
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
		btnBack.setBounds(40, 544, 165, 37);
		panel_1.add(btnBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(519, 24, 732, 482);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "MOBILE NO", "GENDER", "IC NO", "ADDRESS", "FEE"
			}
		));
		scrollPane.setViewportView(table);
		
		textField_ICNo = new JTextField();
		textField_ICNo.setColumns(10);
		textField_ICNo.setBounds(164, 143, 319, 28);
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
		btn_Refund.setBounds(272, 494, 165, 37);
		panel_1.add(btn_Refund);
		
		
		
		


	}

}
