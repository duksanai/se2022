package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerView {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerView window = new CustomerView();
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
	public CustomerView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 267);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uC774\uB984", "\uC804\uD654\uBC88\uD638"},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setMaxWidth(60);
		table.setBounds(12, 41, 410, 179);
		frame.getContentPane().add(table);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("\uC804\uD654\uBC88\uD638");
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(12, 10, 55, 21);
		frame.getContentPane().add(textPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(79, 10, 161, 21);
		frame.getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("\uC870\uD68C");
		btnNewButton.setBounds(252, 10, 66, 21);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerManagement cmframe = new CustomerManagement();
				cmframe.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(330, 10, 92, 21);
		frame.getContentPane().add(btnNewButton_1);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
