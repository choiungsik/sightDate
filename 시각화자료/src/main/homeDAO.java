package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.print.DocFlavor.CHAR_ARRAY;

import login.DAO;
import login.vo;

public class homeDAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private String log_id;
	private String name;
	DAO dao = new DAO();

	int count = 0;

	private void getConnection() {// �������ִ� �޼ҵ� �������
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private void close() {// �ݾ��ִ� �޼ҵ�
		try {
			if (rs != null) {
				rs.close();
			}
			if (conn != null) {
				conn.close();

			}
			if (psmt != null) {
				psmt.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int join(vo vo) {// ȸ������ �κ�
		// TODO Auto-generated method stub

		int cnt = 0;
		getConnection();// ��ο���޼ҵ� �ҷ���

		try {
			String sql = "insert into MEMBERS values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());

			cnt = psmt.executeUpdate();// executeUpdate�������� ������

		} catch (SQLException e) {
			// �� �κ��� sql�� ����ó�� ����ִ� �κ��̶� ���ܾ���
			e.printStackTrace();
		} finally {

			close();

		}

		return cnt; // ���� �߰��� �����ϸ� cnt�� 1�� ��

	}

	public String login(vo vo) {// �α��� �κ�
		getConnection();
		String name = null;

		try {

			String sql = "SELECT * FROM Meetings WHERE ID = ? AND PW  = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			log_id = vo.getId();
			rs = psmt.executeQuery();
			// ���̵�� ��й�ȣ�� �������� �� �ٿ� �ִ� �̸��� string name�� ����
			if (rs.next()) {
				name = rs.getString("name");
				// ���̵�� ��й�ȣ�� �������� �� �ٿ� �ִ� �̸��� string name�� ����
			}
		} catch (SQLException e) {
			// �� �κ��� sql�� ����ó�� ����ִ� �κ��̶� ���ܾ���
			e.printStackTrace();
		} finally {
			close();
		}
		return name;

	}

	//
	public String searchVO(String str) {// search method
		getConnection();
		
		try {

			String sql = "SELECT MEET_NAME FROM Meetings WHERE MEET_INTER =? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, str);
			rs = psmt.executeQuery();
			// ���̵�� ��й�ȣ�� �������� �� �ٿ� �ִ� �̸��� string name�� ����
			for (int i = 0; i < count; i++) {
				rs.next();
			}
			if (rs.next()) {
				name = rs.getString("meet_name");
				// ���̵�� ��й�ȣ�� �������� �� �ٿ� �ִ� �̸��� string name�� ����
			}
		} catch (SQLException e) {
			// �� �κ��� sql�� ����ó�� ����ִ� �κ��̶� ���ܾ���
			e.printStackTrace();
		} finally {
			count++;
			close();
		}
		return name;

	}

	public String meetName() {
		String name = "";

		getConnection();
		try {
			String sql = "select * from Meetings";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			for (int i = 0; i < count; i++) {
				rs.next();
			}
			if (rs.next()) {
				name = rs.getString("meet_name");
				// ���̵�� ��й�ȣ�� �������� �� �ٿ� �ִ� �̸��� string name�� ����
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			count++;
			close();
		}
		return name;

	}

	public String meetinter() {
		String send = "";

		getConnection();
		String inter = dao.interSelect(login.login.log_id);
		ArrayList arr = new ArrayList();
		
		for (int i = 0; i < inter.length(); i++) {
			arr.add(inter.charAt(i));
		}
		
		try {

			String sql = "select meet_name from meetings where meet_inter like substr((select mem_inter from members where mem_id = ?),1,5)";

			for (int i = 1; i < arr.size()/5; i++) {
				sql += " or meet_inter like substr((select mem_inter from members where mem_id = ?),"+(3+i*5)+", 5)";
			}
			psmt = conn.prepareStatement(sql);
			for (int i = 0; i < arr.size()/5; i++) {
				psmt.setString(1+i, login.login.log_id);
				
			}
			rs = psmt.executeQuery();
			for (int i = 0; i < count; i++) {
				rs.next();
			}
			if (rs.next()) {
				// name = rs.getString("meet_inter");
//	        	 	name = Integer.parseInt(rs.getString("MEET_INTER"));
				// ���̵�� ��й�ȣ�� �������� �� �ٿ� �ִ� �̸��� string name�� ����
				send = rs.getString("MEET_NAME");

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			count++;
			close();
		}
		return send;

	}

	//

//	public ArrayList<vo> selectAll(JTextField a) {
//		ArrayList<vo> list = new ArrayList<vo>();
//
//		getConnection();// �����ε� �޼ҵ�
//		
//
//		try {
//			String sql = "select * from members";
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			while (rs.next()) {
//				String id = rs.getString("id");				
//				vo vo = new vo(id);
//				list.add(vo);
//				if (list.equals(a)) {
//					System.out.println("�ٽ��Է�");
//					
//				}else {
//					
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			close();
//		}
//
//		return list;
//	}
//	

	public int delete(String id, String pw) {
		getConnection();
		String sql = "delete from members where id =? and pw = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);// �Ű����� ���̵�
			psmt.setString(2, pw);// �Ű����� ��й�ȣ

			int cnt = psmt.executeUpdate();

			if (cnt != 0) {
				return cnt;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return 0;
	}

}
