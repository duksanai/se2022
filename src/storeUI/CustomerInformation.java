package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerInformation {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerInformation window = new CustomerInformation();
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
	public CustomerInformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 198);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnRmror = new JTextPane();
		txtpnRmror.setEditable(false);
		txtpnRmror.setText("\uACE0\uAC1D \uC815\uBCF4");
		txtpnRmror.setBackground(SystemColor.menu);
		txtpnRmror.setBounds(12, 10, 59, 21);
		frame.getContentPane().add(txtpnRmror);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setText("\uC774\uB984");
		textPane_2.setBackground(SystemColor.menu);
		textPane_2.setBounds(40, 72, 31, 21);
		frame.getContentPane().add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setText("\uC804\uD654\uBC88\uD638");
		textPane_3.setBackground(SystemColor.menu);
		textPane_3.setBounds(16, 41, 55, 21);
		frame.getContentPane().add(textPane_3);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(83, 72, 143, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("'-'\uB97C \uC81C\uC678\uD558\uACE0 \uC785\uB825");
		textField_2.setForeground(Color.LIGHT_GRAY);
		textField_2.setColumns(10);
		textField_2.setBounds(83, 41, 143, 21);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("\uC218\uC815");
		btnNewButton.setBounds(238, 72, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setBounds(238, 103, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uAC80\uC0C9");
		btnNewButton_2.setBounds(238, 41, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton backbtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerManagement cmframe = new CustomerManagement();
				cmframe.setVisible(true);
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
