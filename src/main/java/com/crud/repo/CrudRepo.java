package com.crud.repo;

import org.springframework.data.repository.CrudRepository;

import com.crud.entity.CrudEntity;

public interface CrudRepo extends CrudRepository<CrudEntity, Integer>{

}
