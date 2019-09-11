package kr.co.itcen.emaillist.dao.test;

import java.util.List;

import kr.co.itcen.emaillist.dao.EmaillistDao;
import kr.co.itcen.emaillist.vo.EmaillistVo;

public class EmaillistDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insertTest();
		getListTest();
		
//		deleteAll();

	}

	private static void getListTest() {
		// TODO Auto-generated method stub
		List<EmaillistVo> list = new EmaillistDao().getList();
				for(EmaillistVo vo : list) {
					System.out.println(vo);
				}
	}

	private static void deleteAll() {
		// TODO Auto-generated method stub
		new EmaillistDao().delete();
	}

	private static void insertTest() {
		// TODO Auto-generated method stub
		EmaillistVo vo = new EmaillistVo();
		vo.setFirstName("영미");
		vo.setLastName("권");
		vo.setEmail("aomee0880@naver.com");
		
		new EmaillistDao().insert(vo);
	
	}

}
