package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeInformation {

	private JFrame frame;
	private JTextField empID;
	private JTextField empName;
	private JTextField empPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeInformation window = new EmployeeInformation();
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
	public EmployeeInformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 180);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane empInfoTxt = new JTextPane();
		empInfoTxt.setEditable(false);
		empInfoTxt.setText("\uC9C1\uC6D0 \uC815\uBCF4");
		empInfoTxt.setBackground(SystemColor.menu);
		empInfoTxt.setBounds(12, 10, 59, 21);
		frame.getContentPane().add(empInfoTxt);
		
		JTextPane empIDTxt = new JTextPane();
		empIDTxt.setEditable(false);
		empIDTxt.setText("ID");
		empIDTxt.setBackground(SystemColor.menu);
		empIDTxt.setBounds(53, 41, 18, 21);
		frame.getContentPane().add(empIDTxt);
		
		JTextPane empNameTxt = new JTextPane();
		empNameTxt.setEditable(false);
		empNameTxt.setText("\uC774\uB984");
		empNameTxt.setBackground(SystemColor.menu);
		empNameTxt.setBounds(40, 72, 31, 21);
		frame.getContentPane().add(empNameTxt);
		
		JTextPane empPhoneTxt = new JTextPane();
		empPhoneTxt.setEditable(false);
		empPhoneTxt.setText("\uC804\uD654\uBC88\uD638");
		empPhoneTxt.setBackground(SystemColor.menu);
		empPhoneTxt.setBounds(16, 103, 55, 21);
		frame.getContentPane().add(empPhoneTxt);
		
		empID = new JTextField();
		empID.setEditable(false);
		empID.setColumns(10);
		empID.setBounds(83, 41, 143, 21);
		frame.getContentPane().add(empID);
		
		empName = new JTextField();
		empName.setEditable(false);
		empName.setColumns(10);
		empName.setBounds(83, 72, 143, 21);
		frame.getContentPane().add(empName);
		
		empPhone = new JTextField();
		empPhone.setEditable(false);
		empPhone.setForeground(Color.BLACK);
		empPhone.setColumns(10);
		empPhone.setBounds(83, 103, 143, 21);
		frame.getContentPane().add(empPhone);
		
		JButton modifybtn = new JButton("\uC218\uC815");
		modifybtn.setBounds(238, 41, 85, 52);
		frame.getContentPane().add(modifybtn);
		
		JButton deletebtn = new JButton("\uC0AD\uC81C");
		deletebtn.setBackground(Color.PINK);
		deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deletebtn.setBounds(238, 103, 85, 21);
		frame.getContentPane().add(deletebtn);
		
		JButton backbtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeCheck ecframe = new EmployeeCheck();
				ecframe.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(238, 10, 85, 23);
		frame.getContentPane().add(backbtn);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
