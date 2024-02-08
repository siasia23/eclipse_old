package jdbctest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class OracleConnection {
	
	// 연결 인터페이스
	private static Connection conn;

	// prop
	private static Properties prop;
	
	static {
		prop=new Properties();
		
		try {
			prop.load(new FileReader(new File("D:\\eclipse_workspace\\jdbctest\\src\\prop\\dbconn.properties")));
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	/* 자바랑 오라클 연결할 때 필요한 필드 4가지 */
/*	
	// 연결할 오라클 데이터베이스의 경로
 	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";	
	//// IP명 'localhost', 오라클 포트번호 '1521', SID 'xe'

	// 오라클 데이터베이스 드라이버 클래스 이름
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

	private static final String JDBC_USER = "ora_sia";		// 사용자명
	private static final String JDBC_PW = "1234";				// 패스워드
*/		
	
	// prop 이용한 필드
	private static final String JDBC_URL=prop.getProperty("JDBC_URL");
	private static final String JDBC_DRIVER = prop.getProperty("JDBC_DRIVER");
	private static final String JDBC_USER = prop.getProperty("JDBC_USER");
	private static final String JDBC_PW = prop.getProperty("JDBC_PW");
	
	// 커넥트 하는 메소드
	public static Connection getConnection() {
		
		try {
			
			// 데이터베이스 드라이버 클래스를 메모리에 로딩
			Class.forName(JDBC_DRIVER);
			
			// 데이터베이스 커넥션 획득 ( if conn != null, 연결됨 )
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PW);

/*			// sql 구문 쓸 때는 꼭!!!!! 앞뒤로 공백 하나씩 써야 함!!!! 세미콜론은 넣지 않음
			String sql=" select employee_id, emp_name from employees ";
			
			// 쿼리 객체 생성
			Statement stnt=conn.createStatement();
			
			// 입력된 쿼리문을 수행한 결과 행의 집합(커서)
			ResultSet rs = stnt.executeQuery(sql);
			
			// 커서에서 내용 꺼내기
			// DB의 데이터타입과 java의 데이터타입을 잘 매핑해야함  
			while (rs.next()) {
				int employeeId = rs.getInt("employee_id");		// DB에서 number 타입이니까 int로 반환
				String empName = rs.getString("emp_name");		// DB에서 varchar2 타입이니까 String로 반환
				System.out.println(employeeId+", "+empName);
			}
*/			
			return conn;
			
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			return null;
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return null;
		} 
		
	} // getConnection()
	
	// 커넥트 닫는 메소드
	public static void closeConnection(Connection conn, Statement stnt, ResultSet rs) {
		
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		
		if (stnt != null) {
			try {
				stnt.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		
	} // closeConnection
	
} // class
