package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class WorkTimePage {

	private JFrame frame;
	private JTable empTable;
	private JTextField empName;
	private JTextField date;
	private JButton backbtn;
	private JPanel panel;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkTimePage window = new WorkTimePage();
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
	public WorkTimePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane empNameTxt = new JTextPane();
		empNameTxt.setEditable(false);
		empNameTxt.setBackground(UIManager.getColor("CheckBox.background"));
		empNameTxt.setText("\uC9C1\uC6D0\uC774\uB984");
		empNameTxt.setBounds(12, 10, 55, 21);
		frame.getContentPane().add(empNameTxt);
		
		JTextPane dateTxt = new JTextPane();
		dateTxt.setEditable(false);
		dateTxt.setBackground(UIManager.getColor("CheckBox.background"));
		dateTxt.setText("\uC77C\uC790");
		dateTxt.setBounds(36, 41, 31, 21);
		frame.getContentPane().add(dateTxt);
		
		empName = new JTextField();
		empName.setBounds(79, 10, 161, 21);
		frame.getContentPane().add(empName);
		empName.setColumns(10);
		
		JButton checkbtn = new JButton("\uC870\uD68C");
		checkbtn.setBounds(252, 10, 77, 52);
		frame.getContentPane().add(checkbtn);
		
		date = new JTextField();
		date.setForeground(Color.LIGHT_GRAY);
		date.setText("ex)2022.05.06");
		date.setColumns(10);
		date.setBounds(79, 41, 161, 21);
		frame.getContentPane().add(date);
		
		backbtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager_UI mmframe = new Manager_UI();
				mmframe.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(341, 10, 101, 52);
		frame.getContentPane().add(backbtn);
		
		panel = new JPanel();
		panel.setBounds(12, 72, 430, 179);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		empTable = new JTable();
		scrollPane.setViewportView(empTable);
		empTable.setModel(new DefaultTableModel(
			new Object[][] {
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
			},
			new String[] {
				"\uC9C1\uC6D0\uC774\uB984", "\uCD9C\uADFC\uC77C\uC2DC", "\uD1F4\uADFC\uC77C\uC2DC"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		empTable.getColumnModel().getColumn(0).setPreferredWidth(60);
		empTable.getColumnModel().getColumn(0).setMaxWidth(60);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
