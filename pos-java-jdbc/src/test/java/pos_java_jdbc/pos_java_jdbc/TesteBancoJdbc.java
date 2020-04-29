package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(3L);
		userposjava.setNome("Andre DAO");
		userposjava.setEmail("andredao@gmail.com");
		
		userPosDAO.salvar(userposjava);
	}

}
