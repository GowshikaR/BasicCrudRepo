package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.CrudEntity;
import com.crud.repo.CrudRepo;

@RestController
public class CrudController {

	@Autowired
	private CrudRepo repo;
	
	@PostMapping("/save")
	public String saveMethod(@RequestBody CrudEntity entity) {
		repo.save(entity);
		return "data saved";
	}
	@GetMapping("/get")
	public List<CrudEntity> getMethod() {
		List<CrudEntity> list = (List<CrudEntity>) repo.findAll();
		return list;
	}
}
