package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbctest.OracleConnection;

// 실습. BoardTest3의 코드를 Board 객체를 사용하는 코드로 변환
public class BoardTest4 {

	public static void main(String[] args) {
		
		Connection conn=OracleConnection.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		int result=0;
		String sql=null;
		
		try {
			
/*			// 1. insert
			Board board=new Board(0, "보드만든이", "보드제목", "보드내용내용내용");
			
			sql=" insert into board values (seq_board.nextval, ?, ?, ?) ";		// ? 는 자바 문법
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, board.getBwriter());	// 첫번째 ?에 삽입
			ps.setString(2, board.getBtitle());		// 두번째 ?에 삽입
			ps.setString(3, board.getBcontent());	// 세번째 ?에 삽입  
			
			result=ps.executeUpdate();
			if (result>0) System.out.println("inserted!");
*/		
/*			// 2. update
			Board board=new Board(12, "바뀐 사람", "바뀐 제목", "바뀐 내용");
			
			sql=" update board set bwriter=?, btitle=?, bcontent=? ";
			sql += " where bid=? ";
			
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, board.getBwriter());
			ps.setString(2, board.getBtitle());
			ps.setString(3, board.getBcontent());
			ps.setInt(4, board.getBid());
			
			result=ps.executeUpdate();
			if (result>0) System.out.println("updated!");
*/			
/*			// 3. list
			sql=" select bid, bwriter, btitle, bcontent from board ";
			
			ps=conn.prepareStatement(sql);
			
			rs=ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(
						rs.getInt("bid")+", "+
						rs.getString("bwriter")+", "+
						rs.getString("btitle")+", "+
						rs.getString("bcontent")
				);
			}
*/			
			// 4. select
			sql=" select bid, bwriter, btitle, bcontent from board ";
			sql += " where bid=? ";
			
			ps=conn.prepareStatement(sql);
			ps.setInt(1, 10);
			
			rs=ps.executeQuery();
			
			if (rs.next()) {
				System.out.println(
						rs.getInt("bid")+", "+
						rs.getString("bwriter")+", "+
						rs.getString("btitle")+", "+
						rs.getString("bcontent")
				);
			}
		
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			OracleConnection.closeConnection(conn, ps, rs);
		}
		
	} // main
		
}

