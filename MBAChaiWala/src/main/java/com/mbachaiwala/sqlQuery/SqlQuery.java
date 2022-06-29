package com.mbachaiwala.sqlQuery;

public class SqlQuery {

//	Insert Data 
	public static final String addData() {
		return "INSERT INTO MBACHAIWALA(id,milk,teaLeaf,suger,cardamomPowder) values(?,?,?,?,?)";		
	}

//	Get All Data
	public static final String getAll() {
		final String GET_ALL_DATA = "SELECT * FROM MBACHAIWALA";
		return GET_ALL_DATA;
	}

//	Delete By id
	public static final String deleteById() {
		final String DELETE_BY_ROUTE = "Delete  FROM MBACHAIWALA WHERE id = ?";
		return DELETE_BY_ROUTE;
	}

//	Update By id
	public static final String updateById() {
		final String UPDATE_DATA_BY_ID = "UPDATE MBACHAIWALA SET milk=?, suger= ? ,teaLeaf = ? , cardamomPowder = ? WHERE id = ?";
		return UPDATE_DATA_BY_ID;
	}

//	Get By Id
	public static String getById() {
		final String GET_BY_ID = "SELECT * FROM MBACHAIWALA WHERE id = ?";
		return GET_BY_ID;
	}
}
