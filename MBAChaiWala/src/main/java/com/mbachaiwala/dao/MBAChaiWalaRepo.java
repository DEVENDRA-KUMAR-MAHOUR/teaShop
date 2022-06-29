package com.mbachaiwala.dao;

import com.mbachaiwala.bean.MBAChaiWalaEntity;

public interface MBAChaiWalaRepo {

	public MBAChaiWalaEntity save(MBAChaiWalaEntity mbaChaiWala);

	public MBAChaiWalaEntity getByid(int id);

	public int deleteById(int id);

	int updateById(MBAChaiWalaEntity mbaChaiWala, int id);

}
