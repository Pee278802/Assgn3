package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class CustomerLogin extends JFrame {

	private JPanel contentPane;
	private JTextField UserNameTextField;
	private JTextField PasswordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLogin frame = new CustomerLogin();
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
	public CustomerLogin() {
		setForeground(Color.BLUE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\AZMAN 2021\\KELAS A202\\STIA1123 C\\EXERCISES\\GUI Registration System\\src\\registration_system\\uum.png"));
		setTitle("Pro MotorSport");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 759, 600); //set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) SystemColor.windowText));
		panel.setBounds(0, 11, 729, 529);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) SystemColor.textHighlight));
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(23, 26, 699, 65);
		panel.add(panel_1);
		
		JLabel EmployeeLogin = new JLabel("Customer Login");
		EmployeeLogin.setFont(new Font("Verdana", Font.BOLD, 35));
		EmployeeLogin.setBounds(182, 13, 323, 39);
		panel_1.add(EmployeeLogin);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(178, 34, 34)));
		panel_1_2.setBackground(new Color(119, 136, 153));
		panel_1_2.setBounds(82, 158, 214, 53);
		panel.add(panel_1_2);
		
		JLabel UserNameLabel = new JLabel("User Name");
		UserNameLabel.setForeground(new Color(127, 255, 0));
		UserNameLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		UserNameLabel.setBounds(51, 11, 125, 31);
		panel_1_2.add(UserNameLabel);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(178, 34, 34)));
		panel_1_3.setBackground(new Color(119, 136, 153));
		panel_1_3.setBounds(82, 240, 214, 53);
		panel.add(panel_1_3);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setForeground(new Color(127, 255, 0));
		PasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		PasswordLabel.setBounds(57, 11, 115, 31);
		panel_1_3.add(PasswordLabel);
		
		UserNameTextField = new JTextField();
		UserNameTextField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		UserNameTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "Lengzai";
				UserNameTextField.setText(userName);
			}
		});
		UserNameTextField.setBounds(348, 158, 357, 53);
		panel.add(UserNameTextField);
		UserNameTextField.setColumns(10);
		
		PasswordTextField = new JTextField();
		PasswordTextField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		PasswordTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userPswd = "aby123";
				PasswordTextField.setText(userPswd);
			}
		});
		PasswordTextField.setColumns(10);
		PasswordTextField.setBounds(348, 240, 357, 53);
		panel.add(PasswordTextField);
		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(UserNameTextField.getText().equals("Lengzai") && PasswordTextField.getText().equals("123abc")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");
						
						//RegistrationSystem RegSys = new RegistrationSystem(); //calling another frame/window
							Home frame = new Home();
							frame.setModalExclusionType(null);
				            frame.setVisible(true);
				            dispose(); //login frame will disappear
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right username and password");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right username and password");
				}
			}
		});
		LoginButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		LoginButton.setBounds(397, 374, 187, 53);
		panel.add(LoginButton);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserNameTextField.setText("");
				PasswordTextField.setText("");
			}
		});
		ResetButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		ResetButton.setBounds(109, 374, 187, 53);
		panel.add(ResetButton);
		
		JButton BackButton = new JButton("BACK");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CustomerRegisterMenu frame = new CustomerRegisterMenu();
				frame.setVisible(true);
			}
		});
		BackButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		BackButton.setBounds(250, 463, 187, 30);
		panel.add(BackButton);
	}
}
