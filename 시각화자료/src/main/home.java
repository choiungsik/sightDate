package main;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import login.DAO;
import login.login;
import meeting.meetin;
import moimmain.JoinMeetAfter;
import moimmain.JoinMeetBefore;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class home {

	JFrame frame;
	private homeDAO dao = new homeDAO();
	DAO ao = new DAO();
	public static int moim_no = 0;
	public static int moim_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
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
	public home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 393, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbl_makemoim = new JLabel("");
		lbl_makemoim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				meetin.main(null);
			}
		});
		
		String path2 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\exit.png";
		Image image2 = new ImageIcon(path2).getImage();
		
		JLabel lbl_exit = new JLabel("");
		lbl_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				logoutbox.main(null);
				
			}
		});
		lbl_exit.setBounds(305, 11, 58, 59);
		frame.getContentPane().add(lbl_exit);
		JLabel lblNewLabel2 = new JLabel(new ImageIcon(image2.getScaledInstance(40, 50, image2.SCALE_SMOOTH)));
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel2.setBounds(315, 10, 40, 50);
		frame.getContentPane().add(lblNewLabel2);
		

		JLabel lblNewLabel_1 = new JLabel(
				"\uC624\uB298 \uC2DC\uC791\uD560 \uBAA8\uC784\uC744 \uB0B4\uC77C\uB85C \uBBF8\uB8E8\uC9C0 \uB9D0\uB77C  ");
		lblNewLabel_1.setFont(new Font("HY중고딕", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(38, 121, 296, 21);
		frame.getContentPane().add(lblNewLabel_1);
		lbl_makemoim.setBounds(247, 508, 118, 35);
		frame.getContentPane().add(lbl_makemoim);

		JLabel lbl_tab = new JLabel("");
		lbl_tab.setBounds(327, 74, 41, 45);
		frame.getContentPane().add(lbl_tab);

		JLabel lbl_mname1 = new JLabel("");
		lbl_mname1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				moim_id = ao.MoimIdSelect(lbl_mname1.getText());
				if (ao.JoinMeetCheck(moim_id)) {
					frame.dispose();
					JoinMeetAfter.main(null);
				} else {
					frame.dispose();
					JoinMeetBefore.main(null);
				}
			}
		});
		lbl_mname1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));

		String text = dao.meetName();
		lbl_mname1.setText(text);

		lbl_mname1.setBounds(90, 227, 200, 31);
		frame.getContentPane().add(lbl_mname1);

		JLabel lbl_mname2 = new JLabel("");
		lbl_mname2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				moim_id = ao.MoimIdSelect(lbl_mname2.getText());
				if (ao.JoinMeetCheck(moim_id)) {
					frame.dispose();
					JoinMeetAfter.main(null);
				} else {
					frame.dispose();
					JoinMeetBefore.main(null);
				}
			}
		});
		lbl_mname2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
		String text2 = dao.meetName();
		lbl_mname2.setText(text2);
		lbl_mname2.setBounds(90, 293, 200, 31);
		frame.getContentPane().add(lbl_mname2);

		JLabel lbl_mname3 = new JLabel("");
		lbl_mname3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				moim_id = ao.MoimIdSelect(lbl_mname3.getText());
				frame.dispose();
				if (ao.JoinMeetCheck(moim_id)) {
					frame.dispose();
					JoinMeetAfter.main(null);
				} else {
					frame.dispose();
					JoinMeetBefore.main(null);
				}
			}
		});
		lbl_mname3.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
		String text3 = dao.meetName();
		lbl_mname3.setText(text3);
		lbl_mname3.setBounds(90, 353, 200, 31);
		frame.getContentPane().add(lbl_mname3);

		JLabel lbl_mname4 = new JLabel("");
		lbl_mname4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				moim_id = ao.MoimIdSelect(lbl_mname4.getText());
				if (ao.JoinMeetCheck(moim_id)) {
					frame.dispose();
					JoinMeetAfter.main(null);
				} else {
					frame.dispose();
					JoinMeetBefore.main(null);
				}
			}
		});
		lbl_mname4.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
		String text4 = dao.meetName();
		lbl_mname4.setText(text4);
		lbl_mname4.setBounds(90, 416, 200, 31);
		frame.getContentPane().add(lbl_mname4);

		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\main1.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(377, 553, image.SCALE_FAST)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 377, 553);
		frame.getContentPane().add(lblNewLabel);

		JLabel lbl_moim = new JLabel("");
		lbl_moim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				moim.main(null);
			}
		});
		lbl_moim.setBounds(79, 68, 50, 31);
		frame.getContentPane().add(lbl_moim);

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
