package Assignment3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class Home{

	JFrame frmProMotorsport;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmProMotorsport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProMotorsport = new JFrame();
		frmProMotorsport.setTitle("Pro MotorSport");
		frmProMotorsport.getContentPane().setBackground(new Color(224, 255, 255));
		frmProMotorsport.setBounds(100, 100, 867, 513);
		frmProMotorsport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProMotorsport.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(72, 61, 139));
		panel.setBounds(12, 13, 825, 65);
		frmProMotorsport.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_CompanyName = new JLabel("PRO MOTORSPORT ENTERPRISE");
		lbl_CompanyName.setForeground(new Color(0, 255, 255));
		lbl_CompanyName.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lbl_CompanyName.setBounds(238, 13, 385, 39);
		panel.add(lbl_CompanyName);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(72, 61, 139));
		panel_1.setBounds(12, 388, 825, 65);
		frmProMotorsport.getContentPane().add(panel_1);
		
		JButton btn_CompanyDetail = new JButton("ABOUT US");
		btn_CompanyDetail.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_CompanyDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CompanyDetail frame = new CompanyDetail();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
			}
		});
		btn_CompanyDetail.setBounds(12, 13, 180, 39);
		panel_1.add(btn_CompanyDetail);
		
		JButton btn_Register = new JButton("REGISTER");
		btn_Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterMenu frame = new RegisterMenu();
				frame.setModalExclusionType(null);
	            frame.setVisible(true);
			}
		});
		btn_Register.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_Register.setBounds(233, 13, 169, 39);
		panel_1.add(btn_Register);
		
		JButton btn_Login = new JButton("LOGIN");
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login frame = new Login();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
			}
		});
		btn_Login.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_Login.setBounds(439, 13, 169, 39);
		panel_1.add(btn_Login);
		
		JButton btn_Exit = new JButton("EXIT");
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (JOptionPane.showConfirmDialog(frmProMotorsport, "Confirm if you want to exit", "Membership Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btn_Exit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_Exit.setBounds(644, 13, 169, 39);
		panel_1.add(btn_Exit);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(72, 61, 139));
		panel_1_1.setBounds(12, 91, 825, 284);
		frmProMotorsport.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JEditorPane dtrpnEntry = new JEditorPane();
		dtrpnEntry.setBackground(new Color(0, 139, 139));
		dtrpnEntry.setForeground(new Color(255, 248, 220));
		dtrpnEntry.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		dtrpnEntry.setText("!! 2021 Entry Announcement !!\r\nFeathers Motorsport announce their full season GTH entry into the GT Cup Championship with drivers James Guess and James Hilliard for 2021.\r\nThe team spent 2019 testing and learning their car before competing in a round with us at Donington in September.  They enjoyed it so much the choice of championship   for 2021 was never in question!\r\nSimon Rose, Team Manager said 'Feathers Motor Sport is a relatively new small team. Nonetheless, the team loves a challenge, so we cannot wait for the season to start'");
		dtrpnEntry.setBounds(0, 0, 825, 284);
		panel_1_1.add(dtrpnEntry);
	}
}
