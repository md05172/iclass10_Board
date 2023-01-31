package org.iclass.dao;

import org.apache.ibatis.session.SqlSession;
import org.iclass.vo.CommunityVO;

import mybatis.SqlSessionBean;

public class CommunityDAO {
	private static final CommunityDAO dao = new CommunityDAO();
	private CommunityDAO() {}
	
	public static CommunityDAO getInstance() {
		return dao;
	}
	
	//글쓰기
	public int insert (CommunityVO vo) {
		SqlSession session = SqlSessionBean.getSession();
		int result = session.insert("community.insert", vo);
		session.commit();
		session.close();
		return result;
	}
	
	//글수정
	public int update (CommunityVO vo) {
		SqlSession session = SqlSessionBean.getSession();
		int result = session.update("community.update", vo);
		session.commit();
		session.close();
		return result;
	}
	
	//글삭제
	public int delete (CommunityVO vo) {
		SqlSession session = SqlSessionBean.getSession();
		int result = session.delete("community.delete", vo);
		session.commit();
		session.close();
		return result;
	}
	
	//글보기
	public CommunityVO select (int idx) {
		SqlSession session = SqlSessionBean.getSession();
		CommunityVO vo = new CommunityVO();
		vo = session.selectOne("community.select", idx);
		session.commit();
		session.close();
		return vo;
	}

	
}
