package com.server.laalaa.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.server.laalaa.Model.Equipe;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface EquipeRepository extends CrudRepository<Equipe, Integer> {

}
