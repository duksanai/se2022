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
	private JTable workTable;
	private JTextField nameTextField;
	private JTextField DateTextField;
	private JButton backbtn;
	private JPanel infoPanel;
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
		empNameTxt.setText("직원이름");
		empNameTxt.setBounds(12, 10, 55, 21);
		frame.getContentPane().add(empNameTxt);
		
		JTextPane dateTxt = new JTextPane();
		dateTxt.setEditable(false);
		dateTxt.setBackground(UIManager.getColor("CheckBox.background"));
		dateTxt.setText("일자");
		dateTxt.setBounds(36, 41, 31, 21);
		frame.getContentPane().add(dateTxt);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(79, 10, 161, 21);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JButton SearchButton = new JButton("조회");
		SearchButton.setBounds(252, 10, 77, 52);
		frame.getContentPane().add(SearchButton);
		
		DateTextField = new JTextField();
		DateTextField.setForeground(Color.LIGHT_GRAY);
		DateTextField.setColumns(10);
		DateTextField.setBounds(79, 41, 161, 21);
		frame.getContentPane().add(DateTextField);
		
		backbtn = new JButton("뒤로가기");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager_UI mmframe = new Manager_UI();
				mmframe.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(341, 10, 101, 52);
		frame.getContentPane().add(backbtn);
		
		infoPanel = new JPanel();
		infoPanel.setBounds(12, 72, 430, 179);
		frame.getContentPane().add(infoPanel);
		infoPanel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		infoPanel.add(scrollPane, BorderLayout.CENTER);
		
		workTable = new JTable();
		scrollPane.setViewportView(workTable);
		workTable.setModel(new DefaultTableModel(
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
				"직원이름", "출근일시", "퇴근일시"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		workTable.getColumnModel().getColumn(0).setPreferredWidth(60);
		workTable.getColumnModel().getColumn(0).setMaxWidth(60);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
