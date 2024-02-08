package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbctest.OracleConnection;

public class BoardTest3 {

	public static void main(String[] args) {

		Connection conn=OracleConnection.getConnection();
		PreparedStatement ps=null;
		int result=0;
		String sql=null;
		
		try {
			
/*			// 1. insert
			sql=" insert into board values (seq_board.nextval, ?, ?, ?) ";		// ? 는 자바 문법
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, "이이름");	// 첫번째 ?에 "이이름" 삽입
			ps.setString(2, "제에목");	// 두번째 ?에 "제에목" 삽입
			ps.setString(3, "내애용");	// 세번째 ?에 "내애용" 삽입  
			
			result=ps.executeUpdate();
			if (result>0) System.out.println("inserted!");
*/			
			// 2. update
			sql=" update board set btitle=?, bcontent=? ";
			sql += " where bid=? ";
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, "수정된 제목");
			ps.setString(2, "수정된 내용");
			ps.setInt(3, 11);
			
			result=ps.executeUpdate();
			if (result>0) System.out.println("updated!");
			
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			OracleConnection.closeConnection(conn, ps, null);
		}
		
	}

}
