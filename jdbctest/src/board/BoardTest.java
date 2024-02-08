package board;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbctest.OracleConnection;

public class BoardTest {

	public static void main(String[] args) {

		Connection conn=null;		// DB를 연결하는 커넥션 개체
		Statement stnt=null;
		ResultSet rs=null;
		int result=0;
		
		try {
			
			conn = OracleConnection.getConnection();
			stnt=conn.createStatement();
		
/*			// 1. insert
			String inserSql = " insert into board values (seq_board.nextval, '작성자', '제목', '내용') ";
			result=stnt.executeUpdate(inserSql);
			if(result>0) System.out.println("inserted!");
*/			
/*			// 2. update
			String updateSql = " update board set bcontent='수정된 내용' where bid=1 ";
			result=stnt.executeUpdate(updateSql);
			if(result>0) System.out.println("updated!");
*/			
/*			// 3. delete
			String deleteSql = " delete board where bid=1 ";
			result=stnt.executeUpdate(deleteSql);
			if(result>0) System.out.println("deleted!");
*/			
			
			
			// 실습. 데이터 3건 입력하고 리스트 출력하기
			
			for (int i=0; i<3; i++) {
				StringBuilder sb=new StringBuilder();
				
				sb.append(" insert into board values (seq_board.nextval");
				sb.append(", '작성자"+i);
				sb.append("', '제목"+i);
				sb.append("', '내용"+i+"')");
				
				System.out.println(sb.toString());
				String insertSql=sb.toString();
				result=stnt.executeUpdate(insertSql);
			}
			
			String listSql=" select bid, bwriter, btitle, bcontent from board ";
			stnt=conn.createStatement();
			rs=stnt.executeQuery(listSql);
			
			while(rs.next()) {
				System.out.println(
						rs.getInt("bid")+","+
						rs.getString("bwriter")+","+
						rs.getString("btitle")+","+
						rs.getString("bcontent")
				);
			}
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			OracleConnection.closeConnection(conn, stnt, rs);
		}
		
	} // main

}
