
package garebnb.board.service;
  
import java.util.List;
import java.util.Map;
  
import javax.annotation.Resource; 
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import garebnb.board.dao.BoardDAO;

  
@Repository("boardService") 
public class BoardServiceImpl implements BoardService{ 
	Logger log = Logger.getLogger(this.getClass());
  
	@Resource(name ="boardDAO") 
	private BoardDAO boardDAO;

	
	@Override
	public List<Map<String, Object>> selectOneBoardList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.selectOneBoardList(map);
	}

	
	
	@Override
	public void updateOneBoardDelete(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.updateOneBoardDelete(map);
		
	}


	//게시글 등록
	@Override
	public Map<String, Object> insertOneBoard(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.insertOneBoard(map);
	}


	//게시글 수정등록
	@Override
	public Map<String, Object> insertOneBoardModify(Map<String, Object> map) throws Exception {
			// TODO Auto-generated method stub
		return boardDAO.insertOneBoardModify(map);
	}


	//게시글 수정 취소	
	@Override
	public void updateOneBoardModifyCancel(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.updateOneBoardModifyCancel(map);
	}



	@Override
	public Map<String, Object> selectOneBoard(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.selectOneBoard(map);
	}



	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception  {
		// TODO Auto-generated method stub
		return boardDAO.selectBoardList(map);
	}

	@Override
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.selectBoardDetail(map);
	}

	@Override
	public List<Map<String, Object>> selectHostBoardList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.selectHostBoardList(map);
	}



	@Override
	public void updateHostBoardConfirm(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.updateHostBoardConfirm(map);
	}



	@Override
	public void updateHostBoardDeny(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.updateHostBoardDeny(map);
	}
	
  
	
	
}
 