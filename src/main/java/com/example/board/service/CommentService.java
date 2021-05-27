package com.example.board.service;

import java.util.List;

import com.example.board.vo.CommentVo;
import com.example.board.repository.CommentDao;

public class CommentService {
	
	private CommentDao commentDao;
	
	public List<CommentVo> getCommentList(int bno){
		return commentDao.selectCommentList(bno);
	}

}
