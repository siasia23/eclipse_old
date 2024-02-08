package callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import jdbctest.OracleConnection;

// 실습1. 부서아이디를 입력하면, 부서 내 직원 수를 반환하는 function을 오라클에 생성 => func_emp_cnt
// 실습2. 오라클에 생성한 function을 호출해서 결과를 반환하는 자바 코드 작성
public class CallableTest3 {
	
	Connection conn;
	CallableStatement csmt;

	public CallableTest3() {
		
		conn = OracleConnection.getConnection();
		
		String sql = " {?=call func_emp_cnt(?)} ";
		
		try {
			
			csmt = conn.prepareCall(sql);
			
			csmt.registerOutParameter(1, Types.INTEGER);
			csmt.setInt(2, 90);
			
			csmt.executeUpdate();
			
			int result = csmt.getInt(1);
			
			System.out.println(result);
			
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
		new CallableTest3();
	}
	
}
