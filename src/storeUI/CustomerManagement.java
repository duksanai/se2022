package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class CustomerManagement {

	private JFrame frame;
	private JTextField phoneNum;
	private JTextField cusName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerManagement window = new CustomerManagement();
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
	public CustomerManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 356, 237);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton backbtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mp = new MainFrame();
				mp.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(220, 10, 97, 23);
		frame.getContentPane().add(backbtn);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 43, 318, 145);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextPane phoneNumTxt = new JTextPane();
		phoneNumTxt.setEditable(false);
		phoneNumTxt.setText("\uC804\uD654\uBC88\uD638");
		phoneNumTxt.setBounds(12, 10, 55, 21);
		panel.add(phoneNumTxt);
		
		JTextPane cusNameTxt = new JTextPane();
		cusNameTxt.setEditable(false);
		cusNameTxt.setText("\uACE0\uAC1D\uBA85");
		cusNameTxt.setBounds(24, 41, 43, 21);
		panel.add(cusNameTxt);
		
		phoneNum = new JTextField();
		phoneNum.setBounds(79, 10, 116, 21);
		panel.add(phoneNum);
		phoneNum.setColumns(10);
		
		cusName = new JTextField();
		cusName.setColumns(10);
		cusName.setBounds(79, 41, 116, 21);
		panel.add(cusName);
		
		JButton searchbtn = new JButton("\uAC80\uC0C9");
		searchbtn.setBounds(207, 8, 97, 23);
		panel.add(searchbtn);
		
		JButton regibtn = new JButton("\uB4F1\uB85D");
		regibtn.setBounds(207, 41, 97, 23);
		panel.add(regibtn);
		
		JButton cusInfobtn = new JButton("\uACE0\uAC1D \uC815\uBCF4");
		cusInfobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerInformation ciframe = new CustomerInformation();
				ciframe.setVisible(true);
				frame.dispose();
			}
		});
		cusInfobtn.setBackground(Color.CYAN);
		cusInfobtn.setBounds(207, 105, 97, 21);
		panel.add(cusInfobtn);
		
		JButton cusViewbtn = new JButton("\uACE0\uAC1D \uC870\uD68C");
		cusViewbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerView cvframe = new CustomerView();
				cvframe.setVisible(true);
				frame.dispose();
			}
		});
		cusViewbtn.setBackground(Color.CYAN);
		cusViewbtn.setBounds(207, 72, 97, 23);
		panel.add(cusViewbtn);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
