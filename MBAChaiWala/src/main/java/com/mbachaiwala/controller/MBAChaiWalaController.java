package com.mbachaiwala.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mbachaiwala.bean.FinalResponse;
import com.mbachaiwala.bean.MBAChaiWalaEntity;
import com.mbachaiwala.service.MBAChaiWalaService;
import com.mbachaiwala.utils.logger.GlobleLogger;

@RestController
public class MBAChaiWalaController {

	@Autowired
	private MBAChaiWalaService mbaChaiWalaService;

	private Logger LOGGER = GlobleLogger.getLogger(MBAChaiWalaController.class);

//	Save Data
	@PostMapping("/addDetail")
	public FinalResponse save(@RequestBody MBAChaiWalaEntity mbaChaiWala) {
		LOGGER.debug("Data is Saved " + mbaChaiWala);
		return mbaChaiWalaService.save(mbaChaiWala);
	}

//	Get By Id
	@PostMapping("/find")
	public FinalResponse getById(@RequestBody MBAChaiWalaEntity id) {
		LOGGER.debug("Data is fatch  by id " + id);
		return mbaChaiWalaService.getByid(id.getId());
	}

//	Delete By id
	@PostMapping("/delete")
	public FinalResponse deleteById(@RequestBody MBAChaiWalaEntity id) {
		LOGGER.debug("Data is Delete By id === " + id);
		return mbaChaiWalaService.deleteById(id.getId());
	}

//	Update By id
	@PutMapping("/update/{id}")
	public FinalResponse updateById(@RequestBody MBAChaiWalaEntity mbaChaiWalaEntity, @PathVariable int id) {
		LOGGER.debug("Update Method is [START] " + mbaChaiWalaEntity + id);
		return mbaChaiWalaService.updateById(mbaChaiWalaEntity, id);

	}

}
