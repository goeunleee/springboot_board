package com.example.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board.service.CommentService;
import com.example.board.vo.CommentVo;

@Controller // 컨트롤러를 명시하는 어노테이션
@RequestMapping("/comment") // url 경로설정
public class CommentController {
 
	private CommentService commentService;
	
	
	@GetMapping("")
	public String getComment(Model model, int bno) {
		
		List<CommentVo> comment = commentService.getCommentList(bno);
		model.addAttribute("comment", comment);
		return "views/board/detail";
	}
	
}
