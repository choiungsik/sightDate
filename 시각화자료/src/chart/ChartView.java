package chart;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import login.DAO;
import main.home;
import moimmain.JoinMeetAfter;
import moimmain.JoinMeetBefore;
import javax.swing.ImageIcon;

public class ChartView {

	private JFrame frame;
	DAO ao = new DAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChartView window = new ChartView();
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
	public ChartView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private Object[] arr;

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 805, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 413, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 775, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);

		ReadCSV csv = new ReadCSV();
		ArrayList<MaleVO> list = csv.getList();

		// ===========================================================================================================
		DefaultPieDataset dataset = new DefaultPieDataset();// ���� ����
		int male = 0;
		int female = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSex().equals("male")) {
				male++;
				dataset.setValue(list.get(i).getSex(), male);
			} else {
				female++;
				dataset.setValue(list.get(i).getSex(), female);
			}
		}

		JFreeChart pieChart = ChartFactory.createPieChart("���Ӻ� �������", dataset, true, true, true);
		Font f = new Font("Gulim", Font.BOLD, 14);

		pieChart.getTitle().setFont(f);

		PiePlot plot2 = (PiePlot) pieChart.getPlot();
		plot2.setLabelFont(f);
		panel.setLayout(null);

		// ���� �׷����� ��Ʈ�гο� �ø���
//		ChartPanel chartPanel = new ChartPanel(barChart);
		ChartPanel chartPanel = new ChartPanel(pieChart);
		chartPanel.setBounds(49, 5, 300, 400);
		chartPanel.setBackground(new Color(255, 255, 255));
		panel.add(chartPanel);

		// �׷��� ũ������
		// �ʺ�, ����
		chartPanel.setPreferredSize(new java.awt.Dimension(300, 400));
		panel.add(chartPanel);
//===========================================================================================================

		DefaultCategoryDataset dataset2 = new DefaultCategoryDataset(); // ���ɴ� ��������

		int twenty = 0;
		int thirty = 0;
		int forty = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAge() < 30) {
				twenty++;
			} else if (list.get(i).getAge() < 40) {
				thirty++;
			} else {
				forty++;
			}
		}
		dataset2.addValue(twenty, "20", "20��");
		dataset2.addValue(thirty, "30", "30��");
		dataset2.addValue(forty, "40", "40��");

//		System.out.println(ten + ", " + twenty + ", " + thirty + ", " + forty);

		JFreeChart barChart2 = ChartFactory.createBarChart("���ɺ� ��������", "���̴�", "����Ƚ��", dataset2,
				PlotOrientation.VERTICAL, true, true, true);
		Font f2 = new Font("Gulim", Font.BOLD, 14);

		barChart2.getTitle().setFont(f2);

		// x�� y�� �ѱ�����
		CategoryPlot plot1 = barChart2.getCategoryPlot();
		// x��
		plot1.getDomainAxis().setLabelFont(f);
		plot1.getDomainAxis().setTickLabelFont(f);
		// y��
		plot1.getRangeAxis().setLabelFont(f);
		plot1.getRangeAxis().setTickLabelFont(f);

		PiePlot plot21 = (PiePlot) pieChart.getPlot();
		plot21.setLabelFont(f);

		ChartPanel chartPanel2 = new ChartPanel(barChart2);
		chartPanel2.setBounds(354, 5, 300, 400);
		chartPanel2.setBackground(new Color(255, 255, 255));
		panel.add(chartPanel2);

		// �׷��� ũ������
		// �ʺ�, ����
		chartPanel2.setPreferredSize(new java.awt.Dimension(300, 400));
		panel.add(chartPanel2);
		
		JLabel lblback = new JLabel("");
		lblback.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\back.PNG"));
		lblback.setBounds(699, 10, 30, 30);
		panel.add(lblback);
		lblback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				if (ao.JoinMeetCheck(home.moim_id)) {
					JoinMeetAfter.main(null);
				} else {
					JoinMeetBefore.main(null);
				}
			}
		});
//===========================================================================================================

//		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
//		for (int i = 0; i < list.size(); i++) {
//			dataset1.addValue(1, "���ɴ�", "����Ƚ��");
//
//		}
//
//		JFreeChart chart = ChartFactory.createBarChart3D("���ɺ� ���� ��������", "���ɴ�", "����Ƚ��", dataset1,
//				PlotOrientation.HORIZONTAL, true, true, false);
//		panel.add(chart);
//		chart.getPlot();

	}
}
