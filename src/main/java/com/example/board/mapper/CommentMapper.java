package com.example.board.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.vo.CommentVo;


@Mapper
public interface CommentMapper {

	
	
	public int insertComment(CommentVo params);

	public CommentVo selectCommentDetail(int idx);

	public int updateComment(CommentVo params);

	public int deleteComment(int idx);

	public List selectCommentList(CommentVo params);

	public int selectCommentTotalCount(CommentVo params);
	
	
}
