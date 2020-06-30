package main;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class buyok {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buyok window = new buyok();
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
	public buyok() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 352, 227);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.getContentPane().setLayout(null);
		 
	      JLabel lbl_yes = new JLabel("");
	      lbl_yes.setBounds(53, 102, 95, 40);
	      frame.getContentPane().add(lbl_yes);
	      
	      JLabel lbl_no = new JLabel("");
	      lbl_no.setBounds(182, 102, 95, 40);
	      frame.getContentPane().add(lbl_no);
		
		 String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\buyok.png";
	      Image image = new ImageIcon(path).getImage();
	      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(251,119, image.SCALE_SMOOTH)));
	      lblNewLabel.setBounds(0, 0, 336, 188);
	      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	      frame.getContentPane().add(lblNewLabel);
	      
	      JLabel lbl_okbtn = new JLabel("New label");
	      lbl_okbtn.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		frame.dispose();
	      		book.main(null);
	      	}
	      });
	      lbl_okbtn.setBounds(125, 112, 95, 40);
	      frame.getContentPane().add(lbl_okbtn);
	}

}
