package callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import jdbctest.OracleConnection;

public class CallableTest2 {

	Connection conn;
	CallableStatement csmt;
	
	public CallableTest2() {

		try {
			
			// 커넥션 획득!!
			conn = OracleConnection.getConnection();
			
			// 넣어줄 sql 구문
			String sql = " {?=call func_call(?,?)} ";
							// 문법 : {?=call 함수명(파라미터)}
							// 1번 ?는 해당 함수의 return 값
			
			csmt=conn.prepareCall(sql);
			
			// 파라미터 세팅
			csmt.registerOutParameter(1, Types.INTEGER);
			csmt.setInt(2, 10);
			csmt.setInt(3, 20);
			
			// 실행
			csmt.executeUpdate();
			
			// 받아온 값을 자바 변수에 저장
			int result = csmt.getInt(1);
			
			// 찍어보자
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
		new CallableTest2();
	}
	
}
