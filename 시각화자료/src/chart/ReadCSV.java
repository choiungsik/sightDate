package chart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV {

	public ArrayList<MaleVO> getList() {

		ArrayList<MaleVO> list = new ArrayList<MaleVO>();

		// 1. ������ �����ϴ� ��ġ�� ������ ��� ��ü ����
		File file = new File("C:\\Users\\SMHRD\\Desktop\\��������������.csv");
	

		// 2. ���ϰ�ü�� �о�鿩�� ���� ������ Input ��Ʈ�� ����
		try {
			Scanner sc = new Scanner(file);
			sc.nextLine();
//			System.out.println(sc.hasNext());
//			System.out.println(sc.nextLine());
//			System.out.println(sc.nextLine());	
			while (sc.hasNext()) {
				String line = sc.nextLine();
				String[] value = line.split(",");
				String id = value[0];
				String sex = value[1];
				int age = Integer.parseInt(value[2]);
				String meet_id = value[3];
				MaleVO vo = new MaleVO(id, sex, age, meet_id);
				list.add(vo);
//				System.out.print(value[0]+" ");
//				System.out.print(value[1]+" ");
//				System.out.println(value[2]);
				// , �� �����ϰ� ����ϼ���
				// ���� 1100 1~4
				// ���� 2044 1~4

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

}
