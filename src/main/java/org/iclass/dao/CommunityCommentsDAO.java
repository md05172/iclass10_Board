package org.iclass.dao;

import org.apache.ibatis.session.SqlSession;
import org.iclass.vo.CommunityCommentsVO;

import mybatis.SqlSessionBean;

public class CommunityCommentsDAO {
	private static final CommunityCommentsDAO dao = new CommunityCommentsDAO();
	private CommunityCommentsDAO() {}
	
	public static CommunityCommentsDAO getInstence() {
		return dao;
	}
	
	//댓글쓰기
	public int insert(CommunityCommentsVO vo) {
		SqlSession session = SqlSessionBean.getSession();
		int result = session.insert("communityComments.insert", vo);
		session.commit();
		session.close();
		return result;
	}
	
	//댓글삭제
	public int delete(int idx) {
		SqlSession session = SqlSessionBean.getSession();
		int result = session.delete("communityComments.delete", idx);
		session.commit();
		session.close();
		return result;
	}
}
