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

public class AddItemUI {

	private JFrame frame;
	private JTextField barcode;
	private JTextField itemName;
	private JTextField price;
	private JTextField stock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddItemUI window = new AddItemUI();
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
	public AddItemUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("상품등록");
		frame.setBounds(100, 100, 340, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton backButton = new JButton("뒤로가기");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_UI mp = new Main_UI();
				mp.setVisible(true);
				frame.dispose();
			}
		});
		backButton.setBounds(207, 10, 97, 23);
		frame.getContentPane().add(backButton);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 43, 302, 136);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JTextPane barcodeTxt = new JTextPane();
		barcodeTxt.setEditable(false);
		barcodeTxt.setText("바코드");
		barcodeTxt.setBounds(12, 10, 43, 21);
		panel.add(barcodeTxt);

		JTextPane itemNameTxt = new JTextPane();
		itemNameTxt.setEditable(false);
		itemNameTxt.setText("상품명");
		itemNameTxt.setBounds(12, 41, 43, 21);
		panel.add(itemNameTxt);

		JTextPane priceTxt = new JTextPane();
		priceTxt.setEditable(false);
		priceTxt.setText("가격");
		priceTxt.setBounds(24, 72, 31, 21);
		panel.add(priceTxt);

		JTextPane stockTxt = new JTextPane();
		stockTxt.setEditable(false);
		stockTxt.setText("재고수");
		stockTxt.setBounds(12, 103, 43, 21);
		panel.add(stockTxt);

		barcode = new JTextField();
		barcode.setBounds(67, 10, 116, 21);
		panel.add(barcode);
		barcode.setColumns(10);

		itemName = new JTextField();
		itemName.setColumns(10);
		itemName.setBounds(67, 41, 116, 21);
		panel.add(itemName);

		price = new JTextField();
		price.setColumns(10);
		price.setBounds(67, 72, 116, 21);
		panel.add(price);

		stock = new JTextField();
		stock.setColumns(10);
		stock.setBounds(67, 103, 116, 21);
		panel.add(stock);

		JButton submitButton = new JButton("등록");
		submitButton.setBounds(195, 10, 97, 23);
		panel.add(submitButton);

		JButton uploadExcelButton = new JButton("엑셀 업로드");
		uploadExcelButton.setBounds(195, 41, 97, 23);
		panel.add(uploadExcelButton);
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
