package board;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;

import jdbctest.OracleConnection;

/*
 * Transaction : 작업 단위, commit 전까지가 하나의 트랜잭션
 * 
 * Commit : DB에 트랜잭션 작업을 반영하는 것
 *  1. DDL (create, alter, drop, truncate..) : 수행 즉시 커밋됨. 롤백 불가
 *  2. DML (select, insert, update, delete, merge..) : 커밋 전까지는 트랜잭션 완료되지 않음. (DB에 반영되지 않음)
 *  
 * Rollback : 현재의 트랜잭션을 초기화하는 것 (DB에 작업을 반영하지 않음)
 * 
 * Auto Commit : SQL 구문을 수행할때마다 즉시 커밋 (DML도)
 * 
 * 데이터베이스 트랜잭션 처리 순서
 *  1. conn.setAutoCommit(false); 오토커밋 방지
 *  2. DML 구문 작성, 수행 (필요하면 SavePoint 지정)
 *  3. 문제가 없으면 커밋, 문제 있으면 롤백
 */

// commit, rollback 학습
public class BoardTest7 {

	private Connection conn;
	private Savepoint sp1;
	private Savepoint sp2;
	
	public BoardTest7() {
	
		BoardTest5 bt5=new BoardTest5();	// BoardTest5의 메소드 호출하기 위해 객체 생성
		
		conn=bt5.getConnection();	// bt5의 커넥션을 얻어옴. bt7의 conn == bt5의 conn

		try {
			
//			System.out.println(conn.getAutoCommit());		// 0. 오토커밋인지 확인결과 true. 
			
			conn.setAutoCommit(false);		// 1. 오토커밋 막아버리기
			
			// 2. sql 구문 수행
			Board board=new Board(0, "작성자", "제목", "내용");
			bt5.insertBoard(board);	// 메소드 호출
			
			sp1=conn.setSavepoint("sp1");		// 세이브포인트 설정
			
			// btitle은 not null인데 null 값을 넣어서 강제로 exception 발생시키기
			Board board2=new Board(100, "", "업뎃제목", "업뎃내용");
			bt5.updateBoard(board2);
			
			sp2=conn.setSavepoint("sp2");
			
			bt5.deleteBoard(15);
			
			conn.commit();	// 3. 커밋
		
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			try {
				conn.rollback();		// 4. 만약 작업중 예외 발생하면 전체 롤백
//				conn.rollback(sp1);	// 특정 세이브포인트로 롤백
//				conn.rollback(sp2);
			} catch (SQLException sqle2) {
				sqle2.printStackTrace();
		} 
		
		finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException sqle3) {
				sqle3.printStackTrace();
			}
		}
		
		}
		
	} // 생성자
	
	public static void main(String[] args) {
		new BoardTest7();
	}
	
}
