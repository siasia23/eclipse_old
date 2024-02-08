package board;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbctest.OracleConnection;

public class BoardTest2 {

	public static void main(String[] args) {

		Connection conn=null;
		Statement stnt=null;
		ResultSet rs=null;
		int result=0;
		String sql=null;
		
		try {
			
			// 뭐든 커넥션부터 얻어와라
			conn = OracleConnection.getConnection();
			
			// 1. insert
			Board board=new Board(0, "보드만든이", "보드제목", "보드내용내용내용");	// 보드 객체 하나=하나의 행의 데이터
			
			sql=" insert into board values (seq_board.nextval, ";
			sql += "'" + board.getBwriter() + "', ";
			sql += "'" + board.getBtitle() + "', ";
			sql += "'" + board.getBcontent() + "')";
					
			stnt=conn.createStatement();
			result=stnt.executeUpdate(sql);
			if (result>0) System.out.println("inserted!");
			
			// 2. select
			List<Board> boardList=new ArrayList<Board>();
			
			sql=" select bid, bwriter, btitle, bcontent from board ";
			stnt=conn.createStatement();
			rs=stnt.executeQuery(sql);
			
			while (rs.next()) {
				
				Board bd=new Board();
				
				bd.setBid(rs.getInt("bid"));
				bd.setBwriter(rs.getString("bwriter"));
				bd.setBtitle(rs.getString("btitle"));
				bd.setBcontent(rs.getString("bcontent"));
				
				boardList.add(bd);
				
			}

			if(boardList != null) {
				for (Board brd:boardList) {
					System.out.println(
							brd.getBid() + "," +
							brd.getBwriter() + "," +
							brd.getBtitle() + "," +
							brd.getBcontent()
					);
				}
			}
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			OracleConnection.closeConnection(conn, stnt, rs);
		}
		
	}

}
