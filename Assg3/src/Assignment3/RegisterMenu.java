package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterMenu extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterMenu frame = new RegisterMenu();
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
	public RegisterMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 102, 255));
		panel.setBounds(0, 0, 438, 253);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAdmin = new JButton("EMPLOYEE");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeRegistrationSystem frame = new EmployeeRegistrationSystem();
				frame.setVisible(true);
				dispose();
			}
		});
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnAdmin.setBounds(12, 79, 183, 56);
		panel.add(btnAdmin);
		
		JButton btnContestant = new JButton("CUSTOMER");
		btnContestant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistrationSystem frame = new CustomerRegistrationSystem();
				frame.setVisible(true);
				dispose();
			}
		});
		btnContestant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnContestant.setBounds(237, 79, 183, 56);
		panel.add(btnContestant);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnBack.setBounds(147, 181, 141, 41);
		panel.add(btnBack);

	}
}
