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

public class CompanyDetail extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyDetail frame = new CompanyDetail();
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
	public CompanyDetail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 860, 612);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 139)));
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(22, 11, 826, 47);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("COMPANY DETAIL");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(344, 13, 207, 25);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 139)));
		panel_2.setBackground(new Color(135, 206, 235));
		panel_2.setBounds(22, 83, 826, 445);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbl_CompanyName = new JLabel("Company Name");
		lbl_CompanyName.setForeground(Color.BLUE);
		lbl_CompanyName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lbl_CompanyName.setBounds(12, 17, 113, 24);
		panel_2.add(lbl_CompanyName);
		
		JLabel lbl_CompanyLocation = new JLabel("Location");
		lbl_CompanyLocation.setForeground(Color.BLUE);
		lbl_CompanyLocation.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_CompanyLocation.setBounds(12, 60, 113, 24);
		panel_2.add(lbl_CompanyLocation);
		
		JLabel lbl_CompanyRequirement = new JLabel("Requirement");
		lbl_CompanyRequirement.setForeground(Color.BLUE);
		lbl_CompanyRequirement.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_CompanyRequirement.setBounds(12, 142, 113, 24);
		panel_2.add(lbl_CompanyRequirement);
		
		JLabel lbl_CompanyBusinessHours = new JLabel("Business Hours");
		lbl_CompanyBusinessHours.setForeground(Color.BLUE);
		lbl_CompanyBusinessHours.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_CompanyBusinessHours.setBounds(12, 226, 113, 24);
		panel_2.add(lbl_CompanyBusinessHours);
		
		JLabel lblName = new JLabel(": Pro MotorSport Enterprise");
		lblName.setForeground(Color.BLUE);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(144, 17, 318, 24);
		panel_2.add(lblName);
		
		JLabel lbl_Location = new JLabel(": 1760 Permatang Tinggi");
		lbl_Location.setForeground(Color.BLUE);
		lbl_Location.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_Location.setBounds(144, 64, 318, 24);
		panel_2.add(lbl_Location);
		
		JLabel lbl_Location1 = new JLabel("  Simpang Ampat");
		lbl_Location1.setForeground(Color.BLUE);
		lbl_Location1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_Location1.setBounds(144, 91, 318, 24);
		panel_2.add(lbl_Location1);
		
		JLabel lbl_location2 = new JLabel("  30300 Kedah");
		lbl_location2.setForeground(Color.BLUE);
		lbl_location2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_location2.setBounds(144, 120, 318, 24);
		panel_2.add(lbl_location2);
		
		JLabel lbl_Requirement = new JLabel(": 1. Possess a NATION COMPETITION LICENSE");
		lbl_Requirement.setForeground(Color.BLUE);
		lbl_Requirement.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_Requirement.setBounds(144, 146, 348, 24);
		panel_2.add(lbl_Requirement);
		
		JLabel lbl_Requirement1 = new JLabel("  2. Good Healt Situation");
		lbl_Requirement1.setForeground(Color.BLUE);
		lbl_Requirement1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_Requirement1.setBounds(144, 171, 348, 24);
		panel_2.add(lbl_Requirement1);
		
		JLabel lbl_BusinessHours = new JLabel(": MON 10A.M. - 9P.M.");
		lbl_BusinessHours.setForeground(Color.BLUE);
		lbl_BusinessHours.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_BusinessHours.setBounds(144, 226, 318, 24);
		panel_2.add(lbl_BusinessHours);
		
		JLabel lbl_BusinessHours1 = new JLabel("  TUE 10A.M. - 9P.M.");
		lbl_BusinessHours1.setForeground(Color.BLUE);
		lbl_BusinessHours1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_BusinessHours1.setBounds(144, 250, 318, 24);
		panel_2.add(lbl_BusinessHours1);
		
		JLabel lbl_BusinessHours2 = new JLabel("  WED 10A.M. - 9P.M.");
		lbl_BusinessHours2.setForeground(Color.BLUE);
		lbl_BusinessHours2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_BusinessHours2.setBounds(144, 271, 318, 24);
		panel_2.add(lbl_BusinessHours2);
		
		JLabel lbl_BusinessHours3 = new JLabel("  THU 10A.M. - 9P.M.");
		lbl_BusinessHours3.setForeground(Color.BLUE);
		lbl_BusinessHours3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_BusinessHours3.setBounds(144, 296, 318, 24);
		panel_2.add(lbl_BusinessHours3);
		
		JLabel lbl_BusinessHours4 = new JLabel("  FRI 10A.M. - 9P.M.");
		lbl_BusinessHours4.setForeground(Color.BLUE);
		lbl_BusinessHours4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_BusinessHours4.setBounds(144, 321, 318, 24);
		panel_2.add(lbl_BusinessHours4);
		
		JLabel lbl_RacingType = new JLabel("Racing Type");
		lbl_RacingType.setForeground(Color.BLUE);
		lbl_RacingType.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_RacingType.setBounds(12, 357, 113, 24);
		panel_2.add(lbl_RacingType);
		
		JLabel lbl_type1 = new JLabel(": Formula Racing");
		lbl_type1.setForeground(Color.BLUE);
		lbl_type1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_type1.setBounds(144, 358, 318, 24);
		panel_2.add(lbl_type1);
		
		JLabel lbl_type2 = new JLabel("  Sports car racing");
		lbl_type2.setForeground(Color.BLUE);
		lbl_type2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_type2.setBounds(144, 378, 318, 24);
		panel_2.add(lbl_type2);
		
		JLabel lbl_type3 = new JLabel("  Stock car racing");
		lbl_type3.setForeground(Color.BLUE);
		lbl_type3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_type3.setBounds(144, 395, 318, 24);
		panel_2.add(lbl_type3);
		
		JLabel lbl_type4 = new JLabel("  Drag car racing");
		lbl_type4.setForeground(Color.BLUE);
		lbl_type4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_type4.setBounds(144, 415, 318, 24);
		panel_2.add(lbl_type4);
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setIcon(new ImageIcon("C:\\Users\\raymo\\OneDrive\\Desktop\\16518.jpg"));
		lbl_Background.setBounds(12, 8, 802, 431);
		panel_2.add(lbl_Background);
		
		JLabel lbl_CompanyRequirement_1 = new JLabel("Founded");
		lbl_CompanyRequirement_1.setForeground(Color.BLUE);
		lbl_CompanyRequirement_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_CompanyRequirement_1.setBounds(12, 189, 113, 24);
		panel_2.add(lbl_CompanyRequirement_1);
		
		JLabel lbl_Requirement_1 = new JLabel(": 20 May 2019");
		lbl_Requirement_1.setForeground(Color.BLUE);
		lbl_Requirement_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl_Requirement_1.setBounds(144, 193, 348, 24);
		panel_2.add(lbl_Requirement_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 139)));
		panel_1_1.setBackground(new Color(135, 206, 250));
		panel_1_1.setBounds(22, 555, 826, 47);
		panel.add(panel_1_1);
		
		JButton btn_Back = new JButton("BACK");
		btn_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btn_Back.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn_Back.setBounds(12, 13, 106, 25);
		panel_1_1.add(btn_Back);

	}
}
