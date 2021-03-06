package kr.co.ro.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ro.domain.Item;

@Repository
public class ItemDao {
	//사용하는 데이터베이스 프레임워크 변수
	@Autowired
	private SqlSession sqlSession;
	//Item 테이블의 모든 데이터를 가져오는 메소드 
	public List<Item> allItem() {
		return sqlSession.selectList("itemMapper.allItem");
	}
}
