package com.mbachaiwala.bean;

import lombok.Data;

@Data
public class MBAChaiWalaEntity {

	private int id;
	private String teaLeaf;
	private String milk;
	private String suger;
	private String cardamomPowder;
	
	public MBAChaiWalaEntity(int id) {
		this.id = id;
	}

	public MBAChaiWalaEntity() {
	}
	
	
}
