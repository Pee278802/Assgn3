package Assignment3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finance extends JFrame{

	private JFrame frame;
	private JTextField textField_totalRevenue;
	private JTextField textField_netIncome;
	private JTextField textField_totalSalary;
	private JTextField textField_totalExpense;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance window = new Finance();
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


	/**
	 * Initialize the contents of the frame.
	 */
	public Finance () {
		frame = new JFrame();
		frame.setBounds(100, 100, 757, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 239, 213));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 739, 465);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_Finance = new JLabel("FINANCE");
		lbl_Finance.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lbl_Finance.setBounds(288, 13, 176, 36);
		panel.add(lbl_Finance);
		
		JLabel lbl_TotalSalary = new JLabel("Total Salary (RM)");
		lbl_TotalSalary.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lbl_TotalSalary.setBounds(130, 147, 225, 36);
		panel.add(lbl_TotalSalary);
		
		JLabel lblTotalRevenue = new JLabel("Total Revenue (RM)");
		lblTotalRevenue.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblTotalRevenue.setBounds(130, 83, 225, 36);
		panel.add(lblTotalRevenue);
		
		JLabel lbl_TotalExpense = new JLabel("Total Expense (RM)");
		lbl_TotalExpense.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lbl_TotalExpense.setBounds(130, 215, 225, 36);
		panel.add(lbl_TotalExpense);
		
		JLabel lblTotalRevenue_1_2_1 = new JLabel("NET INCOME (RM)");
		lblTotalRevenue_1_2_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblTotalRevenue_1_2_1.setBounds(130, 337, 225, 36);
		panel.add(lblTotalRevenue_1_2_1);
		
		textField_totalRevenue = new JTextField();
		textField_totalRevenue.setBounds(365, 85, 225, 36);
		panel.add(textField_totalRevenue);
		textField_totalRevenue.setColumns(10);
		
		textField_netIncome = new JTextField();
		textField_netIncome.setColumns(10);
		textField_netIncome.setBounds(365, 341, 225, 36);
		panel.add(textField_netIncome);
		
		textField_totalSalary = new JTextField();
		textField_totalSalary.setColumns(10);
		textField_totalSalary.setBounds(367, 147, 225, 36);
		panel.add(textField_totalSalary);
		
		textField_totalExpense = new JTextField();
		textField_totalExpense.setColumns(10);
		textField_totalExpense.setBounds(367, 215, 225, 36);
		panel.add(textField_totalExpense);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int totalRevenue,totalSalary,totalExpense,netIncome;
				try {
					totalRevenue =Integer.parseInt(textField_totalRevenue.getText());
					totalSalary =Integer.parseInt(textField_totalSalary.getText());
					totalExpense =Integer.parseInt(textField_totalExpense.getText());
					netIncome = totalRevenue - totalSalary - totalExpense;
				}catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 22));
		btnNewButton.setBounds(258, 276, 152, 36);
		panel.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnBack.setBounds(12, 401, 165, 37);
		panel.add(btnBack);
	}
}
