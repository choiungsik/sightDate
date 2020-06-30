package moimmain;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JoinMeetChat {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinMeetChat window = new JoinMeetChat();
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
	public JoinMeetChat() {
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
		
		

		
		JLabel btn_sec = new JLabel("");
		btn_sec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JoinMeetShare.main(null);
			}
		});
		btn_sec.setBounds(77, 62, 40, 39);
		frame.getContentPane().add(btn_sec);
		
		JLabel btn_third = new JLabel("");
		btn_third.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JoinMeetPicture.main(null);
			}
		});
		btn_third.setBounds(139, 62, 34, 39);
		frame.getContentPane().add(btn_third);
		
		JLabel btn_four = new JLabel("");
		btn_four.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JoinMeetChat.main(null);
			}
		});
		btn_four.setBounds(185, 62, 45, 39);
		frame.getContentPane().add(btn_four);
		
		JLabel btn_five = new JLabel("");
		btn_five.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JoinMeetReview.main(null);
			}
		});
		btn_five.setBounds(252, 62, 49, 39);
		frame.getContentPane().add(btn_five);
		
		JLabel btn_six = new JLabel("");
		btn_six.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JoinMeetMember.main(null);
			}
		});
		btn_six.setBounds(307, 62, 57, 39);
		frame.getContentPane().add(btn_six);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				JoinMeetAfter.main(null);
			}
		});
		lblNewLabel_1.setBounds(23, 62, 42, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lbl_char = new JLabel("");
		lbl_char.setBounds(60, 171, 289, 65);
		frame.getContentPane().add(lbl_char);
		
//		String study = "C:\\Users\\smhrd\\Desktop\\Java_workspace\\eclipse\\img\\최도현2.png";
//		Image image4 = new ImageIcon(study).getImage();
//		frame.getContentPane().setLayout(null);
//		JLabel btn_study = new JLabel(new ImageIcon(image4.getScaledInstance(289,69, image4.SCALE_SMOOTH)));
//		btn_study.addMouseListener(new MouseAdapter() {
//		
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				btn_study.setVisible(false);						// study 마우스올릴시 파란아이콘
//			}
//		});
//		btn_study.setHorizontalAlignment(SwingConstants.CENTER);
//		btn_study.setBounds(60, 171, 289,69);
//		frame.getContentPane().add(btn_study);
		
				
		
		
		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\img\\가입후채팅.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(344, 502, image.SCALE_FAST)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 376, 553);
		frame.getContentPane().add(lblNewLabel);
		
		
		
	}

}
