package projectfirst;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class 모임가입시 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					모임가입시 window = new 모임가입시();
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
	public 모임가입시() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 393, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\시각화자료\\src\\icon\\img (3)\\roominfo.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(377, 553, image.SCALE_SMOOTH)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 377, 553);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbl_join = new JLabel("");
		lbl_join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임가입후.main(null);
			}
		});
		lbl_join.setBounds(27, 484, 324, 40);
		frame.getContentPane().add(lbl_join);
		
		JLabel lbl_share = new JLabel("New label");
		lbl_share.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임가입시에러메세지.main(null);
				
			}
		});
		lbl_share.setBounds(65, 54, 41, 22);
		frame.getContentPane().add(lbl_share);
		
		JLabel lbl_pic = new JLabel("New label");
		lbl_pic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임가입시에러메세지.main(null);
			}
		});
		lbl_pic.setBounds(133, 54, 41, 22);
		frame.getContentPane().add(lbl_pic);
		
		JLabel lbl_chat = new JLabel("New label");
		lbl_chat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임가입시에러메세지.main(null);
			}
		});
		
		lbl_chat.setBounds(195, 54, 41, 22);
		frame.getContentPane().add(lbl_chat);
		
		JLabel lbl_write = new JLabel("New label");
		lbl_write.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임가입시에러메세지.main(null);
			}
		});
		lbl_write.setBounds(266, 54, 41, 22);
		frame.getContentPane().add(lbl_write);
		
		JLabel lbl_plp = new JLabel("New label");
		lbl_plp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임가입시에러메세지.main(null);
			}
		});
		lbl_plp.setBounds(319, 54, 41, 22);
		frame.getContentPane().add(lbl_plp);
		
		JLabel lbl_set = new JLabel("New label");
		lbl_set.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임가입시에러메세지.main(null);
			}
		});
		lbl_set.setBounds(324, 10, 41, 22);
		frame.getContentPane().add(lbl_set);

	}

}
