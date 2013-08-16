package net.slipp.dao.board;

import java.sql.SQLException;


//import java.util.ArrayList;
//import java.util.List;

import net.slipp.domain.board.Board;

public interface BoardDao {
//	private static ArrayList<Board> noticelist = new ArrayList<Board>();
//	
	public void insert(Board board) throws SQLException;
//	public void insert(Board board) throws SQLException {
//		noticelist.add(board);
//	}
//
//	public List<Board> getByNotice() throws SQLException {
//		
//		List<Board> subjectList = new ArrayList<Board>();
//	
//		for(int i = 0; i < noticelist.size(); i++) {
//			subjectList.add(noticelist.get(i));
//        }
//		
//		return subjectList;
//	}
}