package com.nanda.firstrestapi.data.repo;

import org.springframework.data.repository.CrudRepository;

import com.nanda.firstrestapi.data.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
