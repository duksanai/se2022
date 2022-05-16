package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeRegi {

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
					EmployeeRegi window = new EmployeeRegi();
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
	public EmployeeRegi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 333, 176);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane emptxt = new JTextPane();
		emptxt.setEditable(false);
		emptxt.setBackground(UIManager.getColor("CheckBox.background"));
		emptxt.setText("\uC9C1\uC6D0 \uB4F1\uB85D");
		emptxt.setBounds(12, 10, 59, 21);
		frame.getContentPane().add(emptxt);
		
		JTextPane empIDTxt = new JTextPane();
		empIDTxt.setEditable(false);
		empIDTxt.setBackground(UIManager.getColor("CheckBox.background"));
		empIDTxt.setText("ID");
		empIDTxt.setBounds(53, 41, 18, 21);
		frame.getContentPane().add(empIDTxt);
		
		JTextPane empNameTxt = new JTextPane();
		empNameTxt.setEditable(false);
		empNameTxt.setBackground(UIManager.getColor("CheckBox.background"));
		empNameTxt.setText("\uC774\uB984");
		empNameTxt.setBounds(40, 72, 31, 21);
		frame.getContentPane().add(empNameTxt);
		
		JTextPane empPhoneTxt = new JTextPane();
		empPhoneTxt.setEditable(false);
		empPhoneTxt.setBackground(UIManager.getColor("CheckBox.background"));
		empPhoneTxt.setText("\uC804\uD654\uBC88\uD638");
		empPhoneTxt.setBounds(16, 103, 55, 21);
		frame.getContentPane().add(empPhoneTxt);
		
		empID = new JTextField();
		empID.setBounds(83, 41, 143, 21);
		frame.getContentPane().add(empID);
		empID.setColumns(10);
		
		empName = new JTextField();
		empName.setColumns(10);
		empName.setBounds(83, 72, 143, 21);
		frame.getContentPane().add(empName);
		
		empPhone = new JTextField();
		empPhone.setForeground(UIManager.getColor("Button.shadow"));
		empPhone.setText("'-'\uB97C \uC81C\uC678\uD558\uACE0 \uC785\uB825");
		empPhone.setColumns(10);
		empPhone.setBounds(83, 103, 143, 21);
		frame.getContentPane().add(empPhone);
		
		JButton regibtn = new JButton("\uB4F1\uB85D");
		regibtn.setBounds(238, 41, 67, 83);
		frame.getContentPane().add(regibtn);
		
		JButton backbtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagementMode mmframe = new ManagementMode();
				mmframe.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(205, 8, 100, 23);
		frame.getContentPane().add(backbtn);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
