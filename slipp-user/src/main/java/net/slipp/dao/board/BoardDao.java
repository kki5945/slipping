package net.slipp.dao.board;

import java.sql.SQLException;

import net.slipp.domain.board.Board;

public interface BoardDao {
	public void insert(Board board) throws SQLException;
}