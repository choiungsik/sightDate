package moimmain;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import chart.ChartView;
import login.DAO;
import main.home;
import main.logoutbox;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JoinMeetBefore {

	private JFrame frame;
	private JTextField text_moinname;
	DAO dao = new DAO();
	private JLabel lbl_countblock;
	private JTextField text_count;
	private JLabel lbl_chart;
	private JLabel lbl_infor;
	private JLabel lbl_share;
	private JLabel lbl_picture;
	private JLabel lbl_chat;
	private JLabel lbl_review;
	private JLabel lbl_member;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinMeetBefore window = new JoinMeetBefore();
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
	public JoinMeetBefore() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 392, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String path2 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\exit.png";
		Image image2 = new ImageIcon(path2).getImage();
		
		JLabel lbl_exit = new JLabel("");
		lbl_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				home.main(null);
				
			}
		});
		lbl_exit.setBounds(305, 11, 58, 59);
		frame.getContentPane().add(lbl_exit);
		JLabel lblNewLabel2 = new JLabel(new ImageIcon(image2.getScaledInstance(40, 50, image2.SCALE_SMOOTH)));
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel2.setBounds(315, 10, 40, 50);
		frame.getContentPane().add(lblNewLabel2);
		
		
		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\img\\roominfo.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		
		lbl_chart = new JLabel("");
		lbl_chart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				ChartView.main(null);
			}
		});
		
		lbl_member = new JLabel("");
		lbl_member.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "모임가입 후 이용할 수 있습니다.", "에러메세지", JOptionPane.WARNING_MESSAGE);
			}
		});
		lbl_member.setBounds(311, 71, 35, 25);
		frame.getContentPane().add(lbl_member);
		
		lbl_picture = new JLabel("");
		lbl_picture.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "모임가입 후 이용할 수 있습니다.", "에러메세지", JOptionPane.WARNING_MESSAGE);
			}
		});
		lbl_picture.setBounds(137, 71, 35, 25);
		frame.getContentPane().add(lbl_picture);
		
		lbl_review = new JLabel("");
		lbl_review.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JoinMeetReview.main(null);
			}
		});
		lbl_review.setBounds(256, 71, 35, 25);
		frame.getContentPane().add(lbl_review);
		
		lbl_chat = new JLabel("");
		lbl_chat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "모임가입 후 이용할 수 있습니다.", "에러메세지", JOptionPane.WARNING_MESSAGE);
			}
		});
		lbl_chat.setBounds(191, 71, 35, 25);
		frame.getContentPane().add(lbl_chat);
		
		lbl_share = new JLabel("");
		lbl_share.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "모임가입 후 이용할 수 있습니다.", "에러메세지", JOptionPane.WARNING_MESSAGE);
			}
		});
		lbl_share.setBounds(77, 70, 35, 25);
		frame.getContentPane().add(lbl_share);
		
		lbl_infor = new JLabel("");
		lbl_infor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				if (dao.JoinMeetCheck(home.moim_id)) {
					frame.dispose();
					JoinMeetAfter.main(null);
				} else {
					frame.dispose();
					JoinMeetBefore.main(null);
				}
			}
		});
		lbl_infor.setBounds(26, 71, 35, 25);
		frame.getContentPane().add(lbl_infor);
		lbl_chart.setBounds(138, 26, 64, 25);
		frame.getContentPane().add(lbl_chart);
		
		text_count = new JTextField();
		text_count.setEditable(false);
		text_count.setBounds(104, 49, 14, 25);
		frame.getContentPane().add(text_count);
		text_count.setColumns(10);
		text_count.setBorder(null);
		
		lbl_countblock = new JLabel("New label");
		lbl_countblock.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\background.PNG"));
		lbl_countblock.setBounds(104, 50, 14, 22);
		frame.getContentPane().add(lbl_countblock);
		
		text_moinname = new JTextField();
		text_moinname.setHorizontalAlignment(SwingConstants.CENTER);
		text_moinname.setEditable(false);
		text_moinname.setFont(new Font("굴림", Font.BOLD, 15));
		text_moinname.setBounds(12, 26, 127, 29);
		frame.getContentPane().add(text_moinname);
		text_moinname.setColumns(10);
		text_moinname.setText(dao.MoimNameGet(home.moim_id));
		text_moinname.setBorder(null);
		
		JLabel lbl_nameblock = new JLabel("");
		lbl_nameblock.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\background.PNG"));
		lbl_nameblock.setBounds(12, 26, 127, 26);
		frame.getContentPane().add(lbl_nameblock);
		
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(344, 502, image.SCALE_SMOOTH)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 376, 553);
		frame.getContentPane().add(lblNewLabel);

	}
}
