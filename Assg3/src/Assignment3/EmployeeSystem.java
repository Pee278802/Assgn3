package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeSystem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeSystem frame = new EmployeeSystem();
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
	public EmployeeSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 801, 402);
		contentPane.add(panel);
		
		JLabel lblEmployeeInfomation = new JLabel("Employee Information");
		lblEmployeeInfomation.setForeground(new Color(175, 238, 238));
		lblEmployeeInfomation.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
		lblEmployeeInfomation.setBounds(226, 13, 354, 57);
		panel.add(lblEmployeeInfomation);
		
		JLabel lbl_Name = new JLabel("NAME");
		lbl_Name.setForeground(new Color(176, 224, 230));
		lbl_Name.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_Name.setBounds(12, 90, 133, 31);
		panel.add(lbl_Name);
		
		JLabel lbl_ContactNo = new JLabel("CONTRACT NO");
		lbl_ContactNo.setForeground(new Color(176, 224, 230));
		lbl_ContactNo.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ContactNo.setBounds(12, 134, 133, 31);
		panel.add(lbl_ContactNo);
		
		JLabel lbl_ICNo = new JLabel("IC NO");
		lbl_ICNo.setForeground(new Color(176, 224, 230));
		lbl_ICNo.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ICNo.setBounds(12, 178, 133, 31);
		panel.add(lbl_ICNo);
		
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(585, 90, 175, 191);
		panel.add(lblNewLabel);
		
		JButton btnEmployeeManagement = new JButton("Employee Management");
		btnEmployeeManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeManagement frame = new EmployeeManagement();
				frame.setVisible(true);
				dispose();
			}
		});
		btnEmployeeManagement.setBounds(12, 342, 267, 40);
		panel.add(btnEmployeeManagement);
		btnEmployeeManagement.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
				frame.setVisible(true);
				dispose();
			}
		});
		btnFinance.setBounds(291, 342, 180, 40);
		panel.add(btnFinance);
		btnFinance.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		
		JButton btnNewButton_1_1 = new JButton("Log out");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Confirm if you want to log out", "Customer System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					EmployeeLogin frame = new EmployeeLogin();
					frame.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton_1_1.setBounds(674, 342, 115, 40);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lbl_Name_1 = new JLabel("Lengzai");
		lbl_Name_1.setForeground(new Color(176, 224, 230));
		lbl_Name_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_Name_1.setBounds(200, 90, 187, 31);
		panel.add(lbl_Name_1);
		
		JLabel lbl_ContactNo_1 = new JLabel("011-1233123123");
		lbl_ContactNo_1.setForeground(new Color(176, 224, 230));
		lbl_ContactNo_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ContactNo_1.setBounds(200, 134, 205, 31);
		panel.add(lbl_ContactNo_1);
		
		JLabel lbl_ICNo_1 = new JLabel("001223-04-2313");
		lbl_ICNo_1.setForeground(new Color(176, 224, 230));
		lbl_ICNo_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ICNo_1.setBounds(200, 178, 187, 31);
		panel.add(lbl_ICNo_1);
		
		JLabel lbl_Position_1 = new JLabel("Clerk");
		lbl_Position_1.setForeground(new Color(176, 224, 230));
		lbl_Position_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_Position_1.setBounds(200, 222, 133, 31);
		panel.add(lbl_Position_1);
		
		JLabel lbl_Salary_1 = new JLabel("2000.00");
		lbl_Salary_1.setForeground(new Color(176, 224, 230));
		lbl_Salary_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_Salary_1.setBounds(200, 266, 133, 31);
		panel.add(lbl_Salary_1);
		
		JButton btnAdvertisment = new JButton("Advertisment");
		btnAdvertisment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementAndMarketing window = new AdvertisementAndMarketing();
				window.setVisible(true);
				dispose();
			}
		});
		btnAdvertisment.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		btnAdvertisment.setBounds(483, 342, 180, 40);
		panel.add(btnAdvertisment);
	}
}
