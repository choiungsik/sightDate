package meeting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageProcessingProgram extends JFrame {
	 static int size =256;
	 private static String Path;
	 private JFrame frame;
     
     // �Է°� ��� �迭�� ���� ������ ������ 256 X 256 ũ��� �����մϴ�.
     // �� �̹����� �ȼ��� 0~255�� ���� �����Ƿ� ������ ������ int�� �մϴ�.
     static int[][] inImage = new int[size][size];
     static int[][] outImage = new int[size][size];
  
     static Container contentPane; // ������ â�� ����� �����̳�
  
     
     
     public static String getPath() {
		return Path;
	}

	public void setPath(String path) {
		Path = path;
	}

	public static void main(String[] args) throws Exception {
         new ImageProcessingProgram();
  
     }
  
	
	
	
     ImageProcessingProgram() { // Constructor
  
         // title
         setTitle("���� �̹��� �ø���");
         // ���� ��ư�� ������ ���α׷� ����
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  
         contentPane = getContentPane();
  
         // �޴� �߰�
         makeMenu();
  
         // �г� �߰�
         DrawImage panel = new DrawImage();
         contentPane.add(panel, BorderLayout.CENTER);
  
         // ���� â�� �޴��� Ʋ�� ������ ����ؼ� ũ�� ����
         setSize(8 + size + 8, 25 + 31 + size + 8);
  
         // ���� â ����
         setVisible(true);
  
         // ���� â ���� ��ħ
         displayImage();
     }
  
     void makeMenu() {
         // �޴��� ����
         JMenuBar menuBar = new JMenuBar();
         setJMenuBar(menuBar);
  
         // �޴� ����
         JMenu menu = new JMenu("����");
         JMenuItem loadAction = new JMenuItem("�ҷ�����");
         JMenuItem saveAction = new JMenuItem("����");
         JMenuItem exitAction = new JMenuItem("����");
         menu.add(loadAction);
         menu.add(saveAction);
         menu.add(exitAction);
  
         // �޴�2 ����
         JMenu menu2 = new JMenu("���� ó��");
         JMenuItem equalAction = new JMenuItem("����");
         JMenuItem negativeAction = new JMenuItem("������Ű��");
         JMenuItem mirrorAction = new JMenuItem("�¿� ��Ī");
         JMenuItem mirror2Action = new JMenuItem("���� ��Ī");
         menu2.add(equalAction);
         menu2.add(negativeAction);
         menu2.add(mirrorAction);
         menu2.add(mirror2Action);
  
         // �߰�
         menuBar.add(menu);
         menuBar.add(menu2);
  
         // �̺�Ʈ �ɱ�
         loadAction.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
                 load();
             }
         });
         saveAction.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
                 save();
             }
         });
         exitAction.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
                 System.exit(0);
             }
         });
         equalAction.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
                 equal();
             }
         });
         negativeAction.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
                 negative();
             }
         });
         mirrorAction.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
                 mirror();
             }
         });
         mirror2Action.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
                 mirror2();
             }
         });
     }
  
     void load(){
         JFileChooser fileChooser = new JFileChooser();
         fileChooser.setDialogTitle("���� �ҷ�����");
         fileChooser.setFileFilter(new FileNameExtensionFilter("RAW File", "raw")); // ��������
         fileChooser.setMultiSelectionEnabled(false);// ���� ���� �Ұ�
         int returnVal = fileChooser.showOpenDialog(this); // show openDialog 
         if (returnVal == JFileChooser.APPROVE_OPTION) { // ������ �����Ͽ��� ��
             try{
                 loadImage(fileChooser.getSelectedFile().toString());
                 Path = fileChooser.getSelectedFile().toString();
             } catch (Exception e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }
         }
     }
  
     static void loadImage(String path) throws Exception {
         // �̹���
         File inFile;
         inFile = new File(path);
  
         // ���� ��Ʈ��
         FileInputStream inFileStream;
         inFileStream = new FileInputStream(inFile.getPath());
  
         // �о�� �̹��� �迭�� ����
         for (int i = 0; i < size; i++) {
             for (int k = 0; k < size; k++) {
                 inImage[i][k] = inFileStream.read();
                 outImage[i][k] = inImage[i][k];
             }
         }
  
         // close
         inFileStream.close();
  
         displayImage();
     }
  
     void save() {
         JFileChooser fileChooser = new JFileChooser();
         fileChooser.setDialogTitle("���� ����");
         fileChooser.setFileFilter(new FileNameExtensionFilter("RAW File", "raw")); // ��������
         fileChooser.setMultiSelectionEnabled(false); // ���� ���� �Ұ�
         int returnVal = fileChooser.showSaveDialog(this); // show saveDialog 
         if (returnVal == JFileChooser.APPROVE_OPTION) { // ������ �����Ͽ��� ��
             try {
                 saveImage(fileChooser.getSelectedFile().toString());
             } catch (Exception e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }
         }
     }
     
     static void saveImage(String path) throws Exception {
         // �̹���
         File outFile;
         outFile = new File(path);
  
         // ���� ��Ʈ��
         FileOutputStream outFileStream;
         outFileStream = new FileOutputStream(outFile.getPath()+".raw");
  
         // �̹��� ���Ϸ� ����
         for (int i = 0; i < size; i++) {
             for (int k = 0; k < size; k++) {
                 outFileStream.write(outImage[i][k]);
             }
         }
  
         // close
         outFileStream.close();
         
         // messageDialog
         JOptionPane.showMessageDialog(null, "���� ���� ����", "���� ����", JOptionPane.INFORMATION_MESSAGE);
     }
  
  
     void equal() {
         for (int i = 0; i < size; i++) {
             for (int k = 0; k < size; k++) {
                 outImage[i][k] = inImage[i][k];
             }
         }
  
         displayImage();
     }
  
     void negative() {
         for (int i = 0; i < size; i++) {
             for (int k = 0; k < size; k++) {
                 outImage[i][k] = (size - 1) - inImage[i][k];
             }
         }
  
         displayImage();
     }
  
     void mirror() {
         for (int i = 0; i < size; i++) {
             for (int k = 0; k < size; k++) {
                 outImage[i][k] = inImage[i][(size - 1) - k];
             }
         }
  
         displayImage();
     }
  
     void mirror2() {
         for (int i = 0; i < size; i++) {
             for (int k = 0; k < size; k++) {
                 outImage[i][k] = inImage[(size - 1) - i][k];
             }
         }
  
         displayImage();
     }
  
     class DrawImage extends JPanel {
         public void paintComponent(Graphics g) {
             super.paintComponent(g);
             int R, G, B;
  
             // �ȼ� �ϳ��ϳ��� ȭ�鿡 ���
             for (int i = 0; i < size; i++) {
                 for (int k = 0; k < size; k++) {
                     R = G = B = (int) outImage[i][k];
  
                     g.setColor(new Color(R, G, B)); // ���� ����(R, G, B�� ���� ��: �׷��̻���)
                     g.drawRect(k, i, 1, 1); // �簢�� �׸��� �Լ� => �ȼ� ���(x��ǥ, y��ǥ, ����, ����)
                 }
             }
         }
     }
  
     static void displayImage() {
         // outImage�� ������ ����� ������ �� �޼ҵ带 ȣ���Ͽ� ȭ�鿡 ����� ������ �����
         Graphics g = contentPane.getGraphics();
         contentPane.paintAll(g);
     }

}
