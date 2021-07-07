package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class EmployeeRegistrationSystem extends JFrame{

	private JPanel contentPane;
	private JTextField textField_Name;
	private JTextField textField_MobileNo;
	private JTable table;
	private JTextField textField_ICNo;
	private JTextField textField_Username;
	private JTextField textField_Password;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeRegistrationSystem frame = new EmployeeRegistrationSystem();
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
	public EmployeeRegistrationSystem() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1302, 759);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setForeground(new Color(128, 0, 0));
			panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(32, 178, 170)));
			panel.setBackground(Color.BLUE);
			panel.setBounds(12, 13, 1263, 75);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblRegistration = new JLabel("EMPLOYEE REGISTRATION SYSTEM");
			lblRegistration.setFont(new Font("Verdana", Font.BOLD, 25));
			lblRegistration.setBounds(377, 13, 504, 49);
			panel.add(lblRegistration);
			
			JPanel panel_1 = new JPanel();
			panel_1.setForeground(new Color(128, 0, 0));
			panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 50, 204)));
			panel_1.setBackground(Color.BLUE);
			panel_1.setBounds(12, 91, 1263, 608);
			getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblName = new JLabel("NAME");
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
			
			JLabel lblIC = new JLabel("IC NO");
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
			chckbx_TermAndConditions.setBounds(28, 436, 195, 25);
			panel_1.add(chckbx_TermAndConditions);
			
			JTextPane textPane_Address = new JTextPane();
			textPane_Address.setBounds(164, 235, 319, 105);
			panel_1.add(textPane_Address);
			
			JButton btnReset = new JButton("RESET");
			btnReset.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						textField_Name.setText("");
						textField_MobileNo.setText("");
						textField_ICNo.setText("");
						comboBox_Gender.setSelectedItem("Select gender");
						textPane_Address.setText("");
						textField_Username.setText(" ");		
				}
			});
			btnReset.setBounds(40, 496, 165, 37);
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
									textField_Username.getText(),
							});
							
						}else {
							
							JOptionPane.showMessageDialog(null, "Please accept the terms & conditions.");
						}
			}else if (e.getSource() == btnReset) {
		};

				}});
				
			btnSubmit.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btnSubmit.setBounds(272, 558, 165, 37);
			panel_1.add(btnSubmit);
			
			JButton btnBack = new JButton("BACK");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					RegisterMenu frame = new RegisterMenu();
					frame.setVisible(true);
					dispose();
				}
			});
			btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btnBack.setBounds(40, 558, 165, 37);
			panel_1.add(btnBack);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(519, 24, 732, 524);
			panel_1.add(scrollPane);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"NAME", "MOBILE NO", "GENDER", "IC No", "ADDRESS", "USERNAME"
				}
			));
			scrollPane.setViewportView(table);
			
			textField_ICNo = new JTextField();
			textField_ICNo.setColumns(10);
			textField_ICNo.setBounds(164, 197, 319, 28);
			panel_1.add(textField_ICNo);
			
			JButton btn_Delete = new JButton("DELETE");
			btn_Delete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					if (table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No data can be deleted",
										"Membership Management System", JOptionPane.OK_OPTION);
					} else if(table.getSelectedRow() != -1) {
			               // remove selected row from the model
			               model.removeRow(table.getSelectedRow());
			               JOptionPane.showMessageDialog(null, "Deleted successfully");
					}else {
						JOptionPane.showMessageDialog(null, "Please select a data to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}
				}
			});
			btn_Delete.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btn_Delete.setBounds(272, 496, 165, 37);
			panel_1.add(btn_Delete);
			
			JLabel lblUsername = new JLabel("USERNAME");
			lblUsername.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			lblUsername.setBounds(40, 354, 114, 25);
			panel_1.add(lblUsername);
			
			JLabel lblPassword = new JLabel("PASSWORD");
			lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			lblPassword.setBounds(40, 402, 114, 25);
			panel_1.add(lblPassword);
			
			textField_Username = new JTextField();
			textField_Username.setColumns(10);
			textField_Username.setBounds(164, 354, 319, 28);
			panel_1.add(textField_Username);
			
			textField_Password = new JTextField();
			textField_Password.setColumns(10);
			textField_Password.setBounds(164, 402, 319, 28);
			panel_1.add(textField_Password);
			
			JButton btnUpload = new JButton("UPLOAD");
			btnUpload.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
					File f = new File("C:\\Users\\raymo\\OneDrive\\Desktop\\Sem 2\\Programming 2\\Project\\Employee.txt");
					if(!f.exists()) {
						f.createNewFile();
						}
					FileWriter fw = new FileWriter(f.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			btnUpload.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btnUpload.setBounds(1086, 558, 165, 37);
			panel_1.add(btnUpload);

			

			

			

		}
	}

