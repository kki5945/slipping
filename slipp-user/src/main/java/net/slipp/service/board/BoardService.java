package net.slipp.service.board;

import java.sql.SQLException;
//import java.util.List;

import javax.annotation.Resource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.slipp.dao.board.BoardDao;
import net.slipp.domain.board.Board;
import net.slipp.service.user.ExistedUserException;
import net.slipp.service.user.UserService;


public class BoardService {
	
	private static Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Resource(name="boardDao")
	private BoardDao boardDao;
	
	public void setUserDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	public Board write(Board board) throws SQLException, ExistedUserException {
		log.debug("Board : {}", board);

		boardDao.insert(board);
		return board;
	}
	
//	public List<Board> getByNotice() throws SQLException {
//		BoardDao boardDao = new BoardDao();
//		return boardDao.getByNotice();
//	}

}