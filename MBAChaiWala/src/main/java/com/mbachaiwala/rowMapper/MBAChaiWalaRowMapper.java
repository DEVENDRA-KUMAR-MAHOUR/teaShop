package com.mbachaiwala.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mbachaiwala.bean.MBAChaiWalaEntity;

public class MBAChaiWalaRowMapper implements RowMapper<MBAChaiWalaEntity> {

	@Override
	public MBAChaiWalaEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBAChaiWalaEntity mbaChaiWala = new MBAChaiWalaEntity();
		mbaChaiWala.setId(rs.getInt("id"));
		mbaChaiWala.setTeaLeaf(rs.getString("teaLeaf"));
		mbaChaiWala.setMilk(rs.getString("milk"));
		mbaChaiWala.setSuger(rs.getString("suger"));
		mbaChaiWala.setCardamomPowder(rs.getString("cardamomPowder"));
		return mbaChaiWala;
	}

}
