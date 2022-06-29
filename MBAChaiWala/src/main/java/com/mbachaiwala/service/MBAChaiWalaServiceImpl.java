package com.mbachaiwala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.mbachaiwala.bean.FinalResponse;
import com.mbachaiwala.bean.MBAChaiWalaEntity;
import com.mbachaiwala.dao.MBAChaiWalaRepo;

@Service
public class MBAChaiWalaServiceImpl implements MBAChaiWalaService {

	@Autowired
	private MBAChaiWalaRepo mbaChaiWalaRepo;

	@Override
	public FinalResponse save(MBAChaiWalaEntity mbaChaiWala) {
		FinalResponse finalResponse = new FinalResponse();
		try {
			MBAChaiWalaEntity save = mbaChaiWalaRepo.save(mbaChaiWala);
			if (save != null) {
				finalResponse.setData(save);
				finalResponse.setMessage("Data Successfully Send");
				finalResponse.setStatus(true);
			} else {
				finalResponse.setData(save);
				finalResponse.setMessage("Data Not Send");
				finalResponse.setStatus(false);
			}
		} catch (EmptyResultDataAccessException e) {
			finalResponse.setMessage(e.getMessage());
		}
		return finalResponse;
	}

	@Override
	public FinalResponse getByid(int id) {
		FinalResponse finalResponse = new FinalResponse();
		try {
			MBAChaiWalaEntity byId = mbaChaiWalaRepo.getByid(id);
			if (byId != null) {
				finalResponse.setData(byId);
				finalResponse.setMessage("Successfully found");
				finalResponse.setStatus(true);
			} else {
				finalResponse.setData(null);
				finalResponse.setMessage("Data not found ");
				finalResponse.setStatus(false);
			}
		} catch (Exception e) {
			finalResponse.setMessage(e.getMessage());
		}
		return finalResponse;
	}

	@Override
	public FinalResponse updateById(MBAChaiWalaEntity mbaChaiWala, int id) {
		FinalResponse finalResponse = new FinalResponse();

		try {
			int updateById = mbaChaiWalaRepo.updateById(mbaChaiWala, id);
			if (updateById != 0) {
				finalResponse.setData(updateById);
				finalResponse.setMessage("Successfully Update");
				finalResponse.setStatus(true);
			} else {
				finalResponse.setData(null);
				finalResponse.setMessage("Sorry Data is not update !!");
				finalResponse.setStatus(false);
			}
		} catch (Exception e) {
			finalResponse.setMessage(e.getMessage());
		}
		return finalResponse;

	}

	@Override
	public FinalResponse deleteById(int id) {
		FinalResponse finalResponse = new FinalResponse();
		int deleteById = mbaChaiWalaRepo.deleteById(id);
		try {
			if (deleteById != 0) {
				finalResponse.setData(deleteById);
				finalResponse.setMessage("Successfully Delete");
				finalResponse.setStatus(true);
			} else {
				finalResponse.setData(null);
				finalResponse.setMessage("Sorry Data is not Delete !!");
				finalResponse.setStatus(false);
			}
		} catch (Exception e) {
			finalResponse.setData(null);
			finalResponse.setMessage(e.getMessage());
			finalResponse.setStatus(false);
		}
		return finalResponse;
	}

}
