package Assignment3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerRegisterMenu extends JFrame{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegisterMenu window = new CustomerRegisterMenu();
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
	public CustomerRegisterMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 102, 255));
		panel.setBounds(0, 0, 432, 253);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAudience = new JButton("AUDIENCE");
		btnAudience.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AudienceRegistrationSystem window = new AudienceRegistrationSystem();
				window.frame.setVisible(true);
			}
		});
		btnAudience.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnAudience.setBounds(12, 79, 183, 56);
		panel.add(btnAudience);
		
		JButton btnContestant = new JButton("CONTESTANT");
		btnContestant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContestantRegistrationSystem window = new ContestantRegistrationSystem();
				window.frame.setVisible(true);
			}
		});
		btnContestant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnContestant.setBounds(237, 79, 183, 56);
		panel.add(btnContestant);
	}
}
