package madang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import madang.dao.MadangDAO;
import madang.vo.CustomerVO;
import madang.vo.PublisherVO;

public class JdbcTest {

	public static void main(String[] args) {
		// 데이터베이스 연결
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "bookerd";
		String pw = "1234";
		
		Connection conn = null;
		
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			
			if(conn != null) {
				System.out.println("DB 접속 성공");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		MadangDAO madangDAO = new MadangDAO(conn);
		
		// 도서 조회
		//madangDAO.selectBook();
		
		// 고객 입력
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("고객 번호 :");
//		int custid = sc.nextInt();
//		sc.nextLine();
//		System.out.println("고객 이름 :");
//		String name = sc.next();
//		System.out.println("주소 :");
//		String address = sc.next();
//		System.out.println("전화번호 :");
//		String phone = sc.next();
//		sc.close();
//		
		CustomerVO customer = new CustomerVO();
//		
//		customer.setCustid(custid);
//		customer.setName(name);
//		customer.setAddress(address);
//		customer.setPhone(phone);
//		
//		int result = madangDAO.insertCustomer(conn, customer);
//		
//		if(result != 0) {
//			System.out.println("고객 정보 입력 성공");
//		}else {
//			System.out.println("고객 정보 입력 실패");
//		}
		
		// 출판사 데이터 삭제
//		System.out.println("삭제할 출판사 이름 :");
//		String pubname = sc.next();
//		sc.close();
//		
//		PublisherVO publisher = new PublisherVO(); 
//		publisher.setPublisher(pubname);
//		
//		int result = madangDAO.deletePublisher(conn, publisher);
//		
//		if(result != 0) {
//			System.out.println("데이터 삭제 성공");
//		}else {
//			System.out.println("데이터 삭제 실패");
//		}
		
		// 고객 정보 수정
		
//		System.out.println("수정할 고객 번호 : ");		
//		int custid = sc.nextInt();
//		sc.next();
//		System.out.println("고객 이름 : ");		
//		String name = sc.next();
//		System.out.println("주소 : ");		
//		String address = sc.next();
//		System.out.println("전화번호 : ");		
//		String phone = sc.next();
//		
//		customer.setCustid(custid);
//		customer.setName(name);
//		customer.setAddress(address);
//		customer.setPhone(phone);
//		
//		int result = madangDAO.updateCustomer(conn, customer);
//		
//		if(result != 0) {
//			System.out.println("고객 정보 수정 성공");
//		}else {
//			System.out.println("고객 정보 수정 실패");
//		}
		
//		madangDAO.selectCustomer();
		
//		System.out.println("조회할 고객 번호 :");
//		int custid = sc.nextInt();
//		
//		customer.setCustid(custid);
//		madangDAO.selectCustomerOne(customer);
//		sc.close();
		
		System.out.println("주문 목록을 조회할 고객 이름 :");
		String name = sc.nextLine();
		
		customer.setName(name);
		madangDAO.selectOrder(customer);
		sc.close();
	}

}
