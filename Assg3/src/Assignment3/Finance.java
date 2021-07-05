package Assignment3;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finance extends JFrame{

	private JPanel contentPane;
	private JTextField textField_totalRevenue;
	private JTextField textField_totalSalary;
	private JTextField textField_totalExpense;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 239, 213));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 739, 465);
		getContentPane().add(panel);
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
		
		JLabel lblNetIncome = new JLabel("NET INCOME (RM)");
		lblNetIncome.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblNetIncome.setBounds(130, 337, 225, 36);
		panel.add(lblNetIncome);
		
		textField_totalRevenue = new JTextField();
		textField_totalRevenue.setBounds(365, 85, 225, 36);
		panel.add(textField_totalRevenue);
		textField_totalRevenue.setColumns(10);
		
		textField_totalSalary = new JTextField();
		textField_totalSalary.setColumns(10);
		textField_totalSalary.setBounds(367, 147, 225, 36);
		panel.add(textField_totalSalary);
		
		textField_totalExpense = new JTextField();
		textField_totalExpense.setColumns(10);
		textField_totalExpense.setBounds(367, 215, 225, 36);
		panel.add(textField_totalExpense);
		
		JLabel lbl_NetIncome1 = new JLabel("");
		lbl_NetIncome1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lbl_NetIncome1.setBounds(367, 340, 225, 33);
		panel.add(lbl_NetIncome1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int totalRevenue,totalSalary,totalExpense,netIncome = 0;
				try {
					totalRevenue =Integer.parseInt(textField_totalRevenue.getText());
					totalSalary =Integer.parseInt(textField_totalSalary.getText());
					totalExpense =Integer.parseInt(textField_totalExpense.getText());
					netIncome = totalRevenue - totalSalary - totalExpense;
					lbl_NetIncome1.setText(Integer.toString(netIncome));
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
				new EmployeeManagement().toFront();
				new EmployeeManagement().setState(java.awt.Frame.NORMAL);
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
