package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GoodsRegistration {

	private JFrame frame;
	private JTextField barcode;
	private JTextField goodsName;
	private JTextField price;
	private JTextField stock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoodsRegistration window = new GoodsRegistration();
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
	public GoodsRegistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 340, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton backbtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mp = new MainFrame();
				mp.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(207, 10, 97, 23);
		frame.getContentPane().add(backbtn);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 43, 302, 136);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JTextPane barcodeTxt = new JTextPane();
		barcodeTxt.setEditable(false);
		barcodeTxt.setText("\uBC14\uCF54\uB4DC");
		barcodeTxt.setBounds(12, 10, 43, 21);
		panel.add(barcodeTxt);

		JTextPane goodsNameTxt = new JTextPane();
		goodsNameTxt.setEditable(false);
		goodsNameTxt.setText("\uC0C1\uD488\uBA85");
		goodsNameTxt.setBounds(12, 41, 43, 21);
		panel.add(goodsNameTxt);

		JTextPane priceTxt = new JTextPane();
		priceTxt.setEditable(false);
		priceTxt.setText("\uAC00\uACA9");
		priceTxt.setBounds(24, 72, 31, 21);
		panel.add(priceTxt);

		JTextPane stockTxt = new JTextPane();
		stockTxt.setEditable(false);
		stockTxt.setText("\uC7AC\uACE0\uC218");
		stockTxt.setBounds(12, 103, 43, 21);
		panel.add(stockTxt);

		barcode = new JTextField();
		barcode.setBounds(67, 10, 116, 21);
		panel.add(barcode);
		barcode.setColumns(10);

		goodsName = new JTextField();
		goodsName.setColumns(10);
		goodsName.setBounds(67, 41, 116, 21);
		panel.add(goodsName);

		price = new JTextField();
		price.setColumns(10);
		price.setBounds(67, 72, 116, 21);
		panel.add(price);

		stock = new JTextField();
		stock.setColumns(10);
		stock.setBounds(67, 103, 116, 21);
		panel.add(stock);

		JButton regbtn = new JButton("\uB4F1\uB85D");
		regbtn.setBounds(195, 10, 97, 23);
		panel.add(regbtn);

		JButton exelupbtn = new JButton("\uC5D1\uC140 \uC5C5\uB85C\uB4DC");
		exelupbtn.setBounds(195, 41, 97, 23);
		panel.add(exelupbtn);
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
