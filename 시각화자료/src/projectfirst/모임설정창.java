package projectfirst;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ���Ӽ���â {

	private JFrame frame;
	boolean boo = false;
	boolean boo2 = true;
	boolean flag = false;
	boolean flag2 = false;
	boolean flag3 = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					���Ӽ���â window = new ���Ӽ���â();
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
	public ���Ӽ���â() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel byemoim = new JLabel("");
		byemoim.setBounds(101, 448, 180, 44);
		byemoim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				byem.main(null);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(byemoim);

		String path2 = "C:\\Users\\smhrd\\Downloads\\������������\\�۾�\\javaworkspace\\�ð�ȭ�ڷ�\\src\\icon\\img (3)\\greenbtn.png";
		Image image2 = new ImageIcon(path2).getImage();

		JLabel gray1 = new JLabel(new ImageIcon(image2.getScaledInstance(72, 55, image2.SCALE_SMOOTH)));
		gray1.setBounds(295, 196, 89, 38);
		gray1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(gray1);

		String path = "C:\\Users\\smhrd\\Downloads\\������������\\�۾�\\javaworkspace\\�ð�ȭ�ڷ�\\src\\icon\\img (3)\\����.png";
		Image image = new ImageIcon(path).getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(53, 34, image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(352, 4, 23, 28);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);

		JLabel gray1_1 = new JLabel("");
		gray1_1.setBounds(295, 196, 89, 38);
		gray1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

//				System.out.println("gray1_1 : "+flag);
				if (flag) {
					gray1.setVisible(true);
				} else {
					gray1.setVisible(false);
				}
				flag = !flag;
			}
		});
		frame.getContentPane().add(gray1_1);

		String path3 = "C:\\Users\\smhrd\\Downloads\\������������\\�۾�\\javaworkspace\\�ð�ȭ�ڷ�\\src\\icon\\img (3)\\greenbtn.png";
		Image image3 = new ImageIcon(path3).getImage();
		frame.getContentPane().setLayout(null);
		JLabel gray2 = new JLabel(new ImageIcon(image3.getScaledInstance(72, 55, image3.SCALE_SMOOTH)));
		gray2.setBounds(295, 255, 89, 28);

		gray2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(gray2);

		JLabel gray2_1 = new JLabel("");
		gray2_1.setBounds(295, 244, 89, 38);
		gray2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				System.out.println("gray2_1 : " + flag);
				if (flag2) {
					gray2.setVisible(true);
				} else {
					gray2.setVisible(false);
				}
				flag2 = !flag2;
			}
		});
		frame.getContentPane().add(gray2_1);

		String path4 = "C:\\Users\\smhrd\\Downloads\\������������\\�۾�\\javaworkspace\\�ð�ȭ�ڷ�\\src\\icon\\img (3)\\greenbtn.png";
		Image image4 = new ImageIcon(path4).getImage();
		frame.getContentPane().setLayout(null);
		JLabel gray3 = new JLabel(new ImageIcon(image3.getScaledInstance(72, 55, image4.SCALE_SMOOTH)));
		gray3.setBounds(295, 302, 89, 38);
		gray3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(gray3);

		JLabel gray3_1 = new JLabel("");
		gray3_1.setBounds(277, 293, 107, 47);

		gray3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

//				System.out.println("gray1_1 : "+flag);
				if (flag) {
					gray3.setVisible(true);
				} else {
					gray3.setVisible(false);
				}
				flag = !flag;
			}
		});
		frame.getContentPane().add(gray3_1);

		String path5 = "C:\\Users\\smhrd\\Downloads\\������������\\�۾�\\javaworkspace\\�ð�ȭ�ڷ�\\src\\icon\\img (3)\\greenbtn.png";
		Image image5 = new ImageIcon(path5).getImage();
		frame.getContentPane().setLayout(null);
		JLabel gray4 = new JLabel(new ImageIcon(image5.getScaledInstance(72, 55, image5.SCALE_SMOOTH)));
		gray4.setBounds(295, 359, 89, 38);
		gray4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(gray4);

		JLabel gray4_1 = new JLabel("");
		gray4_1.setBounds(305, 359, 67, 38);
		gray4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

//				System.out.println("gray1_1 : "+flag);
				if (flag) {
					gray4.setVisible(true);
				} else {
					gray4.setVisible(false);
				}
				flag = !flag;
			}
		});
		frame.getContentPane().add(gray4_1);

		String path8 = "C:\\Users\\smhrd\\Downloads\\������������\\�۾�\\javaworkspace\\�ð�ȭ�ڷ�\\src\\icon\\img (3)\\����â.png";
		Image image8 = new ImageIcon(path8).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel8 = new JLabel(new ImageIcon(image8.getScaledInstance(380, 549, image8.SCALE_SMOOTH)));
		lblNewLabel8.setBounds(0, 0, 384, 521);
		lblNewLabel8.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel8);

		JLabel gray2_2 = new JLabel("");
		gray2_2.setBounds(305, 244, 67, 38);
		frame.getContentPane().add(gray2_2);
		
		JLabel xâ = new JLabel("");
		xâ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				���Ӱ�����.main(null);
				
			}
		});
		xâ.setBounds(333, 7, 44, 21);
		frame.getContentPane().add(xâ);

	}

}
