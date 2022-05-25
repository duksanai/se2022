package storeUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager_UI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager_UI window = new Manager_UI();
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
	public Manager_UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 512, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel info = new JPanel();
		info.setBackground(Color.WHITE);
		info.setBounds(12, 10, 472, 55);
		frame.getContentPane().add(info);
		info.setLayout(new BorderLayout(0, 0));
		
		JTextPane modeTxt = new JTextPane();
		modeTxt.setEditable(false);
		modeTxt.setFont(new Font("굴림", Font.PLAIN, 40));
		modeTxt.setText("\uAD00\uB9AC\uC790\uBAA8\uB4DC");
		info.add(modeTxt);
		
		JTextPane date = new JTextPane();
		date.setEditable(false);
		date.setText("2022-05-04 13:04:23 (\uC218)");
		info.add(date, BorderLayout.EAST);
		
		JButton salesbtn = new JButton("\uB9E4\uC7A5\uB9E4\uCD9C\uC870\uD68C");
		salesbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalesCheck scframe = new SalesCheck();
				scframe.setVisible(true);
				frame.dispose();
			}
		});
		salesbtn.setBounds(12, 75, 116, 246);
		frame.getContentPane().add(salesbtn);
		
		JButton workbtn = new JButton("\uADFC\uBB34\uD604\uD669\uC870\uD68C");
		workbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WorkTimePage ewframe = new WorkTimePage();
				ewframe.setVisible(true);
				frame.dispose();
			}
		});
		workbtn.setBounds(268, 75, 116, 246);
		frame.getContentPane().add(workbtn);
		
		JButton employeebtn = new JButton("직원 관리");
		employeebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffSearchPage ecframe = new StaffSearchPage();
				ecframe.setVisible(true);
				frame.dispose();
			}
		});
		employeebtn.setBounds(140, 75, 116, 246);
		frame.getContentPane().add(employeebtn);
		
		JButton pwChangebtn = new JButton("\uC554\uD638 \uBCC0\uACBD");
		pwChangebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PasswordChange pcframe = new PasswordChange();
				pcframe.setVisible(true);
				frame.dispose();
			}
		});
		pwChangebtn.setBounds(396, 75, 90, 114);
		frame.getContentPane().add(pwChangebtn);
		
		JButton backbtn = new JButton("메인화면");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_UI mp = new Main_UI();
				mp.setVisible(true);
				frame.dispose();
			}
		});
		backbtn.setBounds(396, 207, 90, 114);
		frame.getContentPane().add(backbtn);
	}
	public void setVisible(boolean b) {
		frame.setVisible(b);
	}

	public void dispose() {
		frame.dispose();
	}
}
