package org.comstudy21.saram.test;

import java.util.List;

import org.comstudy21.saram.model.SaramDao;
import org.comstudy21.saram.model.SaramDto;

public class SaramDaoTest {

	public static void main(String[] args) {
		//testSaramSelectAll();
		//setSelectOne();
		//testInsert();
		//testUpdate();
		//testDelete();
		//testSetSelectById();
		testSelectByName();
	}

	private static void testSelectByName() {
		List<SaramDto> list = SaramDao.selectByName(new SaramDto(0 , null, "gildon", 0));
		for(SaramDto saram : list) {
			System.out.println(saram);
		}	
	}

	private static void testSetSelectById() {
		SaramDto saram = SaramDao.selectById(new SaramDto(0 , "HONG", null, 0));
		System.out.println(saram.toString());
		
	}

	private static void testDelete() {
		SaramDto dto = new SaramDto(1, null, null, 0);
		SaramDao.delete(dto);
		testSaramSelectAll();
	}

	private static void testUpdate() {
		SaramDto dto = new SaramDto(3, "KIM", "Beomjoon", 45);
		SaramDao.update(dto);
		testSaramSelectAll();
	}

	private static void testInsert() {
		SaramDao.insert(new SaramDto(0, "test1", "name1", 15));
	}

	private static void setSelectOne() {
		SaramDto saram = SaramDao.selectOne(new SaramDto(2, null, null, 0));
		System.out.println(saram.toString());
	}

	private static void testSaramSelectAll() {
		List<SaramDto> list = SaramDao.selectAll();
		for(SaramDto saram : list) {
			System.out.println(saram);
		}
		
	}

}
