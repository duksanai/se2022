package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GoodsInfo {

	private JFrame frame;
	private JTextField goodsCode;
	private JTextField goodsName;
	private JTable goodsTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoodsInfo window = new GoodsInfo();
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
	public GoodsInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 249);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane goodsCodeTxt = new JTextPane();
		goodsCodeTxt.setEditable(false);
		goodsCodeTxt.setBackground(UIManager.getColor("CheckBox.background"));
		goodsCodeTxt.setText("\uC0C1\uD488 \uCF54\uB4DC : ");
		goodsCodeTxt.setBounds(40, 25, 71, 21);
		frame.getContentPane().add(goodsCodeTxt);
		
		JTextPane goodsNameTxt = new JTextPane();
		goodsNameTxt.setEditable(false);
		goodsNameTxt.setText("\uC0C1\uD488\uBA85 : ");
		goodsNameTxt.setBackground(SystemColor.menu);
		goodsNameTxt.setBounds(56, 56, 55, 21);
		frame.getContentPane().add(goodsNameTxt);
		
		goodsCode = new JTextField();
		goodsCode.setBounds(110, 25, 219, 21);
		frame.getContentPane().add(goodsCode);
		goodsCode.setColumns(10);
		
		goodsName = new JTextField();
		goodsName.setColumns(10);
		goodsName.setBounds(110, 56, 219, 21);
		frame.getContentPane().add(goodsName);
		
		JButton searchbtn = new JButton("\uAC80\uC0C9");
		searchbtn.setBounds(341, 25, 81, 52);
		frame.getContentPane().add(searchbtn);
		
		goodsTable = new JTable();
		goodsTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uC0C1\uD488\uCF54\uB4DC", "\uC0C1\uD488\uBA85", "\uAC00\uACA9(\uC6D0)", "\uC7AC\uACE0\uC218\uB7C9"},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		goodsTable.getColumnModel().getColumn(0).setPreferredWidth(130);
		goodsTable.getColumnModel().getColumn(0).setMinWidth(25);
		goodsTable.getColumnModel().getColumn(1).setPreferredWidth(140);
		goodsTable.getColumnModel().getColumn(1).setMinWidth(25);
		goodsTable.getColumnModel().getColumn(2).setPreferredWidth(50);
		goodsTable.getColumnModel().getColumn(2).setMinWidth(25);
		goodsTable.getColumnModel().getColumn(3).setPreferredWidth(50);
		goodsTable.getColumnModel().getColumn(3).setMinWidth(25);
		goodsTable.setBounds(12, 101, 410, 32);
		frame.getContentPane().add(goodsTable);
		
		JButton modifybtn = new JButton("\uC218\uC815");
		modifybtn.setBounds(12, 143, 130, 52);
		frame.getContentPane().add(modifybtn);
		
		JButton deletebtn = new JButton("\uC0AD\uC81C");
		deletebtn.setBounds(154, 143, 130, 52);
		frame.getContentPane().add(deletebtn);
		
		JButton backbtn = new JButton("\uD655\uC778");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mp = new MainFrame();
				mp.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(296, 143, 126, 52);
		frame.getContentPane().add(backbtn);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
