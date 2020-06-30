package review;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class buljum {

	private JFrame frame;
	private int personnel =4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buljum window = new buljum();
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
	public buljum() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 320, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\buljum.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (comboBox.getSelectedIndex() == 0) {
					personnel = 4;
				} else if (comboBox.getSelectedIndex() == 1) {
					personnel = 8;
				} else if (comboBox.getSelectedIndex() == 2) {
					personnel = 12;
				} else if (comboBox.getSelectedIndex() == 3) {
					personnel = 16;
				} else if (comboBox.getSelectedIndex() == 4) {
					personnel = 20;
				}
			}
		});
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u2605\u2605\u2605\u2605\u2605");
		rdbtnNewRadioButton.setBounds(28, 89, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u2605\u2605\u2605\u2605");
		rdbtnNewRadioButton_1.setBounds(28, 131, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\u2605\u2605\u2605");
		rdbtnNewRadioButton_2.setBounds(28, 172, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("\u2605\u2605");
		rdbtnNewRadioButton_3.setBounds(161, 89, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("\u2605");
		rdbtnNewRadioButton_3_1.setBounds(161, 131, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3_1);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(301, 302, image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 310, 312);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
