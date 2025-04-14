package madang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import madang.vo.CustomerVO;
import madang.vo.PublisherVO;

public class MadangDAO {
	// Connetion 객체를 사용하는 기능은 전부 오토 커밋
	Connection conn = null;

	public MadangDAO(Connection conn) {
		this.conn = conn;
	}
	
	public void selectBook() {
		
		String sql = "select * from newbook";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int book_id = rs.getInt("bookid");
				String book_name = rs.getString("bookname");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				
				System.out.printf("Book_id = %d, Book_name = %s, Publisher = %s, Price = %d\n", book_id, book_name, publisher, price);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// db관련 객체 사용 후 닫아주기
			try {
				if(rs != null ) {
					rs.close();									
				}
				if(ps != null) {
					ps.close();					
				}
				if(conn != null) {
					conn.close();					
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public int insertCustomer(Connection conn, CustomerVO customer) {
		
		// 입력을 통해 데이터베이스에 저장
		String sql = "INSERT INTO NEWCustomer VALUES (?, ?, ?, ?)";
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, customer.getCustid());
			ps.setString(2, customer.getName());
			ps.setString(3, customer.getAddress());
			ps.setString(4, customer.getPhone());
			
			// 쿼리문 실행 횟수 반환. 1 이상이면 성공, 0이면 실패 
			result = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public int deletePublisher(Connection conn, PublisherVO publisher) {
		
		//ArrayList<Integer> bookidlist = selectBookId(conn, publisher);
		
		String sql1 = "DELETE FROM NEWBOOK WHERE PUBLISHER = ?";
		String sql2 = "DELETE FROM NEWPUBLISHER WHERE PUBLISHER = ?";
		String sql3 = "DELETE FROM NEWORDERS WHERE BOOKID IN (SELECT BOOKID FROM NEWBOOK WHERE PUBLISHER = ?)";
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;
		int result = 0;
		
		try {
			
			conn.setAutoCommit(false);
			
			ps3 = conn.prepareStatement(sql3);
			ps3.setString(1, publisher.getPublisher());
			ps3.executeUpdate();
			
			// newpublisher 테이블의 publisher는 newbook 테이블의 publisher가 참조하고 있으므로 삭제하면 제약 조건 위배.
			// 여기서는 자식 테이블의 데이터부터 삭제.
			ps1 = conn.prepareStatement(sql1);
			ps1.setString(1, publisher.getPublisher());
			ps1.executeUpdate();
			
			ps2 = conn.prepareStatement(sql2);
			ps2.setString(1, publisher.getPublisher());
			result = ps2.executeUpdate();
			
			conn.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();				
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				if(ps1 != null) {
					ps1.close();
				}
				if(ps2 != null) {
					ps2.close();
				}
				if(ps3 != null) {
					ps3.close();
				}
				if(conn != null) {
					conn.close();
				}				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
	
	public ArrayList<Integer> selectBookId(Connection conn, PublisherVO publisher) {
		
		String sql = "SELECT BOOKID FROM NEWBOOK WHERE PUBLISHER = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Integer> bookidlist = new ArrayList<>();
		
		try {
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, publisher.getPublisher());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				bookidlist.add(rs.getInt("bookid"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();				
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				if(rs != null ) {
					rs.close();									
				}
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return bookidlist;
		
	}
	
	public int updateCustomer(Connection conn, CustomerVO customer) {
		
		String sql = "UPDATE NEWCUSTOMER SET NAME = ?, ADDRESS = ?, PHONE = ? WHERE CUSTID = ?";
		PreparedStatement ps = null;
		int result = 0;
		
try {
			
			ps = conn.prepareStatement(sql);
			ps.setInt(4, customer.getCustid());
			ps.setString(1, customer.getName());
			ps.setString(2, customer.getAddress());
			ps.setString(3, customer.getPhone());
			result = ps.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();				
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return result;
	}
	
	// 전체 고객 조회
	public void selectCustomer() {
		
		String sql = "SELECT * FROM NEWCUSTOMER";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int custid = rs.getInt("CUSTID");
				String name = rs.getString("NAME");
				String address = rs.getString("ADDRESS");
				String phone = rs.getString("PHONE");
				
				System.out.printf("ID : %d, 이름 : %s, 주소 : %s, 전화번호 : %s\n", custid, name, address, phone);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null ) {
					rs.close();									
				}
				if(ps != null) {
					ps.close();					
				}
				if(conn != null) {
					conn.close();					
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}		
			
	}
	// 한명의 고객을 조회하기 (고객번호)
	public void selectCustomerOne(CustomerVO customer) {
		
		String sql = "SELECT * FROM NEWCUSTOMER WHERE CUSTID = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getCustid());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int custid = rs.getInt("CUSTID");
				String name = rs.getString("NAME");
				String address = rs.getString("ADDRESS");
				String phone = rs.getString("PHONE");
				
				System.out.printf("ID : %d, 이름 : %s, 주소 : %s, 전화번호 : %s\n", custid, name, address, phone);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null ) {
					rs.close();									
				}
				if(ps != null) {
					ps.close();					
				}
				if(conn != null) {
					conn.close();					
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}	
		
	}
	
	// 고객이 주문한 도서 목록 조회
	public void selectOrder(CustomerVO customer) {
		
		String sql = "SELECT * FROM NEWORDERS WHERE CUSTID = (SELECT CUSTID FROM NEWCUSTOMER WHERE NAME = ?)";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, customer.getName());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int orderid = rs.getInt("ORDERID");
				int custid = rs.getInt("CUSTID");
				int bookid = rs.getInt("BOOKID");
				int saleprice = rs.getInt("SALEPRICE");
				String orderdate = rs.getString("ODERDATE");
				
				System.out.printf("주문번호 : %d, 고객번호 : %d, 도서번호 : %d, 판매가 : %d, 주문일자 : %s\n", orderid, custid, bookid, saleprice, orderdate);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null ) {
					rs.close();									
				}
				if(ps != null) {
					ps.close();					
				}
				if(conn != null) {
					conn.close();					
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}	
	}
}
