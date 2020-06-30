package main;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import meeting.meetin;

import javax.swing.JTextField;

public class search {

	private JFrame frame;
	private JTextField txt_search;
	private homeDAO dao = new homeDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search window = new search();
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
	public search() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 393, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lbl_moimmake = new JLabel("");
		lbl_moimmake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				meetin.main(null);
			}
		});
		lbl_moimmake.setBounds(251, 505, 114, 38);
		frame.getContentPane().add(lbl_moimmake);

		txt_search = new JTextField();

		txt_search.setBorder(null);
		txt_search.setBounds(26, 150, 319, 21);
		frame.getContentPane().add(txt_search);
		txt_search.setColumns(10);
		
		

		JLabel moim1 = new JLabel("");
		moim1.setBounds(85, 232, 196, 22);
		frame.getContentPane().add(moim1);

		JLabel moim2 = new JLabel("");
		moim2.setBounds(85, 295, 196, 22);
		frame.getContentPane().add(moim2);

		JLabel moim3 = new JLabel("");
		moim3.setBounds(85, 357, 196, 22);
		frame.getContentPane().add(moim3);

		JLabel moim4 = new JLabel("");
		moim4.setBounds(85, 419, 196, 22);
		frame.getContentPane().add(moim4);

		String path1 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\searchButtn.png"; // 이거
		Image image1 = new ImageIcon(path1).getImage(); // 이거
		JLabel btn_search = new JLabel(new ImageIcon(image1.getScaledInstance(42, 37, image1.SCALE_SMOOTH))); // 이거
		btn_search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String search = txt_search.getText();
				String search2 = dao.searchVO(search);
				String search3 = dao.searchVO(search);
				String search4 = dao.searchVO(search);
				String search5 = dao.searchVO(search);
			
				moim1.setText(search2);
				moim2.setText(search3);
				moim3.setText(search4);
				moim4.setText(search5);
				
			}

		});
		

		btn_search.setHorizontalAlignment(SwingConstants.CENTER); // 이거
		btn_search.setBounds(347, 144, 30, 37); // 이거
		frame.getContentPane().add(btn_search); // 이거

		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\search.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(377, 553, image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 377, 553);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		JLabel lbl_moim = new JLabel("New label");
		lbl_moim.setBounds(67, 63, 50, 31);
		lbl_moim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				moim.main(null);
			}
		});
		frame.getContentPane().add(lbl_moim);

		JLabel lbl_book = new JLabel("New label");
		lbl_book.setBounds(212, 56, 41, 45);
		lbl_book.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				book.main(null);
			}
		});
		frame.getContentPane().add(lbl_book);

		JLabel lbl_chat = new JLabel("New label");
		lbl_chat.setBounds(274, 56, 41, 45);
		frame.getContentPane().add(lbl_chat);

		JLabel lbl_home = new JLabel("New label");
		lbl_home.setBounds(12, 63, 43, 31);
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				home.main(null);
			}
		});
		frame.getContentPane().add(lbl_home);

		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(327, 63, 43, 31);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lbl_tab = new JLabel("New label");
		lbl_tab.setBounds(327, 63, 43, 31);
		frame.getContentPane().add(lbl_tab);

	}
}
