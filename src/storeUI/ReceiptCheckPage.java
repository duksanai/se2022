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
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

public class ReceiptCheckPage {

	private JFrame frame;
	private JTextField receiptNum;
	private JPanel panel;
	private JTextPane receipt;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReceiptCheckPage window = new ReceiptCheckPage();
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
	public ReceiptCheckPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("영수증 조회");
		frame.setBounds(100, 100, 392, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(12, 10, 351, 41);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		receiptNum = new JTextField();
		receiptNum.setBounds(12, 10, 165, 23);
		panel.add(receiptNum);
		receiptNum.setForeground(Color.LIGHT_GRAY);
		receiptNum.setColumns(10);
		
		JButton Checkbtn = new JButton("조회");
		Checkbtn.setBounds(189, 10, 57, 23);
		panel.add(Checkbtn);
		
		JButton backbtn = new JButton("돌아가기");
		backbtn.setBounds(258, 10, 81, 23);
		panel.add(backbtn);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(12, 61, 351, 270);
		frame.getContentPane().add(scrollPane);
		
		receipt = new JTextPane();
		scrollPane.setRowHeaderView(receipt);
		receipt.setText("품명\t\t단가\t수량\t금액\r\n"//영수증 출력
				+ "---------------------------------------------------------"
				+ "\r\n과자\t\t1,450\t1\t2,900"
				+ "\r\n\r\n\r\n\r\n\r\n\r\n\r\n"
				+ "---------------------------------------------------------"
				+ "\r\n합      계:\t\t\t\t2,900"
				+ "\r\n받을금액:\t\t\t\t2,900"
				+ "\r\n받은금액:\t\t\t\t2,900"
				+ "\r\n"
				+ "---------------------------------------------------------"
				+ "\r\n결제수단\t\t\t\t현금결제");
		receipt.setFont(new Font("굴림", Font.PLAIN, 12));
		receipt.setEditable(false);
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_UI mp = new Main_UI();
				mp.setVisible(true);
				frame.dispose();
			}
		});
		Checkbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
