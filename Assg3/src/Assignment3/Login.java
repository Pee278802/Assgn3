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

public class Login extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 255)));
		panel.setBounds(0, 0, 688, 486);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLoginAs = new JLabel("Login as:");
		lblLoginAs.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblLoginAs.setBounds(12, 13, 171, 41);
		panel.add(lblLoginAs);
		
		JButton btnEmployee = new JButton("EMPLOYEE");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeLogin frame = new EmployeeLogin();
				frame.setVisible(true);
			}
		});
		btnEmployee.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		btnEmployee.setBounds(91, 161, 194, 67);
		panel.add(btnEmployee);
		
		JButton btnCustomer = new JButton("CUSTOMER");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLogin frame = new CustomerLogin();
				frame.setVisible(true);
			}
		});
		btnCustomer.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		btnCustomer.setBounds(406, 161, 194, 67);
		panel.add(btnCustomer);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();

			}
		});
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnBack.setBounds(12, 432, 127, 41);
		panel.add(btnBack);
		
	}
}
