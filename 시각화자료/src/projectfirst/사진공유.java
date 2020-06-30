package projectfirst;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class 사진공유 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					사진공유 window = new 사진공유();
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
	public 사진공유() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 392, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\시각화자료\\src\\icon\\img (3)\\가입후공유.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(344, 502, image.SCALE_FAST)));
		lblNewLabel.setBounds(0, 0, 376, 553);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel btn_sec = new JLabel("");
		btn_sec.setBounds(77, 62, 40, 39);
		btn_sec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				사진공유.main(null);
			}
		});
		frame.getContentPane().add(btn_sec);
		
		JLabel btn_third = new JLabel("");
		btn_third.setBounds(139, 62, 34, 39);
		btn_third.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임사진방.main(null);
			}
		});
		frame.getContentPane().add(btn_third);
		
		JLabel btn_four = new JLabel("");
		btn_four.setBounds(185, 62, 45, 39);
		btn_four.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임채팅.main(null);
			}
		});
		frame.getContentPane().add(btn_four);
		
		JLabel btn_five = new JLabel("");
		btn_five.setBounds(252, 62, 49, 39);
		btn_five.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임리뷰방.main(null);
			}
		});
		frame.getContentPane().add(btn_five);
		
		JLabel btn_six = new JLabel("");
		btn_six.setBounds(307, 62, 57, 39);
		btn_six.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				멤버확인.main(null);
			}
		});
		frame.getContentPane().add(btn_six);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(23, 62, 42, 39);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				모임가입후.main(null);
			}
		});
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lbl_thumb = new JLabel("New label");
		lbl_thumb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				LikeIt.main(null);
			}
		});
		lbl_thumb.setBounds(58, 509, 65, 15);
		frame.getContentPane().add(lbl_thumb);
		
		JLabel lbl_write = new JLabel("New label");
		lbl_write.setBounds(235, 509, 65, 15);
		frame.getContentPane().add(lbl_write);
		
		JLabel set = new JLabel("New label");
		set.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임설정창.main(null);
			}
		});
		set.setBounds(307, 25, 57, 27);
		frame.getContentPane().add(set);
	}

}
