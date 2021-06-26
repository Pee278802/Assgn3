package Assignment3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeManagement extends JFrame{

	private JFrame frame;
	private JTextField textField_Name;
	private JTextField textField_ContractNo;
	private JTextField textField_ICNo;
	private JTextField textField_Position;
	private JTextField textField_Salary;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeManagement window = new EmployeeManagement();
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
	public EmployeeManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1138, 606);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1120, 559);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmployeeManagement = new JLabel("Employee Management");
		lblEmployeeManagement.setForeground(new Color(175, 238, 238));
		lblEmployeeManagement.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
		lblEmployeeManagement.setBounds(408, 13, 354, 57);
		panel.add(lblEmployeeManagement);
		
		JLabel lbl_Name = new JLabel("NAME");
		lbl_Name.setForeground(new Color(176, 224, 230));
		lbl_Name.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_Name.setBounds(12, 90, 133, 31);
		panel.add(lbl_Name);
		
		JLabel lbl_IC = new JLabel("CONTRACT NO");
		lbl_IC.setForeground(new Color(176, 224, 230));
		lbl_IC.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_IC.setBounds(12, 134, 133, 31);
		panel.add(lbl_IC);
		
		JLabel lbl_Name_2 = new JLabel("IC NO");
		lbl_Name_2.setForeground(new Color(176, 224, 230));
		lbl_Name_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_Name_2.setBounds(12, 178, 133, 31);
		panel.add(lbl_Name_2);
		
		JLabel lbl_Position = new JLabel("POSITION");
		lbl_Position.setForeground(new Color(176, 224, 230));
		lbl_Position.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_Position.setBounds(12, 222, 133, 31);
		panel.add(lbl_Position);
		
		JLabel lbl_Salary = new JLabel("SALARY (RM)");
		lbl_Salary.setForeground(new Color(176, 224, 230));
		lbl_Salary.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_Salary.setBounds(12, 266, 133, 31);
		panel.add(lbl_Salary);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(169, 92, 279, 31);
		panel.add(textField_Name);
		textField_Name.setColumns(10);
		
		textField_ContractNo = new JTextField();
		textField_ContractNo.setColumns(10);
		textField_ContractNo.setBounds(169, 136, 279, 31);
		panel.add(textField_ContractNo);
		
		textField_ICNo = new JTextField();
		textField_ICNo.setColumns(10);
		textField_ICNo.setBounds(169, 178, 279, 31);
		panel.add(textField_ICNo);
		
		textField_Position = new JTextField();
		textField_Position.setColumns(10);
		textField_Position.setBounds(169, 222, 279, 31);
		panel.add(textField_Position);
		
		textField_Salary = new JTextField();
		textField_Salary.setColumns(10);
		textField_Salary.setBounds(169, 266, 279, 31);
		panel.add(textField_Salary);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(474, 83, 634, 463);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Contract No", "IC No", "Position", "Salary"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btn_Add = new JButton("ADD");
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
								textField_Name.getText(),
								textField_ContractNo.getText(),
								textField_ICNo.getText(),
								textField_Position.getText(),
								textField_Salary.getText(),
				});
		
				if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
								JOptionPane.showMessageDialog(null, "Employee Update Confirmed", "Employee Management System",
												JOptionPane.OK_OPTION);
					}
				}
				}
		});
		btn_Add.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn_Add.setBounds(12, 328, 133, 36);
		panel.add(btn_Add);
		
		JButton btn_Reset = new JButton("RESET");
		btn_Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								textField_Name.setText("");
								textField_ContractNo.setText("");
								textField_ICNo.setText("");
								textField_Position.setText("");
								textField_Salary.setText("");
			}
		});
		btn_Reset.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn_Reset.setBounds(192, 328, 133, 36);
		panel.add(btn_Reset);
		
		JButton btn_Search = new JButton("SEARCH");
		btn_Search.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn_Search.setBounds(192, 402, 133, 36);
		panel.add(btn_Search);
		
		JButton btn_Back = new JButton("BACK");
		btn_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Employee Registration System",
								JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});

		btn_Back.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn_Back.setBounds(12, 482, 133, 36);
		panel.add(btn_Back);
		
		JButton btn_Delete = new JButton("DELETE");
		btn_Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if (table.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "No data to delete",
									"Employee Management System", JOptionPane.OK_OPTION);
				} else if(table.getSelectedRow() != -1) {
		               // remove selected row from the model
		               model.removeRow(table.getSelectedRow());
		               JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
				}else {
					JOptionPane.showMessageDialog(null, "Select a row to delete",
							"Membership Management System", JOptionPane.OK_OPTION);
				}
			}
		});
		btn_Delete.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn_Delete.setBounds(12, 402, 133, 36);
		panel.add(btn_Delete);
	}

}
