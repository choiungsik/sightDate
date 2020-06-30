package moimmain;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import chart.ChartView;
import main.home;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JoinMeetAfter {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinMeetAfter window = new JoinMeetAfter();
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
	public JoinMeetAfter() {
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
		
		
		
		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\img\\가입후.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_chart = new JLabel("");
		lbl_chart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				ChartView.main(null);
			}
		});
		lbl_chart.setBounds(147, 29, 57, 24);
		frame.getContentPane().add(lbl_chart);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(344, 502, image.SCALE_FAST)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 376, 553);
		frame.getContentPane().add(lblNewLabel);
		
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
	}

}
