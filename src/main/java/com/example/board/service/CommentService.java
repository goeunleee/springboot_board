package com.example.board.service;

import com.example.board.repository.*;
import com.example.board.vo.*;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

	private CommentDao commentDao;
    
    public  CommentVo getCommentByBoardNo(int bno) {

        CommentVo commentVo = commentDao.selectCommentByBoardNo(bno);

        return commentVo;
    }
    
    
}
