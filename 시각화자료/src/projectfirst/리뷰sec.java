package projectfirst;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ¸®ºäsec {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					¸®ºäsec window = new ¸®ºäsec();
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
	public ¸®ºäsec() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String path = "C:\\Users\\smhrd\\Downloads\\¼ö¾÷³»¿ëÁ¤¸®\\ÀÛ¾÷\\javaworkspace\\½Ã°¢È­ÀÚ·á\\src\\icon\\img (3)\\¸®ºä2.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(379, 340, image.SCALE_FAST)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 384, 336);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel shutdown = new JLabel("");
		shutdown.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		shutdown.setBounds(347, 0, 37, 20);
		frame.getContentPane().add(shutdown);

	}
	}


