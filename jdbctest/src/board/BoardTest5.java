package board;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import jdbctest.OracleConnection;

// 실습.BoardTest4를 메소드로 분리
public class BoardTest5 {
	
	private static Connection conn;
	private static PreparedStatement ps;
	private static ResultSet rs;
	private static String sql;
	private static Properties prop;

	// 생성자
	BoardTest5() {
		
		// conn
		conn=OracleConnection.getConnection();
		
		// prop
		prop=new Properties();
		
		try {
			prop.load(new FileReader(new File("D:\\eclipse_workspace\\jdbctest\\src\\prop\\sql.properties")));
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // 생성자
	
	public Connection getConnection() {
		return conn;
	}
	
	public static void main(String[] args) {
		
		// 객체 생성
		BoardTest5 bt5=new BoardTest5();
		
		// 각 메소드 호출
		try {
	
			List<Board> boardList=bt5.listBoard();
			Board selectedBoard=bt5.selectBoard(9);
			int insertedResult=bt5.insertBoard(new Board(0, "테스트 작성자", "테스트 제목", "테스트 내용"));
			int updatedResult=bt5.updateBoard(new Board(0, "업뎃 작성자", "업뎃 제목", "업뎃 내용"));
			int deletedResult=bt5.deleteBoard(5);
			
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			OracleConnection.closeConnection(conn, ps, rs);
		}
		
	} // main
	
	// 1. list
	List<Board> listBoard() throws SQLException {

//		sql=" select bid, bwriter, btitle, bcontent from board ";
			
		ps=conn.prepareStatement(prop.getProperty("listSql"));
			
		rs= ps.executeQuery();
		
		List<Board> boardList=new ArrayList<Board>();
		
		while (rs.next()) {
			
			Board board=new Board();
			
			board.setBid(rs.getInt("bid"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			
			boardList.add(board);
			
		}
		
		return boardList;
		
	}

	// 2. select
	Board selectBoard(int bid) throws SQLException {
		
//		sql=" select bid, bwriter, btitle, bcontent from board ";
//		sql += " where bid=? ";
		
		ps=conn.prepareStatement(prop.getProperty("selectSql"));
		ps.setInt(1, bid);
		
		rs=ps.executeQuery();
		
		Board board=new Board();
		
		if (rs.next()) {
			
			board.setBid(rs.getInt("bid"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			
		}
		
		return board;
		
	}
	
	// 3. insert
	int insertBoard(Board board) throws SQLException {
		
//		sql=" insert into board values (seq_board.nextval, ?, ?, ?) ";		// ? 는 자바 문법
		
		ps=conn.prepareStatement(prop.getProperty("insertSql"));
			
		ps.setString(1, board.getBwriter());		// 첫번째 ?에 삽입
		ps.setString(2, board.getBtitle());			// 두번째 ?에 삽입
		ps.setString(3, board.getBcontent());		// 세번째 ?에 삽입  
			
		return ps.executeUpdate();
			
	}
	
	// 4. update
	int updateBoard(Board board) throws SQLException {

//		sql=" update board set bwriter=?, btitle=?, bcontent=? ";
//		sql += " where bid=? ";
			
		ps=conn.prepareStatement(prop.getProperty("updateSql"));
			
		ps.setString(1, board.getBwriter());
		ps.setString(2, board.getBtitle());
		ps.setString(3, board.getBcontent());
		ps.setInt(4, board.getBid());
			
		return ps.executeUpdate();

	}
	
	// 5. delete
	int deleteBoard(int bid) throws SQLException {
		
//		sql = " delete board where bid=? ";
		
		ps=conn.prepareStatement(prop.getProperty("deleteSql"));
		
		ps.setInt(1, bid);
			
		return ps.executeUpdate();
		
	}
	
} // class
