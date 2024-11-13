package com.crud.entity;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Generated(value = "com.example.CodeGenerator", date = "2024-11-13")
public class CrudEntity {

	@Id

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CrudEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CrudEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
