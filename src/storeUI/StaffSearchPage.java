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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class StaffSearchPage {

	private JFrame frame;
	private JTable empTable;
	private JTextField idInput;
	private JButton backbtn;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JComboBox comboBox;
	private JTextPane txtpnId;
	private JTextPane txtpnId_1;
	private JTextPane txtpnId_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSearchPage window = new StaffSearchPage();
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
	public StaffSearchPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		idInput = new JTextField();
		idInput.setForeground(Color.BLACK);
		idInput.setBounds(99, 11, 167, 21);
		frame.getContentPane().add(idInput);
		idInput.setColumns(10);
		
		JButton checkbtn = new JButton("\uC870\uD68C");
		checkbtn.setBounds(278, 10, 75, 23);
		frame.getContentPane().add(checkbtn);
		
		backbtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager_UI mmframe = new Manager_UI();
				mmframe.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(359, 10, 93, 23);
		frame.getContentPane().add(backbtn);
		
		panel = new JPanel();
		panel.setBounds(12, 36, 440, 191);
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
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID", "\uC774\uB984", "\uC804\uD654\uBC88\uD638"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		empTable.getColumnModel().getColumn(0).setPreferredWidth(40);
		empTable.getColumnModel().getColumn(1).setPreferredWidth(15);
		
		btnNewButton = new JButton("등록");
		btnNewButton.setBounds(355, 237, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "이름", "전화번호"}));
		comboBox.setBounds(12, 10, 75, 23);
		frame.getContentPane().add(comboBox);
		
		txtpnId = new JTextPane();
		txtpnId.setBackground(UIManager.getColor("CheckBox.background"));
		txtpnId.setText("ID");
		txtpnId.setBounds(12, 239, 18, 21);
		frame.getContentPane().add(txtpnId);
		
		txtpnId_1 = new JTextPane();
		txtpnId_1.setText("이름");
		txtpnId_1.setBackground(SystemColor.menu);
		txtpnId_1.setBounds(12, 270, 31, 21);
		frame.getContentPane().add(txtpnId_1);
		
		txtpnId_2 = new JTextPane();
		txtpnId_2.setText("전화번호");
		txtpnId_2.setBackground(SystemColor.menu);
		txtpnId_2.setBounds(12, 301, 55, 21);
		frame.getContentPane().add(txtpnId_2);
		
		textField = new JTextField();
		textField.setBounds(79, 301, 268, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(79, 270, 268, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(79, 237, 268, 21);
		frame.getContentPane().add(textField_2);
		
		btnNewButton_1 = new JButton("수정");
		btnNewButton_1.setBounds(355, 270, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("삭제");
		btnNewButton_2.setBounds(355, 301, 97, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
