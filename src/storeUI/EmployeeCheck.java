package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmployeeCheck {

	private JFrame frame;
	private JTable empTable;
	private JTextField idInput;
	private JButton backbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeCheck window = new EmployeeCheck();
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
	public EmployeeCheck() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		empTable = new JTable();
		empTable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					EmployeeInformation eiframe = new EmployeeInformation();
					eiframe.setVisible(true);
					frame.dispose();
				}
			}
		});
		empTable.setBounds(12, 36, 440, 215);
		empTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "\uC774\uB984", "\uC804\uD654\uBC88\uD638"},
				{"", "", ""},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		frame.getContentPane().add(empTable);
		
		idInput = new JTextField();
		idInput.setForeground(UIManager.getColor("Button.shadow"));
		idInput.setText("\uC9C1\uC6D0 ID \uAC80\uC0C9");
		idInput.setBounds(12, 11, 248, 21);
		frame.getContentPane().add(idInput);
		idInput.setColumns(10);
		
		JButton checkbtn = new JButton("\uC870\uD68C");
		checkbtn.setBounds(272, 10, 75, 23);
		frame.getContentPane().add(checkbtn);
		
		backbtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagementMode mmframe = new ManagementMode();
				mmframe.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(359, 10, 93, 23);
		frame.getContentPane().add(backbtn);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
