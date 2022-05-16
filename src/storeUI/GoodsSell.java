package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GoodsSell {

	private JFrame frame;
	private JTable table;
	private JTextField totalprice;
	private JTextField goodsNumTxt;
	private JTextField receiptNumtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoodsSell window = new GoodsSell();
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
	public GoodsSell() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 43, 463, 508);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uC0C1\uD488\uBA85", "\uC218\uB7C9", "\uAE08\uC561"},
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
		panel.add(table);
		
		JButton backbt = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mp = new MainFrame();
				mp.setVisible(true);
				frame.dispose();
			}
		});
		backbt.setBounds(12, 10, 97, 23);
		frame.getContentPane().add(backbt);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(487, 43, 185, 508);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		totalprice = new JTextField();
		totalprice.setBounds(67, 10, 106, 21);
		panel_1.add(totalprice);
		totalprice.setColumns(10);
		
		JTextPane pricetext = new JTextPane();
		pricetext.setText("\uCD1D\uAE08\uC561");
		pricetext.setBounds(12, 10, 43, 21);
		panel_1.add(pricetext);
		
		JButton delbtn = new JButton("\uC120\uD0DD \uC81C\uAC70");
		delbtn.setBounds(12, 52, 161, 32);
		panel_1.add(delbtn);
		
		JButton delAllbtn = new JButton("\uC804\uCCB4 \uC81C\uAC70");
		delAllbtn.setBounds(12, 94, 161, 32);
		panel_1.add(delAllbtn);
		
		JButton goodsNumScan = new JButton("\uC0C1\uD488\uC815\uBCF4 \uC2A4\uCE94");
		goodsNumScan.setBounds(12, 197, 161, 37);
		panel_1.add(goodsNumScan);
		
		JButton receiptNumScan = new JButton("\uC601\uC218\uC99D \uBC88\uD638 \uC2A4\uCE94");
		receiptNumScan.setBounds(12, 275, 161, 37);
		panel_1.add(receiptNumScan);
		
		JButton cashbtn = new JButton("\uD604\uAE08\uACB0\uC81C\uD558\uAE30");
		cashbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cash cframe = new Cash();
				cframe.setVisible(true);
				frame.dispose();
			}
		});
		cashbtn.setBounds(12, 338, 161, 46);
		panel_1.add(cashbtn);
		
		JButton cardbtn = new JButton("\uCE74\uB4DC\uACB0\uC81C\uD558\uAE30");
		cardbtn.setBounds(12, 394, 161, 46);
		panel_1.add(cardbtn);
		
		JButton returnbtn = new JButton("\uBC18\uD488\uC694\uCCAD");
		returnbtn.setBounds(12, 450, 161, 48);
		panel_1.add(returnbtn);
		
		goodsNumTxt = new JTextField();
		goodsNumTxt.setBounds(12, 166, 161, 21);
		panel_1.add(goodsNumTxt);
		goodsNumTxt.setColumns(10);
		
		receiptNumtxt = new JTextField();
		receiptNumtxt.setColumns(10);
		receiptNumtxt.setBounds(12, 244, 161, 21);
		panel_1.add(receiptNumtxt);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
