package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Window.Type;
import javax.swing.BoxLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SalesCheck {

	private JFrame frame;
	private JTextField yearInput;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesCheck window = new SalesCheck();
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
	public SalesCheck() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 537, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		yearInput = new JTextField();
		yearInput.setForeground(Color.LIGHT_GRAY);
		yearInput.setText("\uB144\uB3C4 \uC785\uB825");
		yearInput.setBounds(12, 421, 75, 24);
		frame.getContentPane().add(yearInput);
		yearInput.setColumns(10);
		
		JButton yearInputbtn = new JButton("\uC785\uB825");
		yearInputbtn.setBounds(93, 420, 68, 24);
		frame.getContentPane().add(yearInputbtn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 521, 220);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(45, 35, 464, 144);
		table.setShowVerticalLines(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		panel_1.add(table);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(71, 189, 25, 21);
		textPane.setText("1\uC6D4");
		panel_1.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(150, 189, 25, 21);
		textPane_1.setText("2\uC6D4");
		panel_1.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(226, 189, 25, 21);
		textPane_2.setText("3\uC6D4");
		panel_1.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(299, 189, 25, 21);
		textPane_3.setText("4\uC6D4");
		panel_1.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(371, 189, 25, 21);
		textPane_4.setText("5\uC6D4");
		panel_1.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(445, 189, 25, 21);
		textPane_5.setText("6\uC6D4");
		panel_1.add(textPane_5);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("50");
		textPane_7.setBounds(15, 150, 25, 21);
		panel_1.add(textPane_7);
		
		JTextPane textPane_7_1 = new JTextPane();
		textPane_7_1.setText("100");
		textPane_7_1.setBounds(12, 119, 31, 21);
		panel_1.add(textPane_7_1);
		
		JTextPane textPane_7_2 = new JTextPane();
		textPane_7_2.setText("150");
		textPane_7_2.setBounds(12, 87, 31, 21);
		panel_1.add(textPane_7_2);
		
		JTextPane textPane_7_3 = new JTextPane();
		textPane_7_3.setText("200");
		textPane_7_3.setBounds(12, 56, 31, 21);
		panel_1.add(textPane_7_3);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText("(\uB2E8\uC704: \uB9CC\uC6D0)");
		textPane_8.setBounds(12, 10, 81, 21);
		panel_1.add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		textPane_9.setText("____\uB144\uB3C4 \uB9E4\uC7A5 \uB9E4\uCD9C");
		textPane_9.setBounds(183, 10, 163, 28);
		panel_1.add(textPane_9);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(0, 219, 521, 192);
		frame.getContentPane().add(panel_1_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_1.setShowVerticalLines(false);
		table_1.setBounds(45, 7, 464, 144);
		panel_1_1.add(table_1);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("7\uC6D4");
		textPane_6.setBounds(71, 161, 25, 21);
		panel_1_1.add(textPane_6);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setText("8\uC6D4");
		textPane_1_1.setBounds(150, 161, 25, 21);
		panel_1_1.add(textPane_1_1);
		
		JTextPane textPane_2_1 = new JTextPane();
		textPane_2_1.setText("9\uC6D4");
		textPane_2_1.setBounds(226, 161, 25, 21);
		panel_1_1.add(textPane_2_1);
		
		JTextPane textPane_3_1 = new JTextPane();
		textPane_3_1.setText("10\uC6D4");
		textPane_3_1.setBounds(299, 161, 31, 21);
		panel_1_1.add(textPane_3_1);
		
		JTextPane textPane_4_1 = new JTextPane();
		textPane_4_1.setText("11\uC6D4");
		textPane_4_1.setBounds(371, 161, 31, 21);
		panel_1_1.add(textPane_4_1);
		
		JTextPane textPane_5_1 = new JTextPane();
		textPane_5_1.setText("12\uC6D4");
		textPane_5_1.setBounds(445, 161, 31, 21);
		panel_1_1.add(textPane_5_1);
		
		JTextPane textPane_7_4 = new JTextPane();
		textPane_7_4.setText("50");
		textPane_7_4.setBounds(15, 123, 25, 21);
		panel_1_1.add(textPane_7_4);
		
		JTextPane textPane_7_1_1 = new JTextPane();
		textPane_7_1_1.setText("100");
		textPane_7_1_1.setBounds(12, 92, 31, 21);
		panel_1_1.add(textPane_7_1_1);
		
		JTextPane textPane_7_2_1 = new JTextPane();
		textPane_7_2_1.setText("150");
		textPane_7_2_1.setBounds(12, 60, 31, 21);
		panel_1_1.add(textPane_7_2_1);
		
		JTextPane textPane_7_3_1 = new JTextPane();
		textPane_7_3_1.setText("200");
		textPane_7_3_1.setBounds(12, 29, 31, 21);
		panel_1_1.add(textPane_7_3_1);
		
		JButton backbtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagementMode mmframe = new ManagementMode();
				mmframe.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(412, 421, 97, 23);
		frame.getContentPane().add(backbtn);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
