package com.mbachaiwala.service;

import com.mbachaiwala.bean.FinalResponse;
import com.mbachaiwala.bean.MBAChaiWalaEntity;

public interface MBAChaiWalaService {

	public FinalResponse save(MBAChaiWalaEntity mbaChaiWala);

	FinalResponse getByid(int id);

	FinalResponse deleteById(int id);

	FinalResponse updateById(MBAChaiWalaEntity mbaChaiWala, int id);

}
