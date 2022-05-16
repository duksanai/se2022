package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PasswordCheck {

	private JFrame frame;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordCheck window = new PasswordCheck();
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
	public PasswordCheck() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 81);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane passwordTxt = new JTextPane();
		passwordTxt.setEditable(false);
		passwordTxt.setBackground(UIManager.getColor("CheckBox.background"));
		passwordTxt.setText("\uBE44\uBC00\uBC88\uD638 \uC785\uB825");
		passwordTxt.setBounds(12, 10, 83, 21);
		frame.getContentPane().add(passwordTxt);
		
		password = new JTextField();
		password.setBounds(107, 10, 116, 21);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JButton loginbtn = new JButton("\uB85C\uADF8\uC778");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagementMode mmframe = new ManagementMode();
				mmframe.setVisible(true);
				frame.dispose();
			}
		});
		loginbtn.setBounds(235, 10, 87, 23);
		frame.getContentPane().add(loginbtn);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
