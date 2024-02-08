package callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import jdbctest.OracleConnection;

public class CallableTest {

	Connection conn;
	CallableStatement cstmt;
	ResultSet rs;
	
	public CallableTest() {
		
		conn = OracleConnection.getConnection();	// 커넥션 획득!
		
		// 넣어줄 sql 구문
		String sql=" {call proc_call(?,?)} ";	
						// 문법 : {call 프로시저명(파라미터)}
						// proc_call에 파라미터 2개니까 ?(place holder)도 2개
		
		try {
			
			cstmt = conn.prepareCall(sql);
			
			// 파라미터 세팅
			cstmt.setInt(1, 100);	// 자바에서 1번 ?에 emp_id=100을 in
			cstmt.registerOutParameter(2, Types.INTEGER);		// 자바에서 2번 ?에 integer type을 out

			cstmt.executeUpdate();	// 실행 : DB에 갔다와라
			
			int deptId = cstmt.getInt(2);	// 2번 ?의 값을 받아서 저장하자
			
			System.out.println(deptId);
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		
	} // 생성자
	
	public static void main(String[] args) {
		new CallableTest();
	}
	
} // class
