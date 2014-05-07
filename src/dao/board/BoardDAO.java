package dao.board;

import java.util.List;

import model.board.BoardModel;
import mybatis.MyBatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BoardDAO implements BoardDAOImpl{

	/** MyBatis SQL 팩토리 */
	private SqlSessionFactory sessionFactory = null;
	
	public BoardDAO() {
		this.sessionFactory = MyBatis.getSqlSessionFactory();
	}

	@Override
	public List<BoardModel> selectList(BoardModel boardModel) {

		SqlSession session = this.sessionFactory.openSession();
		
		try {
			return session.selectList("board.selectList", boardModel);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session != null) session.close();
		}
		
		return null;
	}

	@Override
	public int selectCount(BoardModel boardModel) {
		
		SqlSession session = this.sessionFactory.openSession();
		try {
			return session.selectOne("board.selectCount", boardModel);
		} catch (Exception e) {
			if(session != null) session.close();
		}
		
		return 0;
	}
}
