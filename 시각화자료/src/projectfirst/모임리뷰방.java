package projectfirst;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ¸ðÀÓ¸®ºä¹æ {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					¸ðÀÓ¸®ºä¹æ window = new ¸ðÀÓ¸®ºä¹æ();
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
	public ¸ðÀÓ¸®ºä¹æ() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 392, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String path = "C:\\Users\\smhrd\\Downloads\\¼ö¾÷³»¿ëÁ¤¸®\\ÀÛ¾÷\\javaworkspace\\½Ã°¢È­ÀÚ·á\\src\\icon\\img (3)\\¸ðÀÓ¸®ºä¹æ.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(344, 502, image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(-4, -5, 376, 553);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
	

		JLabel btn_sec = new JLabel("");
		btn_sec.setBounds(77, 62, 40, 39);
		btn_sec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				»çÁø°øÀ¯.main(null);
			}
		});
		frame.getContentPane().add(btn_sec);

		JLabel btn_third = new JLabel("");
		btn_third.setBounds(139, 62, 34, 39);
		btn_third.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				¸ðÀÓ»çÁø¹æ.main(null);
			}
		});
		frame.getContentPane().add(btn_third);

		JLabel btn_four = new JLabel("");
		btn_four.setBounds(185, 62, 45, 39);
		btn_four.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				¸ðÀÓÃ¤ÆÃ.main(null);
			}
		});
		frame.getContentPane().add(btn_four);

		JLabel btn_five = new JLabel("");
		btn_five.setBounds(252, 62, 49, 39);
		btn_five.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				¸ðÀÓ¸®ºä¹æ.main(null);
			}
		});
		frame.getContentPane().add(btn_five);

		JLabel btn_six = new JLabel("");
		btn_six.setBounds(307, 62, 57, 39);
		btn_six.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				¸â¹öÈ®ÀÎ.main(null);
			}
		});
		frame.getContentPane().add(btn_six);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(23, 62, 42, 39);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				¸ðÀÓ°¡ÀÔÈÄ.main(null);
			}
		});
		frame.getContentPane().add(lblNewLabel_1);

		JLabel ¸®ºä1_1 = new JLabel("New label");
		¸®ºä1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				¸®ºä1.main(null);
				
			}
		});
		¸®ºä1_1.setBounds(27, 151, 312, 67);
		frame.getContentPane().add(¸®ºä1_1);

		JLabel ¸®ºä2 = new JLabel("New label");
		¸®ºä2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				¸®ºäsec.main(null);
			}
		});
		¸®ºä2.setBounds(21, 232, 312, 69);
		frame.getContentPane().add(¸®ºä2);

		JLabel ¸®ºä3 = new JLabel("New label");
		¸®ºä3.setBounds(22, 310, 312, 60);
		frame.getContentPane().add(¸®ºä3);

		JLabel ¸®ºä4 = new JLabel("New label");
		¸®ºä4.setBounds(17, 385, 312, 69);
		frame.getContentPane().add(¸®ºä4);
		
		JLabel settings = new JLabel("New label");
		settings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				¸ðÀÓ¼³Á¤Ã¢.main(null);
			}
		});
		settings.setBounds(296, 37, 40, 31);
		frame.getContentPane().add(settings);
	}

}
