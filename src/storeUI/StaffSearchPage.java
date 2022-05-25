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
	private JTable StaffTable;
	private JTextField SearchTextField;
	private JButton backbtn;
	private JPanel StaffPanel;
	private JScrollPane scrollPane;
	private JButton RegisterButton;
	private JComboBox SearchOptionSel;
	private JTextPane txtpnId;
	private JTextPane txtpnId_1;
	private JTextPane txtpnId_2;
	private JTextField phoneTextField;
	private JTextField nameTextField;
	private JTextField idTextField;
	private JButton AmendButton;
	private JButton DeleteButton;

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
		
		SearchTextField = new JTextField();
		SearchTextField.setForeground(Color.BLACK);
		SearchTextField.setBounds(99, 11, 167, 21);
		frame.getContentPane().add(SearchTextField);
		SearchTextField.setColumns(10);
		
		JButton SearchButton = new JButton("조회");
		SearchButton.setBounds(278, 10, 75, 23);
		frame.getContentPane().add(SearchButton);
		
		backbtn = new JButton("뒤로가기");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager_UI mmframe = new Manager_UI();
				mmframe.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(359, 10, 93, 23);
		frame.getContentPane().add(backbtn);
		
		StaffPanel = new JPanel();
		StaffPanel.setBounds(12, 36, 440, 191);
		frame.getContentPane().add(StaffPanel);
		StaffPanel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		StaffPanel.add(scrollPane, BorderLayout.CENTER);
		
		StaffTable = new JTable();
		scrollPane.setViewportView(StaffTable);
		StaffTable.setModel(new DefaultTableModel(
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
				"ID", "이름", "전화번호"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		StaffTable.getColumnModel().getColumn(0).setPreferredWidth(40);
		StaffTable.getColumnModel().getColumn(1).setPreferredWidth(15);
		
		RegisterButton = new JButton("등록");
		RegisterButton.setBounds(355, 237, 97, 23);
		frame.getContentPane().add(RegisterButton);
		
		SearchOptionSel = new JComboBox();
		SearchOptionSel.setModel(new DefaultComboBoxModel(new String[] {"ID", "이름", "전화번호"}));
		SearchOptionSel.setBounds(12, 10, 75, 23);
		frame.getContentPane().add(SearchOptionSel);
		
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
		
		phoneTextField = new JTextField();
		phoneTextField.setBounds(79, 301, 268, 21);
		frame.getContentPane().add(phoneTextField);
		phoneTextField.setColumns(10);
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		nameTextField.setBounds(79, 270, 268, 21);
		frame.getContentPane().add(nameTextField);
		
		idTextField = new JTextField();
		idTextField.setColumns(10);
		idTextField.setBounds(79, 237, 268, 21);
		frame.getContentPane().add(idTextField);
		
		AmendButton = new JButton("수정");
		AmendButton.setBounds(355, 270, 97, 23);
		frame.getContentPane().add(AmendButton);
		
		DeleteButton = new JButton("삭제");
		DeleteButton.setBounds(355, 301, 97, 23);
		frame.getContentPane().add(DeleteButton);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
