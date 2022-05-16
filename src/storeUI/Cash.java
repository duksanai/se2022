package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cash {

	private JFrame frame;
	private JTextField price;
	private JTextField getCash;
	private JTextField charge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cash window = new Cash();
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
	public Cash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 337, 140);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextPane priceTxt = new JTextPane();
		priceTxt.setEditable(false);
		priceTxt.setText("\uBC1B\uC744 \uAE08\uC561");
		priceTxt.setBounds(12, 10, 59, 20);
		panel.add(priceTxt);
		
		JTextPane getCashTxt = new JTextPane();
		getCashTxt.setEditable(false);
		getCashTxt.setText("\uBC1B\uC740 \uAE08\uC561");
		getCashTxt.setBounds(12, 40, 59, 20);
		panel.add(getCashTxt);
		
		JTextPane chargeTxt = new JTextPane();
		chargeTxt.setEditable(false);
		chargeTxt.setText("\uAC70\uC2A4\uB984\uB3C8");
		chargeTxt.setBounds(16, 70, 55, 20);
		panel.add(chargeTxt);
		
		price = new JTextField();
		price.setBounds(83, 10, 116, 21);
		panel.add(price);
		price.setColumns(10);
		
		getCash = new JTextField();
		getCash.setColumns(10);
		getCash.setBounds(83, 40, 116, 21);
		panel.add(getCash);
		
		charge = new JTextField();
		charge.setColumns(10);
		charge.setBounds(83, 70, 116, 21);
		panel.add(charge);
		
		JButton paymentbtn = new JButton("\uD604\uAE08\uACB0\uC81C");
		paymentbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GoodsSell gsframe = new GoodsSell();
				gsframe.setVisible(true);
				frame.dispose();
			}
		});
		paymentbtn.setBounds(211, 10, 97, 80);
		panel.add(paymentbtn);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
