package com.example.board.repository;


import com.example.board.vo.*;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentDao {

	 private SqlSession sqlSession;
	
	 
	    
	    public CommentVo selectCommentByBoardNo(int bno) {

	        CommentVo commentVo = sqlSession.selectOne("comment.selectCommentByBoardNo", bno);

	        return commentVo;
	    }

}
