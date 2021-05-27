package com.example.board.repository;


import com.example.board.vo.CommentVo;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;

import java.util.List;


public class CommentDao {
  
	private SqlSession sqlSession;
	
	
	public List<CommentVo> selectCommentList(int bno){
		
	   List<CommentVo> commentList = sqlSession.selectList("comment.selectCommentList",bno);
	   return commentList;
	}
	
	
}
