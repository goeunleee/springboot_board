package com.example.board.service;

import com.example.board.repository.BoardDao;
import com.example.board.vo.BoardVo;
import org.springframework.stereotype.Service;



import java.util.List;


@Service
public class BoardService {

	
	//@Autowired
    private BoardDao boardDao;
    

    public BoardService(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    public List<BoardVo> getBoardList() {
        return boardDao.selectBoardList();
    }

    
    public BoardVo getBoardByBoardNo(int bno) {

        BoardVo boardVo = boardDao.selectBoardByBoardNo(bno);

        return boardVo;
    }
    
  
    
    
    public Boolean createBoard(BoardVo boardVo) {

        int insertBoardResult = boardDao.insertBoard(boardVo);

        return insertBoardResult == 1 ? true : false;
    }
    
    
    
    public Boolean modifyBoardByBoardNo(BoardVo boardVo) {
        int updateBoardResult = boardDao.updateBoard(boardVo);
        return updateBoardResult == 1 ? true : false;

    }
    
    
    public Boolean boardDelete(int bno) {

        int deleteBoardResult = boardDao.deleteBoardByBoardNo(bno);

        return deleteBoardResult == 1 ? true : false;
    }
    
 

}


