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

public class CustomerSystem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerSystem frame = new CustomerSystem();
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
	public CustomerSystem() {
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
		
		JLabel lblEmployeeInfomation = new JLabel("Customer Information");
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(585, 90, 175, 191);
		panel.add(lblNewLabel);
		
		JLabel lbl_Name_1 = new JLabel("ShuaiGe");
		lbl_Name_1.setForeground(new Color(176, 224, 230));
		lbl_Name_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_Name_1.setBounds(200, 90, 187, 31);
		panel.add(lbl_Name_1);
		
		JLabel lbl_ContactNo_1 = new JLabel("012-11221114");
		lbl_ContactNo_1.setForeground(new Color(176, 224, 230));
		lbl_ContactNo_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ContactNo_1.setBounds(200, 134, 205, 31);
		panel.add(lbl_ContactNo_1);
		
		JLabel lbl_ICNo_1 = new JLabel("000412-02-0494");
		lbl_ICNo_1.setForeground(new Color(176, 224, 230));
		lbl_ICNo_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ICNo_1.setBounds(200, 178, 187, 31);
		panel.add(lbl_ICNo_1);
		
		JLabel lbl_ICNo_2 = new JLabel("GENDER");
		lbl_ICNo_2.setForeground(new Color(176, 224, 230));
		lbl_ICNo_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ICNo_2.setBounds(12, 222, 133, 31);
		panel.add(lbl_ICNo_2);
		
		JLabel lbl_ICNo_3 = new JLabel("RACING");
		lbl_ICNo_3.setForeground(new Color(176, 224, 230));
		lbl_ICNo_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ICNo_3.setBounds(12, 266, 133, 31);
		panel.add(lbl_ICNo_3);
		
		JLabel lbl_ICNo_4 = new JLabel("SITUATION");
		lbl_ICNo_4.setForeground(new Color(176, 224, 230));
		lbl_ICNo_4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ICNo_4.setBounds(12, 310, 133, 31);
		panel.add(lbl_ICNo_4);
		
		JLabel lbl_ICNo_1_1 = new JLabel("MALE");
		lbl_ICNo_1_1.setForeground(new Color(176, 224, 230));
		lbl_ICNo_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ICNo_1_1.setBounds(200, 222, 187, 31);
		panel.add(lbl_ICNo_1_1);
		
		JLabel lbl_ICNo_1_2 = new JLabel("SPORT CAR RACING");
		lbl_ICNo_1_2.setForeground(new Color(176, 224, 230));
		lbl_ICNo_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ICNo_1_2.setBounds(200, 266, 187, 31);
		panel.add(lbl_ICNo_1_2);
		
		JLabel lbl_ICNo_1_3 = new JLabel("GOOD");
		lbl_ICNo_1_3.setForeground(new Color(176, 224, 230));
		lbl_ICNo_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lbl_ICNo_1_3.setBounds(200, 310, 187, 31);
		panel.add(lbl_ICNo_1_3);
		
		JButton btnNewButton_1_1 = new JButton("Log out");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Confirm if you want to log out", "Customer System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					CustomerLogin frame = new CustomerLogin();
					frame.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1.setBounds(656, 349, 133, 40);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("REGISTER");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistrationSystem frame = new CustomerRegistrationSystem();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1_1.setBounds(472, 349, 147, 40);
		panel.add(btnNewButton_1_1_1);
	}
}
