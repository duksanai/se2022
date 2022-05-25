package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PasswordChange {

	private JFrame frame;
	private JTextField nowPw;
	private JTextField newPw;
	private JTextField newPwCheck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordChange window = new PasswordChange();
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
	public PasswordChange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 380, 141);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane nowPwTxt = new JTextPane();
		nowPwTxt.setEditable(false);
		nowPwTxt.setBackground(UIManager.getColor("CheckBox.background"));
		nowPwTxt.setText("\uD604\uC7AC \uBE44\uBC00\uBC88\uD638");
		nowPwTxt.setBounds(28, 10, 83, 21);
		frame.getContentPane().add(nowPwTxt);
		
		JTextPane newPwTxt = new JTextPane();
		newPwTxt.setEditable(false);
		newPwTxt.setText("\uC0C8 \uBE44\uBC00\uBC88\uD638");
		newPwTxt.setBackground(SystemColor.menu);
		newPwTxt.setBounds(40, 41, 71, 21);
		frame.getContentPane().add(newPwTxt);
		
		JTextPane newPwCheckTxt = new JTextPane();
		newPwCheckTxt.setEditable(false);
		newPwCheckTxt.setText("\uC0C8 \uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		newPwCheckTxt.setBackground(SystemColor.menu);
		newPwCheckTxt.setBounds(12, 72, 99, 21);
		frame.getContentPane().add(newPwCheckTxt);
		
		nowPw = new JTextField();
		nowPw.setBounds(123, 10, 116, 21);
		frame.getContentPane().add(nowPw);
		nowPw.setColumns(10);
		
		newPw = new JTextField();
		newPw.setColumns(10);
		newPw.setBounds(123, 41, 116, 21);
		frame.getContentPane().add(newPw);
		
		newPwCheck = new JTextField();
		newPwCheck.setColumns(10);
		newPwCheck.setBounds(123, 72, 116, 21);
		frame.getContentPane().add(newPwCheck);
		
		JButton btnNewButton = new JButton("\uC218\uC815");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager_UI mmframe = new Manager_UI();
				mmframe.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(251, 8, 99, 85);
		frame.getContentPane().add(btnNewButton);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
