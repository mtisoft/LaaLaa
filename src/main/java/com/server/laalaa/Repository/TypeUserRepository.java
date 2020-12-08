package com.server.laalaa.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.server.laalaa.Model.TypeUser;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface TypeUserRepository extends CrudRepository<TypeUser, Integer> {

}