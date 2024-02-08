package board;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import jdbctest.OracleConnection;

// ResultSetMetaData 학습
public class BoardTest6 {
	
	private static Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;
	
	String sql=null;
	
	public BoardTest6() {
		
		try {
			
			conn=OracleConnection.getConnection();
			
			sql=" select * from board ";
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			rsmd=rs.getMetaData();
			
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnLabel(1));
			System.out.println(rsmd.getColumnTypeName(3));
			System.out.println(rsmd.getSchemaName(2));
			System.out.println(rsmd.isNullable(1));
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			OracleConnection.closeConnection(conn, stmt, rs);
		}
	} // 생성자
	
	public static void main(String[] args) {

		new BoardTest6();
		
	} // main

}
