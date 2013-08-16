package net.slipp.web.board;

//import java.util.List;

import net.slipp.domain.board.Board;
import net.slipp.service.board.BoardService;
import net.slipp.web.user.UserController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private static Logger log = LoggerFactory.getLogger(UserController.class);

	private BoardService boardService = new BoardService();
	
	@RequestMapping("")
	public String index(Board board, Model model) throws Exception {
//		List<Board> boardList = boardService.getByNotice();
//		model.addAttribute("board", boardList);
		
		return "board/board_list";
	}
  
	@RequestMapping("/write")
	public String write() {
		return "board/board_write";  
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertNotice(Board board, Model model, String subject) throws Exception {
		log.debug("Board : {}", board);
		boardService.write(board);	
			
//		List<Board> boardList = boardService.getByNotice();
//		model.addAttribute("board", boardList);
		
		return "board/board_list";
	}
}
