package com.mbachaiwala.service;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.mbachaiwala.bean.MBAChaiWalaEntity;
import com.mbachaiwala.dao.MBAChaiWalaRepo;

@SpringBootTest
class MBAChaiWalaServiceImplTest {

	@Autowired
	private MBAChaiWalaRepo mbaChaiWalaRepo;
	

	@Test
	@Disabled
	void saveDataTest() {
		MBAChaiWalaEntity mbaChaiWalaEntity = new MBAChaiWalaEntity();
		mbaChaiWalaEntity.setMilk("Amul Milk");
		mbaChaiWalaEntity.setSuger("Amul Suger");
		mbaChaiWalaEntity.setTeaLeaf("Amazon TeaLeaf");
		mbaChaiWalaEntity.setCardamomPowder("Amazon Cardian Powder");
		MBAChaiWalaEntity save = mbaChaiWalaRepo.save(mbaChaiWalaEntity);
		assertThat(save);
	}
	
	@Test
	void deleteById() {
		int deleteById = mbaChaiWalaRepo.deleteById(28);
		assertThat(deleteById);
		
	}
	
}
