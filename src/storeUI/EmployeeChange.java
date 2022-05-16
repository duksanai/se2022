package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeChange {

	private JFrame frame;
	private JTextField empNow;
	private JTextField changedEmp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeChange window = new EmployeeChange();
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
	public EmployeeChange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 366, 116);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane empNowTxt = new JTextPane();
		empNowTxt.setEditable(false);
		empNowTxt.setText("\uD604\uC7AC \uADFC\uBB34 \uC9C1\uC6D0 : ");
		empNowTxt.setBounds(12, 10, 99, 21);
		panel.add(empNowTxt);
		
		JTextPane changedEmpTxt = new JTextPane();
		changedEmpTxt.setEditable(false);
		changedEmpTxt.setText("\uAD50\uB300 \uC9C1\uC6D0 : ");
		changedEmpTxt.setBounds(40, 41, 71, 21);
		panel.add(changedEmpTxt);
		
		empNow = new JTextField();
		empNow.setEnabled(false);
		empNow.setBounds(111, 10, 116, 21);
		panel.add(empNow);
		empNow.setColumns(10);
		
		changedEmp = new JTextField();
		changedEmp.setColumns(10);
		changedEmp.setBounds(111, 41, 116, 21);
		panel.add(changedEmp);
		
		JButton empChangebtn = new JButton("\uAD50\uB300\uD558\uAE30");
		empChangebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		empChangebtn.setBounds(239, 10, 97, 52);
		panel.add(empChangebtn);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
