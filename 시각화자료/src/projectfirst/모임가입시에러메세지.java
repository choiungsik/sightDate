package projectfirst;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ���Ӱ��Խÿ����޼��� {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					���Ӱ��Խÿ����޼��� window = new ���Ӱ��Խÿ����޼���();
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
	public ���Ӱ��Խÿ����޼���() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 352, 227);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String path = "C:\\Users\\smhrd\\Downloads\\������������\\�۾�\\javaworkspace\\�ð�ȭ�ڷ�\\src\\icon\\img (3)\\���Խÿ���â.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(226,113, image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(12, 0, 312, 178);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbl_error = new JLabel("New label");
		lbl_error.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				���Ӱ��Խ�.main(null);
			}
		});
		lbl_error.setBounds(83, 99, 182, 33);
		frame.getContentPane().add(lbl_error);
		
		JLabel btn_okay = new JLabel("New label");
	}

}
