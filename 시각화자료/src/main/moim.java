package main;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import login.DAO;
import meeting.meetin;

public class moim {

	private JFrame frame;
	private homeDAO dao = new homeDAO();
	DAO ao = new DAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					moim window = new moim();
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
	public moim() {
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
		lbl_moimmake.setBounds(258, 511, 110, 32);
		frame.getContentPane().add(lbl_moimmake);

		JLabel lbl_tab = new JLabel("");
		lbl_tab.setBounds(327, 74, 41, 45);
		frame.getContentPane().add(lbl_tab);

		JLabel moim1 = new JLabel("");
		String text = dao.meetinter();
		moim1.setText(text);
		moim1.setBounds(87, 235, 196, 22);
		frame.getContentPane().add(moim1);

		JLabel moim2 = new JLabel("");
		String text2 = dao.meetinter();
		moim2.setText(text2);
		moim2.setBounds(87, 298, 196, 22);
		frame.getContentPane().add(moim2);

		JLabel moim3 = new JLabel("");
		String text3 = dao.meetinter();
		moim3.setText(text3);
		moim3.setBounds(87, 361, 196, 22);
		frame.getContentPane().add(moim3);

		JLabel moim4 = new JLabel("");
		String text4 = dao.meetinter();
		moim4.setText(text4);
		moim4.setBounds(87, 422, 196, 22);
		frame.getContentPane().add(moim4);

		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\moim.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(377, 553, image.SCALE_SMOOTH)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 377, 553);
		frame.getContentPane().add(lblNewLabel);

		JLabel lbl_moim = new JLabel("");
		lbl_moim.setBounds(87, 74, 41, 45);
		frame.getContentPane().add(lbl_moim);

		JLabel lbl_home = new JLabel("");
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				home.main(null);
			}
		});
		lbl_home.setBounds(23, 62, 41, 45);
		frame.getContentPane().add(lbl_home);

		JLabel lbl_search = new JLabel("");
		lbl_search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				search.main(null);
			}
		});
		lbl_search.setBounds(150, 74, 41, 45);
		frame.getContentPane().add(lbl_search);

		JLabel lbl_book = new JLabel("");
		lbl_book.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				book.main(null);
			}
		});
		lbl_book.setBounds(213, 74, 41, 45);
		frame.getContentPane().add(lbl_book);

		JLabel lbl_chat = new JLabel("");
		lbl_chat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				chat.main(null);
			}
		});
		lbl_chat.setBounds(274, 74, 41, 45);
		frame.getContentPane().add(lbl_chat);

	}
}
