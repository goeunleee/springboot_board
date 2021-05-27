package com.example.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.board.service.BoardService;
import com.example.board.vo.BoardVo;

@Controller // 컨트롤러를 명시하는 어노테이션
@RequestMapping("/board") // url 경로설정
public class BoardController {

	// @Autowired
	private BoardService boardService;

	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

	@GetMapping("/write")
	public String getWriteBoardPage() {
		return "views/board/write";
	}

	@PostMapping("")
	public String createBoard(BoardVo boardVo) {
		Boolean createBoardResult = boardService.createBoard(boardVo);

		return "redirect:/board/main";
	}

	@GetMapping("")
	public String getBoard(Model model, int bno) {
		BoardVo board = boardService.getBoardByBoardNo(bno);
		model.addAttribute("board", board);
		return "views/board/detail";
	}

	@GetMapping("/main")
	public String getBoardList(Model model, HttpServletRequest request) {
		List<BoardVo> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		return "views/board/list";
	}

	@GetMapping("/modify")
	public String getBoardForModify(Model model, int bno) {
		BoardVo board = boardService.getBoardByBoardNo(bno);
		model.addAttribute("board", board);
		return "views/board/modify";

	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyBoard(BoardVo boardVo) {
		System.out.println(boardVo.getTitle()+"수정");
		Boolean removeBoardResult = boardService.modifyBoardByBoardNo(boardVo);
		return "redirect:/board?bno=" + boardVo.getBno();
	}
	
    @RequestMapping("/delete/{bno}")
    public String boardDelete(@PathVariable("bno") int bno) {
    	boardService.boardDelete(bno);
    	return "redirect:/board/main";
    }
	
   
	
	
	


}
