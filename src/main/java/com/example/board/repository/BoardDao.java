package com.example.board.repository;



import com.example.board.vo.BoardVo;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BoardDao {

	
	
	//@Autowired
    private SqlSession sqlSession;
	
	public BoardDao(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

    public List<BoardVo> selectBoardList() {

        List<BoardVo> boardList = sqlSession.selectList("board.getBoardList");

        return boardList;
    }
    
    public BoardVo selectBoardByBoardNo(int bno) {

        BoardVo boardVo = sqlSession.selectOne("board.selectBoardByBoardNo", bno);

        return boardVo;
    }


    public int insertBoard(BoardVo boardVo) {

        int insertBoardResult = sqlSession.insert("board.insertBoard", boardVo);

        return insertBoardResult;
    }

    public int updateBoard(BoardVo boardVo) {

        int updateBoard = sqlSession.update("board.updateBoard", boardVo);
        return updateBoard;
    }
    
   
    public int deleteBoardByBoardNo(int bno) {

        int deleteBoardResult = sqlSession.delete("board.deleteBoardByBoardNo", bno);

        return deleteBoardResult;
    }
	
}
