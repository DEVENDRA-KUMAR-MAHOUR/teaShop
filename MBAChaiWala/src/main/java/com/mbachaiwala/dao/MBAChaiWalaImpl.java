package com.mbachaiwala.dao;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.mbachaiwala.bean.MBAChaiWalaEntity;
import com.mbachaiwala.rowMapper.MBAChaiWalaRowMapper;
import com.mbachaiwala.sqlQuery.SqlQuery;
import com.mbachaiwala.utils.logger.GlobleLogger;

@Repository
public class MBAChaiWalaImpl implements MBAChaiWalaRepo {

	private Logger LOGGER = GlobleLogger.getLogger(MBAChaiWalaImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public com.mbachaiwala.bean.MBAChaiWalaEntity save(com.mbachaiwala.bean.MBAChaiWalaEntity mbaChaiWala) {
		try {
			LOGGER.debug("Save Method is [START] " + mbaChaiWala);
			jdbcTemplate.update(SqlQuery.addData(), mbaChaiWala.getId(), mbaChaiWala.getMilk(),
					mbaChaiWala.getSuger(), mbaChaiWala.getTeaLeaf(), mbaChaiWala.getCardamomPowder());
			return mbaChaiWala;
		} catch (Exception e) {
			LOGGER.error("Sorry data is not save" + e.getMessage());
			return null;
		}
	}

	@Override
	public MBAChaiWalaEntity getByid(int id) {
		try {
			LOGGER.debug("Get By Id Method is [START] " + id);
			return jdbcTemplate.queryForObject(SqlQuery.getById(), new MBAChaiWalaRowMapper(), new Object[] { id });

		} catch (EmptyResultDataAccessException e) {
			LOGGER.error("Get By Id Method is [FAILED] " + e.getMessage());
			return null;
		}
	}

	@Override
	public int updateById(MBAChaiWalaEntity mbaChaiWala, int id) {
		try {
			LOGGER.debug("Update By Id Method is [START] " + mbaChaiWala + id);
			return jdbcTemplate.update(SqlQuery.updateById(), new Object[] { mbaChaiWala.getMilk(),
					mbaChaiWala.getSuger(), mbaChaiWala.getTeaLeaf(), mbaChaiWala.getCardamomPowder(), id });
		} catch (Exception e) {
			LOGGER.error("Get By Id Method is [FAILED] " + e.getMessage());
		}
		return 0;
	}

	@Override
	public int deleteById(int id) {
		try {
			LOGGER.debug("Delete By Id Method is [START] " + id);
			return jdbcTemplate.update(SqlQuery.deleteById(), id);

		} catch (EmptyResultDataAccessException e) {
			LOGGER.error("Get By Id Method is [START] " + e.getMessage());
		}
		return 0;
	}
}
