package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

public class Receipt {

	private JFrame frame;
	private JTable receiptTable;
	private JTextField receiptNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt window = new Receipt();
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
	public Receipt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		receiptNum = new JTextField();
		receiptNum.setForeground(Color.LIGHT_GRAY);
		receiptNum.setBounds(12, 11, 306, 36);
		frame.getContentPane().add(receiptNum);
		receiptNum.setColumns(10);
		
		receiptTable = new JTable();
		receiptTable.setShowVerticalLines(false);
		receiptTable.setFont(new Font("µ¸¿ò", Font.PLAIN, 13));
		receiptTable.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		receiptTable.setBounds(12, 56, 500, 160);
		receiptTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uC601\uC218\uC99D \uBC88\uD638", null, ""},
				{"\uAD6C\uB9E4\uC0C1\uD488\uBAA9\uB85D", null, null},
				{"", "", ""},
				{"", "", ""},
				{"", "", ""},
				{"", "", ""},
				{"", "", ""},
				{"", "", ""},
				{"\uAD6C\uB9E4\uC77C\uC2DC", null, ""},
				{"\uACB0\uC81C\uC218\uB2E8", null, ""},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		frame.getContentPane().add(receiptTable);
		
		JButton Checkbtn = new JButton("\uC870\uD68C");
		Checkbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Checkbtn.setBounds(330, 10, 70, 36);
		frame.getContentPane().add(Checkbtn);
		
		JButton backbtn = new JButton("\uB3CC\uC544\uAC00\uAE30");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mp = new MainFrame();
				mp.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(412, 10, 100, 36);
		frame.getContentPane().add(backbtn);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
