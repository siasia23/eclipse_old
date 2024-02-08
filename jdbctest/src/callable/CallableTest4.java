package callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbctest.OracleConnection;
import oracle.jdbc.OracleTypes;

public class CallableTest4 {

	Connection conn;
	CallableStatement csmt;
	ResultSet rs;
	
	public CallableTest4() {

		conn = OracleConnection.getConnection();
		
		String sql = " {call proc_call_cur(?,?) ";
		
		try {
			
			csmt = conn.prepareCall(sql);
			
			csmt.setInt(1, 50);
			csmt.registerOutParameter(2, OracleTypes.CURSOR);	// 오라클 커서 타입으로 가져오자
			
			csmt.execute();	// 커서 받을 때는 업뎃 안 함. Statement api method 참조
			
			// 커서에서 받은 결과값을 resultSet에 넣자
			rs = (ResultSet) csmt.getObject(2);	// 기본 반환 타입이 object여서 resultSet 타입으로 타입 변환함
			
			// resultSet의 모든 값을 출력해보자
			while (rs.next()) {
				System.out.println(
							rs.getInt("EMPLOYEE_ID") + " " +
							rs.getString("FIRST_NAME") + " " +
							rs.getString("LAST_NAME")
						);
			}
	
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
		new CallableTest4();
	}
	
}
