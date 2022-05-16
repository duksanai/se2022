package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton GoodsRegister = new JButton("\uC0C1\uD488 \uB4F1\uB85D");
		GoodsRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GoodsRegistration grframe = new GoodsRegistration();
				grframe.setVisible(true);
				frame.dispose();
			}
		});
		GoodsRegister.setBounds(146, 265, 122, 130);
		frame.getContentPane().add(GoodsRegister);

		JButton GoodsManagement = new JButton("\uC0C1\uD488 \uAD00\uB9AC");
		GoodsManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GoodsInfo giframe = new GoodsInfo();
				giframe.setVisible(true);
				frame.dispose();
			}
		});
		GoodsManagement.setBounds(280, 265, 122, 130);
		frame.getContentPane().add(GoodsManagement);

		JButton SellButton = new JButton("\uC0C1\uD488 \uD310\uB9E4");
		SellButton.setBounds(14, 75, 388, 180);
		SellButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GoodsSell gsframe = new GoodsSell();
				gsframe.setVisible(true);
				frame.dispose();
			}
		});
		frame.getContentPane().add(SellButton);

		JButton Receiving = new JButton("\uC785\uACE0 \uCC98\uB9AC");
		Receiving.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receiving recframe = new Receiving();
				recframe.setVisible(true);
				frame.dispose();
			}
		});
		Receiving.setBounds(12, 265, 122, 130);
		frame.getContentPane().add(Receiving);

		JButton Receipt = new JButton("\uC601\uC218\uC99D \uC870\uD68C");
		Receipt.setBounds(414, 188, 160, 67);
		Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receipt receiptframe = new Receipt();
				receiptframe.setVisible(true);
				frame.dispose();
			}
		});
		frame.getContentPane().add(Receipt);

		JPanel Info = new JPanel();
		Info.setBackground(Color.WHITE);
		Info.setBounds(14, 10, 560, 55);
		frame.getContentPane().add(Info);
		Info.setLayout(null);

		JTextPane nowEmp = new JTextPane();
		nowEmp.setBounds(466, 34, 94, 21);
		nowEmp.setEditable(false);
		nowEmp.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		nowEmp.setText("\uADFC\uBB34 \uC9C1\uC6D0: OOO");
		Info.add(nowEmp);

		JTextPane date = new JTextPane();
		date.setBounds(413, 0, 147, 24);
		date.setEditable(false);
		date.setText("2022-05-04 13:04:23 (\uC218)");
		Info.add(date);
		
		JTextPane storeName = new JTextPane();
		storeName.setText("OO\uB9C8\uD2B8");
		storeName.setEditable(false);
		storeName.setFont(new Font("±¼¸²", Font.BOLD, 40));
		storeName.setBounds(0, 0, 247, 55);
		Info.add(storeName);

		JButton Manager = new JButton("\uAD00\uB9AC\uC790 \uBAA8\uB4DC \uC9C4\uC785");
		Manager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PasswordCheck pcframe = new PasswordCheck();
				pcframe.setVisible(true);
				frame.dispose();
			}
		});
		Manager.setBounds(414, 265, 160, 130);
		frame.getContentPane().add(Manager);
		
		JButton empChangebtn = new JButton("\uC9C1\uC6D0 \uAD50\uB300");
		empChangebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeChange ecframe = new EmployeeChange();
				ecframe.setVisible(true);
			}
		});
		empChangebtn.setBounds(414, 75, 158, 28);
		frame.getContentPane().add(empChangebtn);
		
		JButton customerbtn = new JButton("\uACE0\uAC1D \uAD00\uB9AC");
		customerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerManagement cmframe = new CustomerManagement();
				cmframe.setVisible(true);
				frame.dispose();
			}
		});
		customerbtn.setBounds(412, 111, 160, 67);
		frame.getContentPane().add(customerbtn);

	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
