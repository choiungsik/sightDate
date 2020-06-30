package projectfirst;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;

public class 모임채팅 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					모임채팅 window = new 모임채팅();
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
	public 모임채팅() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 392, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		
		JLabel btn_share = new JLabel("");
		btn_share.setBounds(77, 62, 40, 39);
		btn_share.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				사진공유.main(null);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btn_share);
		
		JLabel btn_pic = new JLabel("");
		btn_pic.setBounds(139, 62, 34, 39);
		btn_pic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임사진방.main(null);
			}
		});
		frame.getContentPane().add(btn_pic);
		
		JLabel btn_chat = new JLabel("");
		btn_chat.setBounds(185, 62, 45, 39);
		btn_chat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임채팅.main(null);
			}
		});
		frame.getContentPane().add(btn_chat);
		
		JLabel btn_write = new JLabel("");
		btn_write.setBounds(252, 62, 49, 39);
		btn_write.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임리뷰방.main(null);
			}
		});
		frame.getContentPane().add(btn_write);
		
		JLabel btn_plp = new JLabel("");
		btn_plp.setBounds(307, 62, 57, 39);
		btn_plp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				멤버확인.main(null);
			}
		});
		frame.getContentPane().add(btn_plp);
		
		JLabel btn_info = new JLabel("");
		btn_info.setBounds(23, 62, 42, 39);
		btn_info.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				모임가입후.main(null);
			}
		});
		frame.getContentPane().add(btn_info);
		
		
		
		String path2 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\시각화자료\\src\\icon\\img (3)\\graycheck2.png";
		Image image2 = new ImageIcon(path2).getImage();
		frame.getContentPane().setLayout(null);
		JLabel graycheck2 = new JLabel(new ImageIcon(image2.getScaledInstance(33,33, image2.SCALE_FAST)));
		graycheck2.setBounds(23, 261, 42, 39);
		graycheck2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				graycheck2.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				try {
					Thread.sleep(1);
				}catch(InterruptedException e1){
					System.out.println(e1.getMessage()); //sleep 메소드가 발생하는 InterruptedException 
				}
				
				graycheck2.setVisible(true);
			}
		});
		graycheck2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(graycheck2);
		
		

		String path3 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\시각화자료\\src\\icon\\img (3)\\graycheck3.png";
		Image image3 = new ImageIcon(path3).getImage();
		frame.getContentPane().setLayout(null);
		JLabel graycheck3 = new JLabel(new ImageIcon(image3.getScaledInstance(33,33, image3.SCALE_FAST)));
		graycheck3.setBounds(23, 337, 42, 39);
		graycheck3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				graycheck3.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				try {
					Thread.sleep(1);
				}catch(InterruptedException e1){
					System.out.println(e1.getMessage()); //sleep 메소드가 발생하는 InterruptedException 
				}
				
				graycheck3.setVisible(true);
			}
		});
		graycheck3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(graycheck3);
		
		

		String path4 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\시각화자료\\src\\icon\\img (3)\\graycheck4.png";
		Image image4 = new ImageIcon(path4).getImage();
		frame.getContentPane().setLayout(null);
		JLabel graycheck4 = new JLabel(new ImageIcon(image4.getScaledInstance(33,33, image4.SCALE_FAST)));
		graycheck4.setBounds(23, 420, 42, 39);
		graycheck4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				graycheck4.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				try {
					Thread.sleep(1);
				}catch(InterruptedException e1){
					System.out.println(e1.getMessage()); //sleep 메소드가 발생하는 InterruptedException 
				}
				
				graycheck4.setVisible(true);
			}
		});
		graycheck4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(graycheck4);
		
		
		
		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\시각화자료\\src\\icon\\img (3)\\graycheck.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel graycheck1 = new JLabel(new ImageIcon(image.getScaledInstance(33,33, image.SCALE_FAST)));
		graycheck1.setBounds(23, 191, 42, 39);
		graycheck1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				graycheck1.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				try {
					Thread.sleep(1);
				}catch(InterruptedException e1){
					System.out.println(e1.getMessage()); //sleep 메소드가 발생하는 InterruptedException 
				}
				
				graycheck1.setVisible(true);
			}
		});
		graycheck1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(graycheck1);
		
		
		   String path8 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\시각화자료\\src\\icon\\img (3)\\blueplp.png";
		      Image image8 = new ImageIcon(path8).getImage();
		      JLabel blueplp = new JLabel(new ImageIcon(image8.getScaledInstance(74,68 ,image8.SCALE_SMOOTH)));
		      blueplp.setBounds(65, 250, 57, 68);
		      blueplp.setHorizontalAlignment(SwingConstants.CENTER);
		      frame.getContentPane().add(blueplp);
		
		
			   String path9 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\시각화자료\\src\\icon\\img (3)\\blueplp.png";
			      Image image9 = new ImageIcon(path9).getImage();
			      JLabel blueplp2 = new JLabel(new ImageIcon(image8.getScaledInstance(74,68 ,image9.SCALE_SMOOTH)));
			      blueplp2.setBounds(62, 173, 57, 68);
			      blueplp2.setHorizontalAlignment(SwingConstants.CENTER);
			      frame.getContentPane().add(blueplp2);
		
		

		

	
		String path5 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\시각화자료\\src\\icon\\img (3)\\대화창.png";
		Image image5 = new ImageIcon(path5).getImage();
		frame.getContentPane().setLayout(null);
		JLabel whole = new JLabel(new ImageIcon(image5.getScaledInstance(369,536, image5.SCALE_FAST)));
		whole.setBounds(0, 0, 369, 543);
		whole.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(whole);
		
		JLabel set = new JLabel("");
		set.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				모임설정창.main(null);
			}
		});
		set.setBounds(307, 37, 57, 30);
		frame.getContentPane().add(set);
		
		
		
		
		
		
	}

}
