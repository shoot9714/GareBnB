package garebnb.review.dao;

import java.util.Map;

public interface ReviewDAO {
	
	public Map<String, Object> selectReviewOneMember (Map<String,Object> map) throws Exception;
	public void insertReview (Map<String,Object> map) throws Exception;
	public void deleteReview (Map<String,Object> map) throws Exception;
	public Map<String, Object> selectReviewList (Map<String,Object> map) throws Exception;
}


