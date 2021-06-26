package Assignment3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 706, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 255)));
		panel.setBounds(0, 0, 688, 486);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLoginAs = new JLabel("Login as:");
		lblLoginAs.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblLoginAs.setBounds(12, 13, 171, 41);
		panel.add(lblLoginAs);
		
		JButton btnEmployee = new JButton("EMPLOYEE");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
			}
		});
		btnEmployee.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		btnEmployee.setBounds(91, 161, 194, 67);
		panel.add(btnEmployee);
		
		JButton btnCustomer = new JButton("CUSTOMER");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer frame = new Customer();
				frame.setVisible(true);
			}
		});
		btnCustomer.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		btnCustomer.setBounds(406, 161, 194, 67);
		panel.add(btnCustomer);
		
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
		btnBack.setBounds(12, 432, 127, 41);
		panel.add(btnBack);
	}

}
